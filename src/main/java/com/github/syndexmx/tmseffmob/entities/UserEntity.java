package com.github.syndexmx.tmseffmob.entities;

import com.github.syndexmx.tmseffmob.models.Task;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
@Table(name = "users")
public class UserEntity {

    @Id
            @Column(name = "user_id")
    UUID id;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;

    @Column(name = "is_admin")
    Boolean isAdmin;

    @OneToMany
            @JoinColumn(name = "id")
    List<TaskEntity> tasks;

}
