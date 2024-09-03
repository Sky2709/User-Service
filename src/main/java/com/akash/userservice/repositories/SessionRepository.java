package com.akash.userservice.repositories;

import com.akash.userservice.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long>{

    @Query("SELECT s FROM Session s WHERE s.token = :token AND s.user.id = :userId")
    Optional<Session> findByTokenAndUser_Id(String token, Long userId);
}
