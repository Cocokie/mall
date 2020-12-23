package com.lix.mall.member.dao;

import com.lix.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lixin
 * @email yt078912@163.com
 * @date 2020-11-10 10:23:29
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
