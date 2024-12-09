package com.github.syndexmx.tmseffmob.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "users")
public class UserEntity {

    @Id
    UUID id;

    String email;

    String password;

    String passwordSolt;

    Boolean isAdmin;

}
