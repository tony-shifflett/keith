package com.rodeo.demo.database.dao;


import com.rodeo.demo.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {

    User findById(Integer id);

    User findByEmailIgnoreCase(String email);
}
