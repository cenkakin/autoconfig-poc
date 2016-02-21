package com.iyzipay.sample.user.repository;

import com.iyzipay.sample.user.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cenkakin
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
