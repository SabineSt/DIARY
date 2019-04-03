package com.seleni.Diary.data.jpaRepositories;

import com.seleni.Diary.logic.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

/*
    Optional<User> findByUsername(String name);
*/
}



