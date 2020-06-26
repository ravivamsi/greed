/**
 * 
 */
package com.greedpro.alpaca.models;

/**
 * @author vamsiravi
 *
 */
public class OrderResponse {

	private String id;
	private String client_order_id;
	private String created_at;
	private String updated_at;
	private String submitted_at;
	private String filled_at = null;
	private String expired_at = null;
	private String canceled_at;
	private String failed_at = null;
	private String replaced_at = null;
	private String replaced_by = null;
	private String replaces = null;
	private String asset_id;
	private String symbol;
	private String asset_class;
	private String qty;
	private String filled_qty;
	private String filled_avg_price = null;
	private String order_class;
	private String order_type;
	private String type;
	private String side;
	private String time_in_force;
	private String limit_price;
	private String stop_price = null;
	private String status;
	private boolean extended_hours;
	private String legs = null;

	// Getter Methods

	public String getId() {
		return id;
	}

	public String getClient_order_id() {
		return client_order_id;
	}

	public String getCreated_at() {
		return created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public String getSubmitted_at() {
		return submitted_at;
	}

	public String getFilled_at() {
		return filled_at;
	}

	public String getExpired_at() {
		return expired_at;
	}

	public String getCanceled_at() {
		return canceled_at;
	}

	public String getFailed_at() {
		return failed_at;
	}

	public String getReplaced_at() {
		return replaced_at;
	}

	public String getReplaced_by() {
		return replaced_by;
	}

	public String getReplaces() {
		return replaces;
	}

	public String getAsset_id() {
		return asset_id;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getAsset_class() {
		return asset_class;
	}

	public String getQty() {
		return qty;
	}

	public String getFilled_qty() {
		return filled_qty;
	}

	public String getFilled_avg_price() {
		return filled_avg_price;
	}

	public String getOrder_class() {
		return order_class;
	}

	public String getOrder_type() {
		return order_type;
	}

	public String getType() {
		return type;
	}

	public String getSide() {
		return side;
	}

	public String getTime_in_force() {
		return time_in_force;
	}

	public String getLimit_price() {
		return limit_price;
	}

	public String getStop_price() {
		return stop_price;
	}

	public String getStatus() {
		return status;
	}

	public boolean getExtended_hours() {
		return extended_hours;
	}

	public String getLegs() {
		return legs;
	}

	// Setter Methods

	public void setId(String id) {
		this.id = id;
	}

	public void setClient_order_id(String client_order_id) {
		this.client_order_id = client_order_id;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public void setSubmitted_at(String submitted_at) {
		this.submitted_at = submitted_at;
	}

	public void setFilled_at(String filled_at) {
		this.filled_at = filled_at;
	}

	public void setExpired_at(String expired_at) {
		this.expired_at = expired_at;
	}

	public void setCanceled_at(String canceled_at) {
		this.canceled_at = canceled_at;
	}

	public void setFailed_at(String failed_at) {
		this.failed_at = failed_at;
	}

	public void setReplaced_at(String replaced_at) {
		this.replaced_at = replaced_at;
	}

	public void setReplaced_by(String replaced_by) {
		this.replaced_by = replaced_by;
	}

	public void setReplaces(String replaces) {
		this.replaces = replaces;
	}

	public void setAsset_id(String asset_id) {
		this.asset_id = asset_id;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setAsset_class(String asset_class) {
		this.asset_class = asset_class;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public void setFilled_qty(String filled_qty) {
		this.filled_qty = filled_qty;
	}

	public void setFilled_avg_price(String filled_avg_price) {
		this.filled_avg_price = filled_avg_price;
	}

	public void setOrder_class(String order_class) {
		this.order_class = order_class;
	}

	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public void setTime_in_force(String time_in_force) {
		this.time_in_force = time_in_force;
	}

	public void setLimit_price(String limit_price) {
		this.limit_price = limit_price;
	}

	public void setStop_price(String stop_price) {
		this.stop_price = stop_price;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setExtended_hours(boolean extended_hours) {
		this.extended_hours = extended_hours;
	}

	public void setLegs(String legs) {
		this.legs = legs;
	}

}
