package com.project.mealmate.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name="users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private Long budget;

    @Column
    private String imageUrl;

    @Builder
    public User(String name,Long budget){
        this.name=name;
        this.budget=budget;
    }

    public void patch(User user) {
        if(user.name!=null)
            this.name=user.getName();
        if(user.budget!=null)
            this.budget=user.getBudget();
    }
}
