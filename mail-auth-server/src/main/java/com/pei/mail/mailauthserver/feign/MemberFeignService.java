package com.pei.mail.mailauthserver.feign;

import com.pei.common.utils.R;
import com.pei.mail.mailauthserver.vo.SocialUser;
import com.pei.mail.mailauthserver.vo.UserLoginVo;
import com.pei.mail.mailauthserver.vo.UserRegisterVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: PEIGEN
 * @createTime: 2020-06-27 17:10
 **/

@FeignClient("mail-member")
public interface MemberFeignService {

    @PostMapping(value = "/member/member/register")
    R register(@RequestBody UserRegisterVo vo);


    @PostMapping(value = "/member/member/login")
    R login(@RequestBody UserLoginVo vo);

    @PostMapping(value = "/member/member/oauth2/login")
    R oauthLogin(@RequestBody SocialUser socialUser) throws Exception;
//
//    @PostMapping(value = "/member/member/weixin/login")
//    R weixinLogin(@RequestParam("accessTokenInfo") String accessTokenInfo);
}
