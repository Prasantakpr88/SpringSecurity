package com.dbs.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dbs.stock.model.Stock;
import com.dbs.stock.service.impl.StockPriceServiceImpl;

@RestController
@RequestMapping("/rest/auth")
public class ApplicationController {

	private float bid_price = 0;
	private float ask_price = 0;

	@Autowired
	StockPriceServiceImpl stockPriceServiceImpl;

	@GetMapping("/login")
	public ModelAndView login(Model model) {

		model.addAttribute("message", "Welcome to DBS!!!");

		return new ModelAndView("welcome");
	}

	@GetMapping("/assignment")
	public String optimum() {

		return "DBS Asignment Work going on";
	}

	@GetMapping("/getSymbol")
	public ModelAndView getSymbol(@ModelAttribute("stock") Stock stock) {

		float bid_price = stock.getBid_price();

		return stockPriceServiceImpl.getSymbolService(bid_price);
	}

	@GetMapping("/getMarketPrice")
	public ModelAndView getMarketPrice(@RequestParam("bid_price") float bid_price,
			@RequestParam("ask_price") float ask_price, Model model) {

		return stockPriceServiceImpl.getMarketPriceService(bid_price, ask_price, model);
	}

	@GetMapping("/getStockPrice")
	public @ResponseBody Stock getStockPrice(@RequestParam("bid_price") float bid_price,
			@RequestParam("ask_price") float ask_price) {
		return stockPriceServiceImpl.getStockPrice(bid_price, ask_price);

	}

	@GetMapping("/getTrend")
	public ModelAndView getTrend(@ModelAttribute("stock") Stock stock) {
		float bid_price = stock.getBid_price();
		return stockPriceServiceImpl.getTrendService(bid_price);
	}

}
