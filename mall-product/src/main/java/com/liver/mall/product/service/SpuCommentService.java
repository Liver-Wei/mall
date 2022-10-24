package com.liver.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liver.common.utils.PageUtils;
import com.liver.mall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author Liver
 * @email liver@gmail.com
 * @date 2022-10-24 02:04:21
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

