package com.ustc.edu.controller;

import com.ustc.edu.model.Country;
import com.ustc.edu.model.Privilege;
import com.ustc.edu.model.Role;
import com.ustc.edu.model.User;
import com.ustc.edu.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserManageController {
    @Autowired
    private UserManageService userManageService;

    @RequestMapping("/country")
    public List<Country> selectAll() {
        List<Country> result = userManageService.selectAllCountry();
        return result;
    }

    @RequestMapping("/user")
    public List<User> selectAllUser() {
        List<User> result = userManageService.selectAllUser();
        return result;
    }

    @RequestMapping("/findUserById/{id}")
    public List<User> selectUserById(@PathVariable long id) {
        List<User> result = userManageService.selectUserByUserId(id);
        return result;
    }

    @RequestMapping("/role")
    public List<Role> selectAllRole() {
        List<Role> result = userManageService.selectAllRole();
        return result;
    }

    @RequestMapping("/privilege")
    public List<Privilege> selectAllPrivilege() {
        List<Privilege> result = userManageService.selectAllPrivilege();
        return result;
    }
}
