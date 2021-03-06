package com.lix.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lix.mall.common.utils.PageUtils;
import com.lix.mall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author lixin
 * @email yt078912@163.com
 * @date 2020-11-10 10:39:07
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

