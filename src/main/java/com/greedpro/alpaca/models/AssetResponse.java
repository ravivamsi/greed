/**
 * 
 */
package com.greedpro.alpaca.models;

/**
 * @author vamsiravi
 *
 */
public class AssetResponse {
	private String id;
	private String eq_class;
	private String exchange;
	private String symbol;
	private String name;
	private String status;
	private boolean tradable;
	private boolean marginable;
	private boolean shortable;
	private boolean easy_to_borrow;

	// Getter Methods

	public String getId() {
		return id;
	}

	public String getEqClass() {
		return eq_class;
	}

	public String getExchange() {
		return exchange;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	public String getStatus() {
		return status;
	}

	public boolean getTradable() {
		return tradable;
	}

	public boolean getMarginable() {
		return marginable;
	}

	public boolean getShortable() {
		return shortable;
	}

	public boolean getEasy_to_borrow() {
		return easy_to_borrow;
	}

	// Setter Methods

	public void setId(String id) {
		this.id = id;
	}

	public void setEqClass(String eq_class) {
		this.eq_class = eq_class;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setTradable(boolean tradable) {
		this.tradable = tradable;
	}

	public void setMarginable(boolean marginable) {
		this.marginable = marginable;
	}

	public void setShortable(boolean shortable) {
		this.shortable = shortable;
	}

	public void setEasy_to_borrow(boolean easy_to_borrow) {
		this.easy_to_borrow = easy_to_borrow;
	}
}
