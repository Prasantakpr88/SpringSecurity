package com.dbs.stock.dao;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.dbs.stock.model.Stock;

public interface StockPriceDao {
	
	public Stock getStockPrice(float bid_price,float ask_price);
	public ModelAndView getSymbolDao(float price);
	public ModelAndView getMarketPriceDao(float bid_price,float ask_price,Model model);
	public ModelAndView getTrendDao(float bid_price);

}
