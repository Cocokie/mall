package com.lix.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lix.mall.common.utils.PageUtils;
import com.lix.mall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author lixin
 * @email yt078912@163.com
 * @date 2020-11-10 10:39:07
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

