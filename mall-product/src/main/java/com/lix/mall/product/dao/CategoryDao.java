package com.lix.mall.product.dao;

import com.lix.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lixin
 * @email yt078912@163.com
 * @date 2020-11-10 10:39:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
