package com.remousses.social_network_lite.model.dto;

import com.remousses.social_network_lite.model.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PostDto {
    private Long id;
    private String content;
    private LocalDate updateDate;
    private UserDto user;
    private StatusDto status;
}
