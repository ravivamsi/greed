/**
 * 
 */
package com.greedpro.alpaca.models;

/**
 * @author vamsiravi
 *
 */
public class OrderUpdateRequest {

	
	private String qty;
	private String limit_price;
	private String time_in_force;
	private String stop_price;
	private String client_order_id;
	
	// Getter Methods


	public String getQty() {
		return qty;
	}


	public String getLimit_price() {
		return limit_price;
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



	// Setter Methods


	public void setQty(String qty) {
		this.qty = qty;
	}

	public void setLimit_price(String limit_price) {
		this.limit_price = limit_price;
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


}
