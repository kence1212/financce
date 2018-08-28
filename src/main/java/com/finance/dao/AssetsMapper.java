package com.finance.dao;

import com.finance.entity.Assets;

public interface AssetsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Assets record);

    int insertSelective(Assets record);

    Assets selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Assets record);

    int updateByPrimaryKey(Assets record);
}