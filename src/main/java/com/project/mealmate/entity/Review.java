package com.project.mealmate.entity;

import com.project.mealmate.dto.CreateReviewRequestDto;
import com.project.mealmate.dto.MenuDto;
import com.project.mealmate.dto.ReviewDto;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name="reviews")
@Entity
public class Review{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String comment;

    @Column(nullable = false)
    private Long stars;

    @ManyToOne
    @JoinColumn(name="menu_id")
    private Menu menu;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public static Review createReview(CreateReviewRequestDto dto, Menu menu, User user){
        if (dto.getMenuId() != menu.getId())
            throw new IllegalArgumentException("리뷰 생성 실패! 메뉴의 id가 잘못됐습니다.");
        if (dto.getUserId() != user.getId())
            throw new IllegalArgumentException("리뷰 생성 실패! 유저의 id가 잘못됐습니다.");
        return new Review(
                dto.getId(),
                dto.getComment(),
                dto.getStars(),
                menu,
                user
        );
    }
}
