package com.project.mealmate.controller;

import com.project.mealmate.dto.UserResponseDto;
import com.project.mealmate.entity.User;
import com.project.mealmate.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> findUsers(){
        List<User> users = userService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<UserResponseDto> findUser(@PathVariable Long userId){
        try {
            UserResponseDto findUser = userService.getOneById(userId);
            return ResponseEntity.status(HttpStatus.OK).body(findUser);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
