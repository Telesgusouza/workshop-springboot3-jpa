package com.gustavo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
