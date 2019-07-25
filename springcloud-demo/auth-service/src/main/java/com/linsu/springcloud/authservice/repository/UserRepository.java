package com.linsu.springcloud.authservice.repository;

import com.linsu.springcloud.authservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
