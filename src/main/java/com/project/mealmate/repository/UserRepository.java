package com.project.mealmate.repository;

import com.project.mealmate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    @Override
    List<User> findAll();
}
