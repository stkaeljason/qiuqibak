package com.qiuqi.repository;

import com.qiuqi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String > {
    User findByid(String id);
}
