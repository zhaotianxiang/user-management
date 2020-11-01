package com.ustc.edu.mapper;

import com.ustc.edu.model.Privilege;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrivilegeMapper {
    List<Privilege> selectAll();
}
