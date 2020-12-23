package com.lix.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lix.mall.common.utils.PageUtils;
import com.lix.mall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author lixin
 * @email yt078912@163.com
 * @date 2020-11-10 10:17:39
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

