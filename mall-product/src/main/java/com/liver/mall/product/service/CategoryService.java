package com.liver.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liver.common.utils.PageUtils;
import com.liver.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author Liver
 * @email liver@gmail.com
 * @date 2022-10-24 02:04:21
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);
}

