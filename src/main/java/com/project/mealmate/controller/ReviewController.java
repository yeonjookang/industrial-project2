package com.project.mealmate.controller;

import com.project.mealmate.dto.CreateReviewRequestDto;
import com.project.mealmate.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping("/reviews")
    public ResponseEntity<Long> createReview(@RequestBody CreateReviewRequestDto createReviewRequestDto){
        try {
            Long createdId = reviewService.create(createReviewRequestDto);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdId);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
