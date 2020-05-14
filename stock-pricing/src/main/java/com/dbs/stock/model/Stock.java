/**
 * 
 */
package com.dbs.stock.model;

import org.springframework.stereotype.Component;

/**
 * @author Prasanta
 *
 */
public class Stock {

	private String symbol;
	private float bid_price;
	private float ask_price;
	private long event_time;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public float getBid_price() {
		return bid_price;
	}

	public void setBid_price(float bid_price) {
		this.bid_price = bid_price;
	}

	public float getAsk_price() {
		return ask_price;
	}

	public void setAsk_price(float ask_price) {
		this.ask_price = ask_price;
	}

	public long getEvent_time() {
		return event_time;
	}

	public void setEvent_time(long event_time) {
		this.event_time = event_time;
	}

}
