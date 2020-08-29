package com.wls.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.wls.entity.Position;

public interface PositionMapper extends BaseMapper<Position>{

	/**
	 * 根据PositionNumber查询信息
	 * @param positionNumber
	 * @return
	 */
	Position selectByNumber(Integer positionNumber);
}
