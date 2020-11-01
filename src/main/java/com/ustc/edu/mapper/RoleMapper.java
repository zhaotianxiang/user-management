package com.ustc.edu.mapper;

import com.ustc.edu.model.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    List<Role> selectAll();
}
