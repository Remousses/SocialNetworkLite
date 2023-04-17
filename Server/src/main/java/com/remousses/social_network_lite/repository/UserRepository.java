package com.remousses.social_network_lite.repository;

import com.remousses.social_network_lite.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT new User(u.firstName, u.lastName) FROM User u")
    List<User> findTest();

    @Query(value = "SELECT u FROM User u")
    List<User> find();
}