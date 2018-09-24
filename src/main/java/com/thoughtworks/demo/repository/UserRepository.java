package com.thoughtworks.demo.repository;

import com.thoughtworks.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}