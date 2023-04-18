package com.remousses.social_network_lite.service.impl;

import com.remousses.social_network_lite.model.dto.UserDto;
import com.remousses.social_network_lite.model.session.UserSession;
import com.remousses.social_network_lite.service.UserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.context.SecurityContextHolderStrategy;
import org.springframework.stereotype.Service;

@Service
public class UserSessionServiceImpl implements UserSessionService {

//    @Autowired
//    UserSession userSession;

    @Autowired
    UserServiceImpl userService;

    private UserSession userSession;

//    @Autowired
//    AuthenticationManager authenticationManager;
//
//    private final SecurityContextHolderStrategy securityContextHolderStrategy = SecurityContextHolder.getContextHolderStrategy();

//    private SecurityContextRepository securityContextRepository = new HttpSessionSecurityContextRepository();

    @Override
    public UserDto updateCurrentSession(final Long userId) {

            System.out.println("userSession " + userSession);
//        if (userSession.getId()) {
//
//        }
        userSession = new UserSession("2343", userService.getById(userId));

//        final UserDto userDto = userService.getById(userId);

//        UsernamePasswordAuthenticationToken token = UsernamePasswordAuthenticationToken.unauthenticated(
//                userDto.getPassword(), userDto.getPassword());
//        Authentication authentication = authenticationManager.authenticate(token);
//        SecurityContext context = SecurityContextHolder.createEmptyContext();
//        context.setAuthentication(authentication);
//        securityContextHolderStrategy.setContext(context);
////        securityContextRepository.saveContext(context, request, response);

//        System.out.println(authentication);

        return userSession.getUser();
    }
}
