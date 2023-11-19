package com.project.mealmate.repository;

import com.project.mealmate.entity.Menu;
import com.project.mealmate.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Long> {
    @Query(value = "SELECT * FROM reviews WHERE menu_id= :menuId",
            nativeQuery = true)
    List<Review> findByMenuId(@Param("menuId") Long menuId);
}
