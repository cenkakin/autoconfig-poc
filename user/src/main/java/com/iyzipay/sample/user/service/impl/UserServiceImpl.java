package com.iyzipay.sample.user.service.impl;

import com.iyzipay.sample.user.domain.User;
import com.iyzipay.sample.user.repository.UserRepository;
import com.iyzipay.sample.user.service.UserService;

import java.util.Optional;

/**
 * Created by cenkakin
 */
public class UserServiceImpl implements UserService<User> {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return Optional.ofNullable(userRepository.findOne(id));
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public Boolean updateUser(User user) {
        return null;
    }

}
