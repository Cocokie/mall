package com.lix.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import com.lix.mall.common.valid.annotation.ListShowStatus;
import com.lix.mall.common.valid.group.BrandSaveGroup;
import com.lix.mall.common.valid.group.BrandUpdateStatusGroup;
import com.lix.mall.common.valid.group.BrandUpdateGroup;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * 品牌
 *
 * @author lixin
 * @email yt078912@163.com
 * @date 2020-11-10 10:39:07
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    @TableId
    @NotNull(groups = {BrandUpdateGroup.class, BrandUpdateStatusGroup.class})
    @Null(groups = BrandSaveGroup.class)
    private Long brandId;
    /**
     * 品牌名
     */
    @NotBlank(message ="品牌必须提交",groups = BrandSaveGroup.class)
    private String name;
    /**
     * 品牌logo地址
     */
    @URL(message ="logo地址必须合法",groups = {BrandSaveGroup.class,BrandUpdateGroup.class})
	@NotEmpty(groups = BrandSaveGroup.class,message = "品牌logo地址不能为空")
    private String logo;
    /**
     * 介绍
     */
    private String descript;
    /**
     * 显示状态[0-不显示；1-显示]
     */
    @NotNull(groups = {BrandSaveGroup.class, BrandUpdateStatusGroup.class})
    @ListShowStatus(listVals={1,0},groups = BrandSaveGroup.class)
    private Integer showStatus;
    /**
     * 检索首字母
     */
    private String firstLetter;
    /**
     * 排序
     */
    private Integer sort;

}
