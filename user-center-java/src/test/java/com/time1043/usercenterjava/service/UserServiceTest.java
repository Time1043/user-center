package com.time1043.usercenterjava.service;

import com.time1043.usercenterjava.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


/*
 * 用户服务测试
 *
 * @author yingzhu
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("yingzhu");
        user.setUserAccount("yingzhu");
        user.setAvatarUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4x04v80EHkp_6zoMIc_hG0L8_QvDlvjC-fw&usqp=CAU");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("123");
        user.setEmail("456");

        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

    @Test
    void userRegister() {
        String userAccount = "yingzhu2";
        String checkPassword = "123456";

        // 非空检验
        String userPassword = "";
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        // 账户长度不小于4
        userAccount = "yz";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        // 密码长度不小于8
        userAccount = "yingzhu2";
        userPassword = "123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        // 账户不包含特殊字符
        userAccount = "yingzhu2#";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        // 账户名不能重复
        userAccount = "yingzhu";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        // 密码和校验密码不一致
        userAccount = "yingzhu2";
        userPassword = "12345678";
        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        // 成功的
        userAccount = "yingzhu2";
        userPassword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertTrue(result > 0);

    }
}