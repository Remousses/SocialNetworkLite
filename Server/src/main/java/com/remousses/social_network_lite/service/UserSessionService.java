package com.remousses.social_network_lite.service;

import com.remousses.social_network_lite.model.dto.UserDto;

public interface UserSessionService {
    UserDto updateCurrentSession(final Long userId);
}
