package com.example.bookmyshowsst.repositories;

import com.example.bookmyshowsst.models.User;
import jakarta.persistence.OneToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public interface UserRepository extends JpaRepository<User, Long> {


    Optional<User> findByEmail(String email);

    User save(User user);
}
