package com.project.mealmate.dto;

import com.project.mealmate.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class UserResponseDto {
    private Long id;
    private String name;
    private Long budget;
    private String image_url;
    private Map<String, List<TransactionDto>> groupedTransactions;

    public static UserResponseDto getUserResponseDto(User user, Map<String, List<TransactionDto>> groupedTransactions) {
        return new UserResponseDto(
                user.getId(),
                user.getName(),
                user.getBudget(),
                user.getImageUrl(),
                groupedTransactions
        );
    }
}
