package com.study.interview.server.util;

import com.study.interview.server.config.context.LoginContextHolder;

/**
 * 用户登录util
 *
 * @author: ChickenWing
 * @date: 2023/11/26
 */
public class LoginUtil {

    public static String getLoginId() {
        return LoginContextHolder.getLoginId();
    }


}