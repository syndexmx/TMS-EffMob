package com.github.syndexmx.tmseffmob.repositories;

import com.github.syndexmx.tmseffmob.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {

    @Query(value = "SELECT * FROM users u WHERE u.email = ?1 LIMIT 1",
            nativeQuery = true)
    Optional<UserEntity> findByEmail(String email);
}
