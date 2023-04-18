package com.remousses.social_network_lite.model.dto;

import com.remousses.social_network_lite.model.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FriendshipDto {
    private UserDto user;
    private UserDto friend;
}
