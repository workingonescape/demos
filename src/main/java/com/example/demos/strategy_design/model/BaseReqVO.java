package com.example.demos.strategy_design.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Reece
 * @createTime 2022/04/10 19:21:05
 * @Description
 */
@Data
public class BaseReqVO  implements Serializable {


	private static final long serialVersionUID = 1L;



	private Long uid;
}
