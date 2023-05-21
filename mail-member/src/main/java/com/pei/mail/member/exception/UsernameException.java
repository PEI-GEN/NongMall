package com.pei.mail.member.exception;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: 夏沫止水
 * @createTime: 2020-06-27 16:04
 **/
public class UsernameException extends RuntimeException {


    public UsernameException() {
        super("用户名已存在");
    }
}
