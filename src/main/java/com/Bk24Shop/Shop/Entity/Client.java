package com.Bk24Shop.Shop.entity;

import com.Bk24Shop.Shop.enums.EClientType;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @Enumerated(EnumType.STRING)
    private EClientType clientType; //Organisation,Individual

    private String name;

    private String address;

    private double latitude;
    private double longitude;

    // Getters and setters
}

