package com.example.demos.strategy_design.model;

import com.example.demos.strategy_design.enums.StrategyType;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * @author Reece
 * @createTime 2022/04/10 19:19:20
 * @Description
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CreateShopReqVO extends BaseReqVO{


	/**
	 * @see StrategyType
	 */
	private Integer type;




}
