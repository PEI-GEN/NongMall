package com.pei.mail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pei.common.utils.PageUtils;
import com.pei.mail.member.entity.MemberEntity;
import com.pei.mail.member.exception.PhoneException;
import com.pei.mail.member.exception.UsernameException;
import com.pei.mail.member.vo.MemberUserLoginVo;
import com.pei.mail.member.vo.MemberUserRegisterVo;
import com.pei.mail.member.vo.SocialUser;

import java.util.Map;

/**
 * 会员
 *
 * @author PEIGEN
 * @email PEIGEN@163.com
 * @date 2023-03-07 20:50:16
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void register(MemberUserRegisterVo vo);

    /**
     * 判断手机号是否重复
     * @param phone
     * @return
     */
    void checkPhoneUnique(String phone) throws PhoneException;

    /**
     * 判断用户名是否重复
     * @param userName
     * @return
     */
    void checkUserNameUnique(String userName) throws UsernameException;

    MemberEntity login(MemberUserLoginVo vo);

    MemberEntity login(SocialUser socialUser) throws Exception;
}

