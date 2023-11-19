package com.project.mealmate.repository;

import com.project.mealmate.entity.Restaurant;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
    @Override
    List<Restaurant> findAll();

    @Query(value = "SELECT DISTINCT r.* " +
            "FROM restaurants r " +
            "JOIN menus m ON r.id = m.restaurant_id " +
            "WHERE m.name LIKE %:menu%",
            nativeQuery = true)
    List<Restaurant> findByMenu(@Param("menu") String menu);
}
