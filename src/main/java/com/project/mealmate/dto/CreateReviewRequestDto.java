package com.project.mealmate.dto;


import com.project.mealmate.entity.Review;
import com.project.mealmate.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CreateReviewRequestDto {
    private Long id;
    private Long userId;
    private Long menuId;
    private String comment;
    private Long stars;

    public static CreateReviewRequestDto createReviewRequestDto(Review review){
        return new CreateReviewRequestDto(
                review.getId(),
                review.getUser().getId(),
                review.getMenu().getId(),
                review.getComment(),
                review.getStars()
        );
    }
}
