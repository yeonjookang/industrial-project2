package com.project.mealmate.controller;


import com.project.mealmate.dto.GetRestaurantByIdResponse;
import com.project.mealmate.service.RestaurantService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class RestaurantController {
    private final RestaurantService restaurantService;

    @GetMapping("/restaurants/{restaurantId}")
    public ResponseEntity<GetRestaurantByIdResponse> findRestaurantById(@PathVariable Long restaurantId){
        try {
            GetRestaurantByIdResponse findRestaurant = restaurantService.getOneById(restaurantId);
            return ResponseEntity.status(HttpStatus.OK).body(findRestaurant);
        } catch (EntityNotFoundException e) {
            // EntityNotFoundException 발생 시 BAD_REQUEST(400) 또는 NOT_FOUND(404) 반환
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        } catch (Exception e) {
            // 다른 종류의 예외 발생 시 INTERNAL_SERVER_ERROR(500) 반환
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
