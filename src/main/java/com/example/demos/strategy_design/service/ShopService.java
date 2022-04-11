package com.example.demos.strategy_design.service;

import com.example.demos.strategy_design.model.CreateShopReqVO;
import com.example.demos.strategy_design.model.ShopVO;

/**
 * @author Reece
 * @createTime 2022/04/10 19:47:34
 * @Description
 */
public interface ShopService {


	ShopVO createShop(CreateShopReqVO reqVO);
}
