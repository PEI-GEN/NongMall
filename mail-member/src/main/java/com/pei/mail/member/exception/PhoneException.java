package com.pei.mail.member.exception;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: PEIGEN
 * @createTime: 2020-06-27 16:04
 **/
public class PhoneException extends RuntimeException {

    public PhoneException() {
        super("手机号已存在");
    }
}
