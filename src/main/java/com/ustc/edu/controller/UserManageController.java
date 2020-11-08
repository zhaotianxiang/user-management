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

@Api("生产者进程API接口")
@RestController
@RequestMapping("/")
public class UserManageController {
    private final static Logger logger = LoggerFactory.getLogger(UserManageService.class);

    @Autowired
    private UserManageService userManageService;

    @ApiOperation(value = "查询城市编码接口")
    @GetMapping("/country")
    public List<Country> displayAllCountry() {
        return userManageService.selectAllCountry();
    }

    @ApiOperation("查询所有用户接口")
    @GetMapping("/user")
    public List<User> displayAllUser() {
        return userManageService.selectAllUser();
    }

    @ApiOperation("查询所有角色信息接口")
    @GetMapping("/role")
    public List<Role> displayAllRole() {
        return userManageService.selectAllRole();
    }

    @ApiOperation("查询所有权限信息接口")
    @GetMapping(value="/privilege")
    public List<Privilege> displayAllPrivilege() {
        return userManageService.selectAllPrivilege();
    }

    @ApiOperation("根据用户编号查询用户信息")
    @GetMapping("/selectUserById/{id}/")
    public User selectUserByIdPathParams(@PathVariable long id) {
        return userManageService.selectUserByUserId(id);
    }

    @ApiOperation("根据URL参数的用户编号获取用户信息")
    @GetMapping("/selectUserById")
    public User selectUserByIdRequestParam(@RequestParam("id") long id) {
        User user = userManageService.selectUserByUserId(id);
        logger.debug("selectUserByIdRequestParam() userId: {} select result: {}", id, user.toString());
        return user;
    }

    @ApiOperation(value = "新增用户信息", notes = "新增用户信息")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @PostMapping("/insert")
    public int insert(@RequestBody User user) {
        return userManageService.insertUser(user);
    }

    @ApiOperation("删除用户信息")
    @DeleteMapping("/delete")
    public int delete(@RequestBody User user) {
        return userManageService.deleteUserById(user);
    }

    @ApiOperation("修改用户信息")
    @PostMapping("/update")
    public int update(@RequestBody  User user) {
        return userManageService.updateUserById(user);
    }
}




