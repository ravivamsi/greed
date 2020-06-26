/**
 * 
 */
package com.greedpro.alpaca.models;

/**
 * @author vamsiravi
 *
 */
public class OrderCreate {

	private String symbol;
	private String qty;
	private String side;
	private String type;
	private String limit_price;
	private boolean extended_hours;
	private String time_in_force;
	private String stop_price;
	private String client_order_id;
	private String order_class;
	TakeProfit takeprofit;
	StopLoss stoploss;

	// Getter Methods

	public String getSymbol() {
		return symbol;
	}

	public String getQty() {
		return qty;
	}

	public String getSide() {
		return side;
	}

	public String getType() {
		return type;
	}

	public String getLimit_price() {
		return limit_price;
	}

	public boolean getExtended_hours() {
		return extended_hours;
	}

	public String getTime_in_force() {
		return time_in_force;
	}

	public String getStop_price() {
		return stop_price;
	}

	public String getClient_order_id() {
		return client_order_id;
	}

	public String getOrder_class() {
		return order_class;
	}

	public TakeProfit getTakeProfit() {
		return takeprofit;
	}

	public StopLoss getStopLoss() {
		return stoploss;
	}

	// Setter Methods

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setLimit_price(String limit_price) {
		this.limit_price = limit_price;
	}

	public void setExtended_hours(boolean extended_hours) {
		this.extended_hours = extended_hours;
	}

	public void setTime_in_force(String time_in_force) {
		this.time_in_force = time_in_force;
	}

	public void setStop_price(String stop_price) {
		this.stop_price = stop_price;
	}

	public void setClient_order_id(String client_order_id) {
		this.client_order_id = client_order_id;
	}

	public void setOrder_class(String order_class) {
		this.order_class = order_class;
	}

	public void setTakeProfit(TakeProfit takeprofit) {
		this.takeprofit = takeprofit;
	}

	public void setStopLoss(StopLoss stoploss) {
		this.stoploss = stoploss;
	}

}
