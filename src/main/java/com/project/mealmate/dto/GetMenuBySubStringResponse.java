package com.project.mealmate.dto;

import com.project.mealmate.entity.Menu;
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
public class GetMenuBySubStringResponse {
    private Long id;

    private String name;

    private Long price;

    private Long avg_str;

    private int review_cnt;

    private String restaurant;

    private String address;

    private double latitude;

    private double longitude;

    public static GetMenuBySubStringResponse getMenuBySubStringResponse(Menu menu,Long avg_str,int review_cnt) {
        return new GetMenuBySubStringResponse(
                menu.getId(),
                menu.getName(),
                menu.getPrice(),
                avg_str,review_cnt,
                menu.getRestaurant().getName(),
                menu.getRestaurant().getAddress(),
                menu.getRestaurant().getLatitude(),
                menu.getRestaurant().getLongitude()
        );
    }
}
