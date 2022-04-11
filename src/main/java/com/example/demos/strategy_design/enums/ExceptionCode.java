package com.example.demos.strategy_design.enums;

import lombok.Getter;

/**
 * @author Reece
 * @createTime 2022/04/10 19:53:49
 * @Description
 */
@Getter
public enum ExceptionCode {



	UNKNOWN_ERROR(99999999L,"未知异常"),


	CREATE_SHOP_ERROR(10010000L,"创建店铺失败"),

	NO_SUCH_STRATEGY_ERROR(10010001L,"找不到对应策略");


	private final Long code;


	private final String desc;


	ExceptionCode(Long code, String desc) {
		this.code = code;
		this.desc = desc;
	}
}
