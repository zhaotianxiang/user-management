package com.ustc.edu.service;

import com.ustc.edu.model.Country;
import com.ustc.edu.model.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserManageServiceTest {
    @Autowired
    private UserManageService userManageService;
    private User testUser;

    public UserManageServiceTest() {
        testUser = new User();
        testUser.setUserName("zhaotx");
        testUser.setUserPassword("123456");
        testUser.setUserEmail("904001993@qq.com");
        testUser.setUserInfo("what are you doing");
        testUser.setHeadImg(new byte[]{1, 2, 3});
        testUser.setCreateTime(new Date());
    }

    @Test
    void selectAllCountry() {
        List<Country> result = userManageService.selectAllCountry();
        Assert.assertNotNull(result);
    }

    @Test
    void selectAllUser() {
        List<User> result = userManageService.selectAllUser();
        Assert.assertNotNull(result);
    }

    @Test
    void selectUserByUserId() {
        User user = userManageService.selectUserByUserId(1);
        Assert.assertNotNull(user);
    }

    @Test
    @Transactional
    void insertUser() {
        int result = userManageService.insertUser(testUser);
        Assert.assertEquals(1, result);
    }

    @Test
    @Transactional
    void updateUserById() {
        User user = userManageService.selectUserByUserId(1L);
        user.setUserInfo("I am admin");
        int result = userManageService.updateUserById(user);
        Assert.assertEquals(1, result);
    }

    @Test
    @Transactional
    void deleteUserById() {
        userManageService.insertUser(testUser);
        int result = userManageService.deleteUserById(testUser);
        Assert.assertEquals(1, result);
    }
}