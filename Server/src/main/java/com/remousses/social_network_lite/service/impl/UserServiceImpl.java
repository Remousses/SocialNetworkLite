package com.remousses.social_network_lite.service.impl;

import com.remousses.social_network_lite.component.ModelMapperCustomize;
import com.remousses.social_network_lite.model.dto.UserDto;
import com.remousses.social_network_lite.model.entity.User;
import com.remousses.social_network_lite.repository.UserRepository;
import com.remousses.social_network_lite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    private ModelMapperCustomize modelMapper;

    @Override
    public List<UserDto> findTest() {
        final List<User> user = userRepository.find();
        return modelMapper.mapList(user, UserDto.class);
    }

    @Override
    public UserDto getById(final Long userId) {
        final Optional<User> user = userRepository.findById(userId);
        return user.map(value -> modelMapper.map(value, UserDto.class)).orElse(null);
    }
}
