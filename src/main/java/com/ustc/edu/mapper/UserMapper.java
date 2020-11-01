package com.ustc.edu.mapper;

import com.ustc.edu.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> selectAll();
    User selectById(long id);
    int insert(User user);
    int updateById(User user);
    int deleteById(User user);
}
