package com.akash.userservice.repositories;

import com.akash.userservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    @Query("SELECT u FROM User u WHERE u.eMail = ?1")
//    Optional<User> findByEMail(String eMail);

//    @Query("SELECT u FROM User u WHERE u.eMail = ?1")
//    Optional<User> findByEmail(String username);

    Optional<User> findByEmail(String email);
}
