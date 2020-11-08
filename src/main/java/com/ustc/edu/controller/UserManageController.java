package com.ustc.edu.controller;

import com.ustc.edu.model.Country;
import com.ustc.edu.model.Privilege;
import com.ustc.edu.model.Role;
import com.ustc.edu.model.User;
import com.ustc.edu.service.UserManageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("用户管理接口")
@RestController
@RequestMapping("/")
public class UserManageController {
    private final static Logger logger = LoggerFactory.getLogger(UserManageService.class);

    @Autowired
    private UserManageService userManageService;

    @GetMapping("/country")
    public List<Country> displayAllCountry() {
        return userManageService.selectAllCountry();
    }

    @GetMapping("/user")
    public List<User> displayAllUser() {
        return userManageService.selectAllUser();
    }

    @GetMapping("/role")
    public List<Role> displayAllRole() {
        return userManageService.selectAllRole();
    }

    @GetMapping(value="/privilege")
    public List<Privilege> displayAllPrivilege() {
        return userManageService.selectAllPrivilege();
    }

    @GetMapping("/selectUserById/{id}/")
    public User selectUserByIdPathParams(@PathVariable long id) {
        return userManageService.selectUserByUserId(id);
    }

    @GetMapping("/selectUserById")
    public User selectUserByIdRequestParam(@RequestParam("id") long id) {
        User user = userManageService.selectUserByUserId(id);
        logger.debug("selectUserByIdRequestParam() userId: {} select result: {}", id, user.toString());
        return user;
    }

    @PostMapping("/insert")
    public int insertUser(@RequestBody User user) {
        return userManageService.insertUser(user);
    }

    @DeleteMapping("/delete")
    public int deleteUserByID(@RequestBody User user) {
        return userManageService.deleteUserById(user);
    }

    @PostMapping("/update")
    public int update(@RequestBody  User user) {
        return userManageService.updateUserById(user);
    }
}




