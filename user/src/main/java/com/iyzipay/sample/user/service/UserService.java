package com.iyzipay.sample.user.service;

import com.iyzipay.sample.user.domain.User;

import java.util.Optional;

/**
 * Created by cenkakin
 */
public interface UserService<U extends User> {

    Optional<U> getUserById(Long id);

    U createUser(U user);

    Boolean updateUser(U user);

}
