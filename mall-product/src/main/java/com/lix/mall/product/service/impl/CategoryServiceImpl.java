package com.lix.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lix.mall.common.utils.PageUtils;
import com.lix.mall.common.utils.Query;

import com.lix.mall.product.dao.CategoryDao;
import com.lix.mall.product.entity.CategoryEntity;
import com.lix.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public void removeMenusByIds(Long[] catIds) {
        //todo 可能需要判断
        this.removeByIds(Arrays.asList(catIds));
    }

    @Override
    public List<CategoryEntity> treeList() {
        List<CategoryEntity> list = baseMapper.selectList(null);
        List<CategoryEntity> collect = list.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map(menu -> {
                    menu.setChildren(setChildren(menu, list));
                    return menu;
                }).sorted((sort1,sort2)->{return
                        (sort1.getSort()==null?0:sort1.getSort())-(sort2.getSort()==null?0:sort2.getSort());
                }).collect(Collectors.toList());
        return collect;
    }

    private List<CategoryEntity> setChildren(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> collect = all.stream().filter(categoryEntity -> {return root.getCatId().equals(categoryEntity.getParentCid());})
                .map(categoryEntity -> {
                    categoryEntity.setChildren(setChildren(categoryEntity, all));
                    return categoryEntity;
                }).sorted((sort1,sort2)->{return
                        (sort1.getSort()==null?0:sort1.getSort())-(sort2.getSort()==null?0:sort2.getSort());
                }).collect(Collectors.toList());
        return collect;
    }
}