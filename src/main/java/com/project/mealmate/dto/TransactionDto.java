package com.project.mealmate.dto;

import com.project.mealmate.entity.Menu;
import com.project.mealmate.entity.Transaction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class TransactionDto {
    private String menu;
    private String restaurant;
    private Long price;
    private Date date;
}
