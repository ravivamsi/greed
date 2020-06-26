/**
 * 
 */
package com.greedpro.alpaca.models;

/**
 * @author vamsiravi
 *
 */
public class StopLoss {

	private String limit_price;

	private String stop_price;

	// Getter Methods

	public String getLimitPrice() {
		return limit_price;
	}

	public String getStopPrice() {
		return stop_price;
	}

	// Setter Methods

	public void setLimit_price(String limit_price) {
		this.limit_price = limit_price;
	}

	public void setStopPrice(String stop_price) {
		this.stop_price = stop_price;
	}

}
