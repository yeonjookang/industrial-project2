package com.project.mealmate.service;

import com.project.mealmate.dto.*;
import com.project.mealmate.entity.Menu;
import com.project.mealmate.entity.Restaurant;
import com.project.mealmate.entity.Review;
import com.project.mealmate.repository.MenuRepository;
import com.project.mealmate.repository.RestaurantRepository;
import com.project.mealmate.repository.ReviewRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;
    private final MenuRepository menuRepository;
    private final ReviewRepository reviewRepository;

    public GetRestaurantByIdResponse getOneById(Long restaurantId) {
        Restaurant restaurant = restaurantRepository.findById(restaurantId).orElseThrow(
                () -> new EntityNotFoundException("식당 정보를 찾을 수 없습니다."));

        List<Menu> menus = menuRepository.findByRestaurantId(restaurantId);

        //MenuDto 리스트와 ReviewDto 리스트로 변환
        List<MenuDto> menuDtos = new ArrayList<>();
        List<ReviewDto> reviewDtos = new ArrayList<>();

        for(Menu menu : menus){
            List<Review> reviews = reviewRepository.findByMenuId(menu.getId());
            menuDtos.add(MenuDto.getMenuDto(menu,reviews.size()));
            for(Review review : reviews){
                reviewDtos.add(ReviewDto.getReviewDto(review));
            }
        }

        return GetRestaurantByIdResponse.getRestaurantByIdResponse(restaurant,menuDtos,reviewDtos);
    }

}
