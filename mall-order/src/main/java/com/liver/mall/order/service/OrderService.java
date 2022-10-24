package com.liver.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liver.common.utils.PageUtils;
import com.liver.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author Liver
 * @email liver@gmail.com
 * @date 2022-10-24 04:00:07
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

