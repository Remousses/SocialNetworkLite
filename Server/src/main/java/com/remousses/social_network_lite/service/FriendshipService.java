package com.remousses.social_network_lite.service;

import com.remousses.social_network_lite.model.dto.FriendshipDto;

import java.util.List;

public interface FriendshipService {
    List<FriendshipDto> getAllByUserId(Long userId);
}
