package net.example.microservice.userservice.service;

import net.example.microservice.userservice.dto.ResponseDto;
import net.example.microservice.userservice.model.User;

public interface UserService {

    User saveUser(User user);

    ResponseDto getUser(Long userId);
}
