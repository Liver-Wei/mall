package com.liver.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liver.common.utils.PageUtils;
import com.liver.mall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author Liver
 * @email liver@gmail.com
 * @date 2022-10-24 04:00:07
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

