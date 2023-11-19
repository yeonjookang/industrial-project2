package com.project.mealmate.dto;

import com.project.mealmate.entity.Menu;
import com.project.mealmate.entity.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class ReviewDto {
    private String userName;
    private String menuName;
    private String comment;
    private Long stars;

    public static ReviewDto getReviewDto(Review review){
        return new ReviewDto(
                review.getUser().getName(),
                review.getMenu().getName(),
                review.getComment(),
                review.getStars()
        );
    }
}
