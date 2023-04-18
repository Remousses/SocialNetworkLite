package com.remousses.social_network_lite.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CommentDto {
    private Long id;
    private String comment;
    private LocalDate updateDate;
    private UserDto user;
    private PostDto post;
    private StatusDto status;
}
