package com.finance.dao;

import com.finance.controller.kind;

public interface kindMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(kind record);

    int insertSelective(kind record);

    kind selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(kind record);

    int updateByPrimaryKey(kind record);
}