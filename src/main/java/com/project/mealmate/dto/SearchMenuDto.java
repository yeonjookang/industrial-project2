package com.project.mealmate.dto;

import com.project.mealmate.entity.Menu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class SearchMenuDto {
    private String name;
    private Long price;

    private Long avr_stars;
    private int cnt_reviews;
    public static SearchMenuDto getSearchMenuDto(Menu menu,Long avr_stars,int cnt_reviews){
        return new SearchMenuDto(
                menu.getName(),
                menu.getPrice(),
                avr_stars,
                cnt_reviews
        );
    }
}
