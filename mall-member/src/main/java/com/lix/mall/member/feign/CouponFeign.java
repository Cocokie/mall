package com.lix.mall.member.feign;

import com.lix.mall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
public interface CouponFeign {
    @RequestMapping("coupon/coupon/list")
    public R couponList();
}
