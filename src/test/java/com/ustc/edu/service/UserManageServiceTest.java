package com.ustc.edu.service;

import com.ustc.edu.model.Country;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserManageServiceTest {
    @Autowired
    UserManageService userManageService;

    @Test
    void selectAllCountry() {
        List<Country> result = userManageService.selectAllCountry();
        Assert.assertNotNull(result);
    }

    @Test
    void selectAllUser() {
    }

    @Test
    void selectUserByUserId() {
    }
}