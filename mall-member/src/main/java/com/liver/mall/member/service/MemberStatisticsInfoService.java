package com.liver.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liver.common.utils.PageUtils;
import com.liver.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author Liver
 * @email liver@gmail.com
 * @date 2022-10-24 03:53:48
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

