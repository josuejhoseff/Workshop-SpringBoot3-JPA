package com.educand.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educand.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
