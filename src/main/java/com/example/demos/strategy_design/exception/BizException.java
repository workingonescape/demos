package com.example.demos.strategy_design.exception;

import com.example.demos.strategy_design.enums.ExceptionCode;

/**
 * @author Reece
 * @createTime 2022/04/10 19:53:03
 * @Description
 */
public class BizException extends RuntimeException {


	private ExceptionCode exceptionCode;


	public BizException(ExceptionCode exceptionCode) {
		super(exceptionCode.getDesc());
	}
}
