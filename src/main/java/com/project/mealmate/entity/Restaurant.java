package com.project.mealmate.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name="restaurants")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Restaurant{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private double latitude;

    @Column(nullable = false)
    private double longitude;

    @Column
    private String imageUrl;

    @Column
    private String information;

    @Builder
    public Restaurant(String name,String address,float latitude,float longitude,String information){
        this.name=name;
        this.address=address;
        this.latitude=latitude;
        this.longitude=longitude;
        this.information=information;
    }


}
