package com.example.demos.strategy_design.controller;

import com.example.demos.strategy_design.model.CreateShopReqVO;
import com.example.demos.strategy_design.model.ShopVO;
import com.example.demos.strategy_design.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Reece
 * @createTime 2022/04/10 19:59:50
 * @Description
 */
@Controller
@RequestMapping("/shop")
public class ShopController {


	@Autowired
	private ShopService shopService;



	@ResponseBody
	@PostMapping("/createShop")
	public ShopVO createShop(CreateShopReqVO reqVO) {
		return shopService.createShop(reqVO);
	}
}
