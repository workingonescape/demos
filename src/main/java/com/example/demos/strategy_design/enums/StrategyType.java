package com.example.demos.strategy_design.enums;

import lombok.Getter;

/**
 * @author Reece
 * @createTime 2022/04/10 19:28:51
 * @Description 策略集合
 */
@Getter
public enum StrategyType {

	OLD(1,"旧系统"),
	NEW(2,"新系统");


	private final Integer type;


	private final String desc;


	StrategyType(Integer type, String desc) {
		this.type = type;
		this.desc = desc;
	}
}
