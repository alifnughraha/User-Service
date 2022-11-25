package net.example.microservice.userservice.repository;

import net.example.microservice.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
