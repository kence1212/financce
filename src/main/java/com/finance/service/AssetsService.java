package com.finance.service;

import com.finance.dao.AssetsMapper;
import com.finance.entity.Assets;
import org.springframework.stereotype.Service;

public interface AssetsService {

    public Assets getAssets();
}
