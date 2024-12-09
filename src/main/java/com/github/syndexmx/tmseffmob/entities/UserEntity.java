package com.github.syndexmx.tmseffmob.entities;

import com.github.syndexmx.tmseffmob.models.Task;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Builder
@Table(name = "users")
public class UserEntity {

    @Id
    UUID id;

    String email;

    String password;

    Boolean isAdmin;

    List<Task> tasks;

}
