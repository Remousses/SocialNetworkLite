package com.remousses.social_network_lite.service;

import com.remousses.social_network_lite.model.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> findTest();
    UserDto getById(final Long userId);
}
