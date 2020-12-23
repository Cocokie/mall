package com.lix.mall.product;

import com.lix.mall.product.entity.BrandEntity;
import com.lix.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("天地绝杀霸主");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
