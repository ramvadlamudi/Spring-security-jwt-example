package com.spring.jwt.api.repository;

import com.spring.jwt.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("SELECT u FROM User u WHERE u.username = :username")
    User findByUserName(String username);
}
