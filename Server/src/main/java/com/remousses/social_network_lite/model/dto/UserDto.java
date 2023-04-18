package com.remousses.social_network_lite.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String pseudo;
    private String email;
    private String country;
    private LocalDate birthDate;
    private String password;
    private boolean active;
    private List<FriendshipDto> friendshipList;
}
