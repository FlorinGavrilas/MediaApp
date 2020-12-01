package com.digitalnation.MediaApp.repository;

import com.digitalnation.MediaApp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
