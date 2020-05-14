package com.dbs.stock;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dbs.stock.controller.ApplicationController;

@SpringBootTest
class StockPricingApplicationTests {
	
	@Autowired
	private ApplicationController controller;

	@Test
	public void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
}
