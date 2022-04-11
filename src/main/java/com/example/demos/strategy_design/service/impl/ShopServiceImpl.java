package com.example.demos.strategy_design.service.impl;

import com.example.demos.strategy_design.model.CreateShopReqVO;
import com.example.demos.strategy_design.model.ShopVO;
import com.example.demos.strategy_design.service.ShopService;
import com.example.demos.strategy_design.strategy.CreateShopStrategy;
import com.example.demos.strategy_design.strategy.context.CreateShopStrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Reece
 * @createTime 2022/04/10 19:48:24
 * @Description
 */
@Service
public class ShopServiceImpl implements ShopService {


	@Autowired
	private CreateShopStrategyFactory shopStrategyFactory;


	@Override
	public ShopVO createShop(CreateShopReqVO reqVO) {
		CreateShopStrategy createShopStrategy = shopStrategyFactory.get(reqVO.getType());
		return createShopStrategy.createShop(reqVO);
	}

}
