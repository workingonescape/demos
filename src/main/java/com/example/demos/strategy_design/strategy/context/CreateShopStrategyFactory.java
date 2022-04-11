package com.example.demos.strategy_design.strategy.context;

import com.example.demos.strategy_design.strategy.CreateShopStrategy;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Reece
 * @createTime 2022/04/10 19:24:18
 * @Description
 */
@Component
public class CreateShopStrategyFactory implements ApplicationContextAware {


	private static final Map<Integer, CreateShopStrategy> STRATEGY_MAP = new ConcurrentHashMap<>();



	/**
	 * 根据不同的type返回具体的策略
	 *
	 * @param type
	 * @return com.example.demos.strategy_design.strategy.CreateShopStrategy
	 * @author Reece
	 * @date 2022/4/10 19:39:19
	 */
	public CreateShopStrategy get(Integer type) {
		return STRATEGY_MAP.get(type);
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		Map<String, CreateShopStrategy> strategyMap = applicationContext.getBeansOfType(CreateShopStrategy.class);
		strategyMap.values().forEach(strategy -> STRATEGY_MAP.put(strategy.getType(), strategy));
	}
}
