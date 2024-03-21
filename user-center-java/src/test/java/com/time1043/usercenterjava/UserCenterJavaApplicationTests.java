package com.time1043.usercenterjava;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootTest
class UserCenterJavaApplicationTests {

    @Test
    void test() throws NoSuchAlgorithmException {
        // 测试加密 spring加密的工具类 简单加盐
        String newPassword = DigestUtils.md5DigestAsHex(("123456" + "salt").getBytes());
        System.out.println(newPassword);  // 207acd61a3c1bd506d7e9a4535359f8a
    }

    @Test
    void contextLoads() {
    }

}
