package com.github.syndexmx.tmseffmob.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {

    UUID id;
    String email;
    String password;
    String passwordSolt;
    Boolean isAdmin;

}
