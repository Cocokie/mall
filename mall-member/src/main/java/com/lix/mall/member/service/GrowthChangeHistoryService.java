package com.lix.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lix.mall.common.utils.PageUtils;
import com.lix.mall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author lixin
 * @email yt078912@163.com
 * @date 2020-11-10 10:23:29
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

