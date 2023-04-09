package com.pei.mail.member.dao;

import com.pei.mail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author PEIGEN
 * @email PEIGEN@163.com
 * @date 2023-03-07 20:50:16
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
