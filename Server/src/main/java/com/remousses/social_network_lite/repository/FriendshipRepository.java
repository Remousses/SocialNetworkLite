package com.remousses.social_network_lite.repository;

import com.remousses.social_network_lite.model.entity.Friendship;
import com.remousses.social_network_lite.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FriendshipRepository extends JpaRepository<Friendship, Long> {
//    List<Friendship> findByUser(User user);
    @Query("Select new Friendship(:userId) from Friendship")
    List<Friendship> findByUser(@Param("userId") Long userId);
}