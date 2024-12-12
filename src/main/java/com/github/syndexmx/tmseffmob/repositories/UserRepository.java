package com.github.syndexmx.tmseffmob.repositories;

import com.github.syndexmx.tmseffmob.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {

    @Query(value = "SELECT COUNT(*) FROM users u WHERE u.email = ?1",
            nativeQuery = true)
    int countExistsByEmail(String email);
}
