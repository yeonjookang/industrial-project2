package com.project.mealmate.service;

import com.project.mealmate.dto.CreateReviewRequestDto;
import com.project.mealmate.entity.Menu;
import com.project.mealmate.entity.Review;
import com.project.mealmate.entity.User;
import com.project.mealmate.repository.MenuRepository;
import com.project.mealmate.repository.ReviewRepository;
import com.project.mealmate.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final MenuRepository menuRepository;
    private final UserRepository userRepository;

    public Long create(CreateReviewRequestDto createReviewRequestDto) {
       Menu menu= menuRepository.findById(createReviewRequestDto.getMenuId())
               .orElseThrow(()->new EntityNotFoundException("리뷰 생성 실패! 대상 메뉴가 없습니다."));
       User user = userRepository.findById(createReviewRequestDto.getUserId())
               .orElseThrow(()->new EntityNotFoundException("리뷰 생성 실패! 대상 유저가 없습니다."));
        Review review = Review.createReview(createReviewRequestDto, menu, user);
        Long createdId = reviewRepository.save(review).getId();
        return createdId;
    }
}
