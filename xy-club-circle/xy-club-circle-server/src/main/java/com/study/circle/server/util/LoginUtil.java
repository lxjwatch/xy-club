package com.study.circle.server.util;

import com.study.circle.server.config.context.LoginContextHolder;

/**
 * 用户登录util
 *
 * @author: lxj
 * @date: 2023/11/26
 */
public class LoginUtil {

    public static String getLoginId() {
        return LoginContextHolder.getLoginId();
    }


}
