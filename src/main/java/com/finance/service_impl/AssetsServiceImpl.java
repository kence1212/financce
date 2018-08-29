package com.finance.service_impl;

import com.finance.dao.AssetsMapper;
import com.finance.entity.Assets;
import com.finance.service.AssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("assetsService")
public class AssetsServiceImpl implements AssetsService {

    @Autowired
    private AssetsMapper assetsMapper;

    @Override
    public Assets getAssets() {
        return assetsMapper.selectByPrimaryKey(1);
    }
}
