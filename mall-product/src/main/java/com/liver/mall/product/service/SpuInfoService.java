package com.liver.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liver.common.utils.PageUtils;
import com.liver.mall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author Liver
 * @email liver@gmail.com
 * @date 2022-10-24 02:04:21
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

