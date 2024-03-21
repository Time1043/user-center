package com.time1043.usercenterjava.service;

import com.time1043.usercenterjava.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yingzhu
 * @description 针对表【user】的数据库操作Service
 * @createDate 2024-03-21 09:37:23
 */
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 注册成功返回用户ID，失败返回0
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 返回脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);
}
