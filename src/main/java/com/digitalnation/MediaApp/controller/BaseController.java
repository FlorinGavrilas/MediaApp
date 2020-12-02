package com.digitalnation.MediaApp.controller;

import com.digitalnation.MediaApp.model.Provider;
import com.digitalnation.MediaApp.model.ServiceProvided;
import com.digitalnation.MediaApp.model.User;
import com.digitalnation.MediaApp.repository.ProviderRepository;
import com.digitalnation.MediaApp.repository.ServiceProvidedRepository;
import com.digitalnation.MediaApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Service
@Controller
public class BaseController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProviderRepository providerRepository;

    @Autowired
    private ServiceProvidedRepository serviceProvidedRepository;

    @RequestMapping("/home")
    public String index() {
        return "redirect:";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/users")
    public String users(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "users";
    }

    @GetMapping("/addUser")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "addUser";
    }

    @PostMapping("/createUser")
    public String createUser(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        userRepository.save(user);
        return "redirect:users";
    }

    @GetMapping("/providers")
    public String providers(Model model) {
        model.addAttribute("providers", providerRepository.findAll());
        return "providers";
    }

    @GetMapping("/addProvider")
    public String addProvider(Model model) {
        model.addAttribute("provider", new Provider());
        return "addProvider";
    }

    @PostMapping("/createProvider")
    public String createProvider(@ModelAttribute Provider provider, Model model) {
        model.addAttribute("provider", provider);
        provider.setRating(0d);
        providerRepository.save(provider);
        return "redirect:providers";
    }

    @GetMapping("/provider/{idProvider}")
    @ResponseBody
    public Optional<Provider> provider(@PathVariable Long idProvider) {
        return providerRepository.findById(idProvider);
    }

    @GetMapping("/servicesProvided")
    public String services(Model model) {
        model.addAttribute("servicesProvided", serviceProvidedRepository.findAll());
        return "servicesProvided";
    }

    @GetMapping("/addService")
    public String addService(Model model) {
        model.addAttribute("serviceProvided", new ServiceProvided());
        return "addService";
    }

    @PostMapping("/createService")
    public String createService(@ModelAttribute ServiceProvided service, Model model) {
        model.addAttribute("serviceProvided", service);
        serviceProvidedRepository.save(service);
        return "redirect:servicesProvided";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }
}
