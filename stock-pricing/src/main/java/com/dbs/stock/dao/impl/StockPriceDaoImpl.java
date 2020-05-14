package com.dbs.stock.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.dbs.stock.dao.StockPriceDao;
import com.dbs.stock.model.Stock;

@Repository
public class StockPriceDaoImpl implements StockPriceDao {

	private float mkt_price = 0;

	@Override
	public Stock getStockPrice(float bid_price, float ask_price) {
		Stock stock = new Stock();

		stock.setSymbol("Green");
		stock.setAsk_price(1000);
		stock.setBid_price(10005);
		stock.setEvent_time(System.currentTimeMillis());
		return stock;
	}

	@Override
	public ModelAndView getMarketPriceDao(float bid_price, float ask_price, Model model) {

		mkt_price = (bid_price + ask_price) / 2;
		model.addAttribute("market_price", mkt_price);

		return new ModelAndView("market_price");
	}

	@Override
	public ModelAndView getTrendDao(float bid_price) {

		if (bid_price > 1000) {

			return new ModelAndView("up");
		}

		return new ModelAndView("down");
	}

	@Override
	public ModelAndView getSymbolDao(float price) {

		float bid_price = price;

		if (bid_price > 10000) {

			return new ModelAndView("green");
		} else {

			return new ModelAndView("red");
		}

	}

}
