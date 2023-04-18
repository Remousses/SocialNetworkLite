package com.remousses.social_network_lite.service.impl;

import com.remousses.social_network_lite.component.ModelMapperCustomize;
import com.remousses.social_network_lite.model.dto.FriendshipDto;
import com.remousses.social_network_lite.model.dto.UserDto;
import com.remousses.social_network_lite.model.entity.Friendship;
import com.remousses.social_network_lite.model.entity.User;
import com.remousses.social_network_lite.repository.FriendshipRepository;
import com.remousses.social_network_lite.service.FriendshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FriendshipServiceImpl implements FriendshipService {

    @Autowired
    UserSessionServiceImpl userSessionService;

//    @Autowired
//    UserSession userSession;

    @Autowired
    UserServiceImpl userService;

    @Autowired
    FriendshipRepository friendshipRepository;

    @Autowired
    private ModelMapperCustomize modelMapper;

    @Override
    public List<FriendshipDto> getAllByUserId(final Long userId) {
//            final UserDto userDto = modelMapper.map(user.get(), UserDto.class);
        final UserDto userDto = userSessionService.updateCurrentSession(userId);
        final User user = modelMapper.map(userDto, User.class);
        final List<Friendship> friends = friendshipRepository.findByUser(userId);
        return modelMapper.mapList(friends, FriendshipDto.class);
    }
}
