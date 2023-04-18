package com.remousses.social_network_lite.controller;

import com.remousses.social_network_lite.model.dto.FriendshipDto;
import com.remousses.social_network_lite.service.impl.FriendshipServiceImpl;
import com.remousses.social_network_lite.service.impl.UserSessionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/friendship")
@RestController
public class FriendshipController {

    @Autowired
    UserSessionServiceImpl userSessionService;

    @Autowired
    FriendshipServiceImpl friendshipService;

    @GetMapping("/{userId}")
    public List<FriendshipDto> getAllByUserId(@PathVariable final Long userId) {
        return friendshipService.getAllByUserId(userId);
    }

}
