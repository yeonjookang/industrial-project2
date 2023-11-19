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
public class MenuDto {
    private Long id;
    private String name;
    private Long price;

    private int cnt_reviews;
    public static MenuDto getMenuDto(Menu menu,int cnt_reviews){
        return new MenuDto(
                menu.getId(),
                menu.getName(),
                menu.getPrice(),
                cnt_reviews
        );
    }
}
