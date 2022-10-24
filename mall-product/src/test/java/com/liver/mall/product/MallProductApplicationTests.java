package com.liver.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liver.mall.product.entity.BrandEntity;
import com.liver.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("华为");
//
//        boolean save = brandService.save(brandEntity);
//        System.out.println(save+"成功");
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("小米");
//        brandEntity.setBrandId(1L);
//        brandService.updateById(brandEntity);
        QueryWrapper<BrandEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("brand_id",1L);
        BrandEntity one = brandService.getOne(queryWrapper);
        System.out.println(one.toString());
    }





}
