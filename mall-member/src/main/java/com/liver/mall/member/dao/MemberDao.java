package com.liver.mall.member.dao;

import com.liver.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Liver
 * @email liver@gmail.com
 * @date 2022-10-24 03:53:48
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
