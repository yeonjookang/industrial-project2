package com.project.mealmate.repository;

import com.project.mealmate.dto.TransactionDto;
import com.project.mealmate.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    @Query("SELECT new com.project.mealmate.dto.TransactionDto(m.name, r.name, m.price, t.date) " +
            "FROM Transaction t " +
            "JOIN t.menu m " +
            "JOIN m.restaurant r " +
            "WHERE t.user.id = :userId " +
            "AND t.date BETWEEN CURRENT_DATE - 7 AND CURRENT_DATE")
    List<TransactionDto> findByUserId(Long userId);
}
