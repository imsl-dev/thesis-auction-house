package com.ps.auction.house.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name="users")
@Data
public class UserEntity {
    @Id
    private Long id;
}
