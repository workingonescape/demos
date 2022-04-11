package com.example.demos.strategy_design.strategy;

import com.example.demos.strategy_design.model.CreateShopReqVO;
import com.example.demos.strategy_design.model.ShopVO;

/**
 * @author Reece
 * @createTime 2022/04/10 19:17:07
 * @Description 策略接口
 */
public interface CreateShopStrategy {


	/*
	 * 创建店铺
	 * @param reqVO
	 * @return com.example.demos.strategy_design.model.ShopVO
	 * @author Reece
	 * @date 2022/4/10 20:14:02
	 */
	ShopVO createShop(CreateShopReqVO reqVO);


	/*
	 * 具体的策略类型
	 * @param
	 * @return java.lang.Integer
	 * @author Reece
	 * @date 2022/4/10 20:14:40
	 */
	Integer getType();
}
