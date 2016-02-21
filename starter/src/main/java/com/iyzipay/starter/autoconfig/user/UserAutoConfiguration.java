package com.iyzipay.starter.autoconfig.user;

import com.iyzipay.sample.user.repository.UserRepository;
import com.iyzipay.sample.user.service.UserService;
import com.iyzipay.sample.user.service.impl.UserServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import javax.persistence.EntityManager;

/**
 * Created by cenkakin
 */

@ConditionalOnClass(UserService.class)
@Configuration
public class UserAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(UserService.class)
    public UserServiceImpl userService(UserRepository repository) {
        return new UserServiceImpl(repository);
    }

}
