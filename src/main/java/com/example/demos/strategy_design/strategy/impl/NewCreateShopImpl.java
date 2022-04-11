package com.example.demos.strategy_design.strategy.impl;

import com.example.demos.strategy_design.enums.StrategyType;
import com.example.demos.strategy_design.model.CreateShopReqVO;
import com.example.demos.strategy_design.model.ShopVO;
import com.example.demos.strategy_design.strategy.CreateShopStrategy;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author Reece
 * @createTime 2022/04/10 19:22:37
 * @Description 新系统的开店逻辑
 */
@Service
public class NewCreateShopImpl implements CreateShopStrategy {


	@Override
	public ShopVO createShop(CreateShopReqVO reqVO) {
		return ShopVO.builder().shopName("NewCreateShopImpl").uid(reqVO.getUid()).id(new Random().nextLong()).build();
	}

	@Override
	public Integer getType() {
		return StrategyType.NEW.getType();
	}

}
