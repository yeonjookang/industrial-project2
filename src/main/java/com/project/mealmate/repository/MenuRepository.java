package com.project.mealmate.repository;

import com.project.mealmate.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu,Long> {
    @Query(value = "SELECT * FROM menus WHERE restaurant_id= :restaurantId",
            nativeQuery = true)
    List<Menu> findByRestaurantId(@Param("restaurantId") Long restaurantId);

    @Query(value = "SELECT * FROM menus WHERE name LIKE %:menu% ORDER BY price ASC", nativeQuery = true)
    List<Menu> findMenusOrderByLowestPrice(String menu);

    @Query(value = "SELECT m.*, COUNT(rv.id) as total_reviews " +
            "FROM menus m " +
            "LEFT JOIN reviews rv ON m.id = rv.menu_id " +
            "GROUP BY m.id " +
            "ORDER BY total_reviews DESC",
            nativeQuery = true)
    List<Menu> findMenusOrderByReviewCount(String menu);


    @Query(value = "SELECT m.*, AVG(rv.stars) as average_rating " +
            "FROM menus m " +
            "LEFT JOIN reviews rv ON m.id = rv.menu_id " +
            "GROUP BY m.id " +
            "ORDER BY average_rating DESC",
            nativeQuery = true)
    List<Menu> findMenusOrderByStarCount(String menu);
}
