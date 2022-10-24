package com.liver.mall.product.dao;

import com.liver.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Liver
 * @email liver@gmail.com
 * @date 2022-10-24 02:04:21
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
