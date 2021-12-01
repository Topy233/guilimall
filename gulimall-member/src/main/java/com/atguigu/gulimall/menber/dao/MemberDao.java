package com.atguigu.gulimall.menber.dao;

import com.atguigu.gulimall.menber.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wei
 * @email 
 * @date 2021-11-28 21:01:48
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
