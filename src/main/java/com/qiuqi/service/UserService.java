package com.qiuqi.service;

import com.qiuqi.model.User;
import com.qiuqi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public User update(String id, User user) {
        User userInstance = userRepository.findByid(id);
        BeanUtils.copyProperties(user, userInstance);
        return userRepository.save(userInstance);
    }
}