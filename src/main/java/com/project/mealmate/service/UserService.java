package com.project.mealmate.service;

import com.project.mealmate.DateFormatter;
import com.project.mealmate.dto.TransactionDto;
import com.project.mealmate.dto.UserResponseDto;
import com.project.mealmate.entity.Transaction;
import com.project.mealmate.entity.User;
import com.project.mealmate.repository.TransactionRepository;
import com.project.mealmate.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.TreeMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final TransactionRepository transactionRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public UserResponseDto getOneById(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("유저 정보를 찾을 수 없습니다."));

        List<TransactionDto> transactionsDtos = transactionRepository.findByUserId(user.getId());
        Map<String, List<TransactionDto>> groupedTransactions = groupTransactionsByFormattedDate(transactionsDtos);

        return UserResponseDto.getUserResponseDto(user, groupedTransactions);
    }

    public Map<String, List<TransactionDto>> groupTransactionsByFormattedDate(List<TransactionDto> transactions) {
        // TreeMap을 사용하여 결과를 자동으로 날짜 순으로 정렬합니다.
        return transactions.stream()
                .collect(Collectors.groupingBy(
                        t -> DateFormatter.formatDate(t.getDate()),
                        TreeMap::new, // 날짜별로 정렬하기 위한 TreeMap 사용
                        Collectors.toList()));
    }
}
