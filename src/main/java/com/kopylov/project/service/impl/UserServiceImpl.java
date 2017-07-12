package com.kopylov.project.service.impl;

import com.kopylov.project.entity.User;
import com.kopylov.project.repository.UserRepository;
import com.kopylov.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Transactional
    public void addUser(User user){
        userRepository.saveAndFlush(user);
    }
}
