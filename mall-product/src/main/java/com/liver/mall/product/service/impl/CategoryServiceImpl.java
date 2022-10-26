package com.liver.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liver.common.utils.PageUtils;
import com.liver.common.utils.Query;

import com.liver.mall.product.dao.CategoryDao;
import com.liver.mall.product.entity.CategoryEntity;
import com.liver.mall.product.service.CategoryService;


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
    public List<CategoryEntity> listWithTree() {
        //1. 查出所有分类
        List<CategoryEntity> categoryEntityList = baseMapper.selectList(null);
        //组装树

        //2. 查出所有一级分类
        List<CategoryEntity> menu = categoryEntityList.stream()
                //查出所有一级分类
                .filter(categoryEntity -> categoryEntity.getCatLevel() == 1)
                //设置一级分类的子分类数据
                .map(parent -> {
                    //getChildren()去查找父id下的所有子分类数据
                    parent.setChildren(getChildren(parent, categoryEntityList));
                    //设置好数据之后返回List
                    return parent;
                })
                //对返回的List排序，通过category的sort字段升序排序
                .sorted((l1, l2) -> l1.getSort() - l2.getSort())
                //返回整理好的数据
                .collect(Collectors.toList());
        return menu;
    }

    private List<CategoryEntity> getChildren(CategoryEntity parent, List<CategoryEntity> categoryEntityList) {
        List<CategoryEntity> categoryEntities = categoryEntityList.stream()
                //在所有分类中找到子id等于父id的数据
                .filter(categoryEntity -> categoryEntity.getParentCid() == parent.getCatId())
                //设置子分类下的子分类数据，递归设置，结束条件(filter)：用自己的id作为父id一直在categoryEntityList查找，找不到自己的id作为父id结束
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildren(categoryEntity, categoryEntityList));
                    return categoryEntity;
                })
                //第一次回溯List为null
                .sorted((c1, c2) -> (c1.getSort() == null ? 0 : c1.getSort()) - (c2.getSort() == null ? 0 : c2.getSort()))
                .collect(Collectors.toList());
        return categoryEntities;
    }

}