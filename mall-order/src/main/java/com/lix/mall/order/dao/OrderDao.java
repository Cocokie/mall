package com.lix.mall.order.dao;

import com.lix.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lixin
 * @email yt078912@163.com
 * @date 2020-11-10 10:36:06
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
