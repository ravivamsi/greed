/**
 * 
 */
package com.greedpro.alpaca.models;

import java.util.ArrayList;

/**
 * @author vamsiravi
 *
 */
public class OrdersResponse {
	
	ArrayList < OrderResponse > orders = new ArrayList < OrderResponse > ();
	
	// Getter Methods 
	
	public ArrayList<OrderResponse> getOrders(){
		return orders;
	}
	
	// Setter Methods 
	
	public void setOrders(ArrayList<OrderResponse> orders) {
		this.orders = orders;
	}
	
}
