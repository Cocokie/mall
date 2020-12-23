package com.lix.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lix.mall.common.utils.PageUtils;
import com.lix.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author lixin
 * @email yt078912@163.com
 * @date 2020-11-10 10:36:06
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

