package com.ustc.edu.service;

import com.ustc.edu.mapper.CountryMapper;
import com.ustc.edu.mapper.PrivilegeMapper;
import com.ustc.edu.mapper.RoleMapper;
import com.ustc.edu.mapper.UserMapper;
import com.ustc.edu.model.Country;
import com.ustc.edu.model.Privilege;
import com.ustc.edu.model.Role;
import com.ustc.edu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManageService {
    @Autowired
    private CountryMapper countryMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private PrivilegeMapper privilegeMapper;

    public List<Country> selectAllCountry() {
        return countryMapper.selectAll();
    }

    public List<User> selectAllUser() {
        return userMapper.selectAll();
    }

    public List<Role> selectAllRole() {
        return roleMapper.selectAll();
    }

    public List<Privilege> selectAllPrivilege() {
        return privilegeMapper.selectAll();
    }

    public User selectUserByUserId(long id) {
        return userMapper.selectById(id);
    }

    public int insertUser(User user){
        return userMapper.insert(user);
    }

    public int updateUserById(User user){
        return userMapper.updateById(user);
    }

    public int deleteUserById(User user){
        return userMapper.deleteById(user);
    }
}
