package com.project.mealmate.service;

import com.project.mealmate.dto.GetMenuBySubStringResponse;
import com.project.mealmate.entity.Menu;
import com.project.mealmate.entity.Review;
import com.project.mealmate.repository.MenuRepository;
import com.project.mealmate.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService {
    private final MenuRepository menuRepository;
    private final ReviewRepository reviewRepository;

    public List<GetMenuBySubStringResponse> getMenusBySubString(String menu, String sortBy) {
        Sort sortOption = getSortOption(sortBy);

        List<Menu> menus = getSortedMenus(menu, sortOption);
        List<GetMenuBySubStringResponse> menuDtos = new ArrayList<>();

        for (Menu m : menus) {
            List<Review> reviews = reviewRepository.findByMenuId(m.getId());
            menuDtos.add(GetMenuBySubStringResponse.getMenuBySubStringResponse(m, calculateAverageStars(reviews), reviews.size()));
        }

        return menuDtos;
    }


    private List<Menu> getSortedMenus(String menu, Sort sortOption) {
        if (sortOption.equals(Sort.by("price").ascending())) {
            return menuRepository.findMenusOrderByLowestPrice(menu);
        } else if (sortOption.equals(Sort.by("reviewCount").descending())) {
            return menuRepository.findMenusOrderByReviewCount(menu);
        } else if(sortOption.equals(Sort.by("star").descending())){
            return menuRepository.findMenusOrderByStarCount(menu);
        } else {
            return menuRepository.findMenusOrderByLowestPrice(menu);
        }
    }

    private Sort getSortOption(String sortBy) {
        Sort sortOption;
        switch (sortBy.toLowerCase()){
            case "reviews":
                sortOption=Sort.by("reviewCount").descending();
                break;
            case "stars":
                sortOption=Sort.by("star").descending();
                break;
            case "price":
            default:
                sortOption = Sort.by("price").ascending();
                break;
        }
        return sortOption;
    }

    public Long calculateAverageStars(List<Review> reviews){
        Long totalStars=0L;
        int count=0;
        for(Review review:reviews){
            totalStars+=review.getStars();
            count++;
        }
        Long avr_stars=0L;
        if(count>0)
            avr_stars=totalStars/count;
        return avr_stars;
    }
}
