package com.project.mealmate.controller;

import com.project.mealmate.dto.GetMenuBySubStringResponse;
import com.project.mealmate.service.MenuService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MenuController {
    private final MenuService menuService;

    @GetMapping("/menus/search/{menu}")
    public ResponseEntity<List<GetMenuBySubStringResponse>> findMenusBySubString(@PathVariable String menu,
                                                                                  @RequestParam(required = false, defaultValue = "price") String sortBy){
        try {
            List<GetMenuBySubStringResponse> findRestaurants = menuService.getMenusBySubString(menu,sortBy);
            return ResponseEntity.status(HttpStatus.OK).body(findRestaurants);
        } catch (EntityNotFoundException e) {
            // EntityNotFoundException 발생 시 BAD_REQUEST(400) 또는 NOT_FOUND(404) 반환
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        } catch (Exception e) {
            // 다른 종류의 예외 발생 시 INTERNAL_SERVER_ERROR(500) 반환
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
