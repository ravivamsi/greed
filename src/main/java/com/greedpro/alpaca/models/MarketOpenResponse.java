/**
 * 
 */
package com.greedpro.alpaca.models;

import java.util.ArrayList;

/**
 * @author vamsiravi
 *
 */
public class MarketOpenResponse {

	ArrayList<MarketOpen> marketopendetails = new ArrayList<MarketOpen>();

	// Getter Methods

	public ArrayList<MarketOpen> getMarketOpenDetails() {
		return marketopendetails;
	}

	// Setter Methods

	public void setMarketOpenDetails(ArrayList<MarketOpen> marketopendetails) {
		this.marketopendetails = marketopendetails;
	}

}
