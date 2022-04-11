package com.example.demos.strategy_design.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Reece
 * @createTime 2022/04/10 19:17:32
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShopVO implements Serializable {


	private static final long serialVersionUID = 1L;


	private Long id;


	private Long uid;


	private String shopName;

}
