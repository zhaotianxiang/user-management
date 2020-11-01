package com.ustc.edu.controller;

import com.ustc.edu.model.Country;
import com.ustc.edu.model.Privilege;
import com.ustc.edu.model.Role;
import com.ustc.edu.model.User;
import com.ustc.edu.service.UserManageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserManageController {
    private final static Logger logger = LoggerFactory.getLogger(UserManageService.class);

    @Autowired
    private UserManageService userManageService;

    @RequestMapping("/country")
    public List<Country> displayAllCountry() {
        return userManageService.selectAllCountry();
    }

    @RequestMapping("/user")
    public List<User> displayAllUser() {
        return userManageService.selectAllUser();
    }

    @RequestMapping("/role")
    public List<Role> displayAllRole() {
        return userManageService.selectAllRole();
    }

    @RequestMapping("/privilege")
    public List<Privilege> displayAllPrivilege() {
        return userManageService.selectAllPrivilege();
    }

    @RequestMapping(value = "/selectUserById/{id}/", method = RequestMethod.GET)
    public User selectUserByIdPathParams(@PathVariable long id) {
        return userManageService.selectUserByUserId(id);
    }

    @RequestMapping(value = "/selectUserById", method = RequestMethod.GET)
    public User selectUserByIdRequestParam(@RequestParam("id") long id) {
        User user = userManageService.selectUserByUserId(id);
        logger.debug("selectUserByIdRequestParam() userId: {} select result: {}", id, user.toString());
        return user;
    }
}
