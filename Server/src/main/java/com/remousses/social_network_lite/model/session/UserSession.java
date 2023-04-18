package com.remousses.social_network_lite.model.session;

import com.remousses.social_network_lite.model.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
//@Component
public class UserSession {
    private String id;
    private UserDto user;
}
