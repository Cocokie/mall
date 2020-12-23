package com.lix.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lix.mall.common.utils.PageUtils;
import com.lix.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author lixin
 * @email yt078912@163.com
 * @date 2020-11-10 10:23:29
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

