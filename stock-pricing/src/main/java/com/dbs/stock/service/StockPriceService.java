package com.dbs.stock.service;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.dbs.stock.model.Stock;

public interface StockPriceService {

	public Stock getStockPrice(float bid_price, float ask_price);

	public ModelAndView getSymbolService(float bid_price);

	public ModelAndView getMarketPriceService(float bid_price, float ask_price, Model model);

	public ModelAndView getTrendService(float bid_price);
}
