package com.ustc.edu.mapper;

import com.ustc.edu.model.RolePrivilege;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolePrivilegeMapper {
    List<RolePrivilege> selectAll();
}
