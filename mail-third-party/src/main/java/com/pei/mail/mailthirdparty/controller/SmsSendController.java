package com.pei.mail.mailthirdparty.controller;

import com.pei.common.utils.R;
import com.pei.mail.mailthirdparty.component.SmsComponent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: PEIGEN
 * @createTime: 2020-06-27 10:04
 **/

@RestController
@RequestMapping(value = "/sms")
public class SmsSendController {

    @Resource
    private SmsComponent smsComponent;

    /**
     * 提供给别的服务进行调用
     * @param phone
     * @param code
     * @return
     */
    @PostMapping(value = "/sendCode")
    public R sendCode(@RequestParam("phone") String phone, @RequestParam("code") String code) {

        //发送验证码
        smsComponent.sendSmsCode(phone,code);

        return R.ok();
    }

}
