package com.liver.mall.coupon.dao;

import com.liver.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Liver
 * @email liver@gmail.com
 * @date 2022-10-24 03:44:53
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
