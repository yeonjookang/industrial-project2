package com.project.mealmate.dto;

import com.project.mealmate.entity.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class GetRestaurantByIdResponse {
    private Long id;

    private String name;

    private String address;

    private double latitude;

    private double longitude;
    private String image_url;

    private int review_cnt;

    private List<MenuDto> menus;
    private List<ReviewDto> reviews;

    private String information;

    public static GetRestaurantByIdResponse getRestaurantByIdResponse(Restaurant restaurant,List<MenuDto> menus, List<ReviewDto> reviews){
        return new GetRestaurantByIdResponse(
                restaurant.getId(),
                restaurant.getName(),
                restaurant.getAddress(),
                restaurant.getLatitude(),
                restaurant.getLongitude(),
                restaurant.getImageUrl(),
                reviews.size(),
                menus,reviews,
                restaurant.getInformation()
        );
    }
}
