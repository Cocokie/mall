package com.lix.mall.coupon.dao;

import com.lix.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lixin
 * @email yt078912@163.com
 * @date 2020-11-10 10:17:39
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
