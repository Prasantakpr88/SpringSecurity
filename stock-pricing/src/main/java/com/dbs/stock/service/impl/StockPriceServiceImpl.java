package com.dbs.stock.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.dbs.stock.dao.StockPriceDao;
import com.dbs.stock.model.Stock;
import com.dbs.stock.service.StockPriceService;

@Service
public class StockPriceServiceImpl implements StockPriceService {

	private float bid_price = 0;
	private float ask_price = 0;
	private Model model = null;

	@Autowired
	StockPriceDao stockPriceDao;

	@Override
	public Stock getStockPrice(float bid_price, float ask_price) {

		return stockPriceDao.getStockPrice(bid_price, ask_price);
	}

	public ModelAndView getSymbolService(float bid_price) {
		float price = bid_price;

		return stockPriceDao.getSymbolDao(price);
	}

	public ModelAndView getMarketPriceService(float bid_price, float ask_price, Model model) {

		this.bid_price = bid_price;
		this.ask_price = ask_price;
		this.model = model;

		return stockPriceDao.getMarketPriceDao(bid_price, ask_price, model);
	}

	@Override
	public ModelAndView getTrendService(float bid_price) {

		float price = bid_price;

		return stockPriceDao.getTrendDao(price);
	}

}
