package com.xxxy.subject.common.util;


import com.xxxy.subject.common.context.LoginContextHolder;

/**
 * 用户登录util
 *
 * @author: lxj
 * @date: 2023/10/21
 */
public class LoginUtil {

    public static String getLoginId() {
        return LoginContextHolder.getLoginId();
    }


}
