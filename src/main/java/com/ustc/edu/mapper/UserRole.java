package com.ustc.edu.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRole {
    List<UserRole> selectAll();
}
