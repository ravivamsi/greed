/**
 * 
 */
package com.greedpro.alpaca.models;

/**
 * @author vamsiravi
 *
 */
public class AccountResponse {

	  private String id;
	  private String account_number;
	  private String status;
	  private String currency;
	  private String buying_power;
	  private String regt_buying_power;
	  private String daytrading_buying_power;
	  private String cash;
	  private String portfolio_value;
	  private boolean pattern_day_trader;
	  private boolean trading_blocked;
	  private boolean transfers_blocked;
	  private boolean account_blocked;
	  private String created_at;
	  private boolean trade_suspended_by_user;
	  private String multiplier;
	  private boolean shorting_enabled;
	  private String equity;
	  private String last_equity;
	  private String long_market_value;
	  private String short_market_value;
	  private String initial_margin;
	  private String maintenance_margin;
	  private String last_maintenance_margin;
	  private String sma;
	  private float daytrade_count;


	 // Getter Methods 

	  public String getId() {
	    return id;
	  }

	  public String getAccount_number() {
	    return account_number;
	  }

	  public String getStatus() {
	    return status;
	  }

	  public String getCurrency() {
	    return currency;
	  }

	  public String getBuying_power() {
	    return buying_power;
	  }

	  public String getRegt_buying_power() {
	    return regt_buying_power;
	  }

	  public String getDaytrading_buying_power() {
	    return daytrading_buying_power;
	  }

	  public String getCash() {
	    return cash;
	  }

	  public String getPortfolio_value() {
	    return portfolio_value;
	  }

	  public boolean getPattern_day_trader() {
	    return pattern_day_trader;
	  }

	  public boolean getTrading_blocked() {
	    return trading_blocked;
	  }

	  public boolean getTransfers_blocked() {
	    return transfers_blocked;
	  }

	  public boolean getAccount_blocked() {
	    return account_blocked;
	  }

	  public String getCreated_at() {
	    return created_at;
	  }

	  public boolean getTrade_suspended_by_user() {
	    return trade_suspended_by_user;
	  }

	  public String getMultiplier() {
	    return multiplier;
	  }

	  public boolean getShorting_enabled() {
	    return shorting_enabled;
	  }

	  public String getEquity() {
	    return equity;
	  }

	  public String getLast_equity() {
	    return last_equity;
	  }

	  public String getLong_market_value() {
	    return long_market_value;
	  }

	  public String getShort_market_value() {
	    return short_market_value;
	  }

	  public String getInitial_margin() {
	    return initial_margin;
	  }

	  public String getMaintenance_margin() {
	    return maintenance_margin;
	  }

	  public String getLast_maintenance_margin() {
	    return last_maintenance_margin;
	  }

	  public String getSma() {
	    return sma;
	  }

	  public float getDaytrade_count() {
	    return daytrade_count;
	  }

	 // Setter Methods 

	  public void setId( String id ) {
	    this.id = id;
	  }

	  public void setAccount_number( String account_number ) {
	    this.account_number = account_number;
	  }

	  public void setStatus( String status ) {
	    this.status = status;
	  }

	  public void setCurrency( String currency ) {
	    this.currency = currency;
	  }

	  public void setBuying_power( String buying_power ) {
	    this.buying_power = buying_power;
	  }

	  public void setRegt_buying_power( String regt_buying_power ) {
	    this.regt_buying_power = regt_buying_power;
	  }

	  public void setDaytrading_buying_power( String daytrading_buying_power ) {
	    this.daytrading_buying_power = daytrading_buying_power;
	  }

	  public void setCash( String cash ) {
	    this.cash = cash;
	  }

	  public void setPortfolio_value( String portfolio_value ) {
	    this.portfolio_value = portfolio_value;
	  }

	  public void setPattern_day_trader( boolean pattern_day_trader ) {
	    this.pattern_day_trader = pattern_day_trader;
	  }

	  public void setTrading_blocked( boolean trading_blocked ) {
	    this.trading_blocked = trading_blocked;
	  }

	  public void setTransfers_blocked( boolean transfers_blocked ) {
	    this.transfers_blocked = transfers_blocked;
	  }

	  public void setAccount_blocked( boolean account_blocked ) {
	    this.account_blocked = account_blocked;
	  }

	  public void setCreated_at( String created_at ) {
	    this.created_at = created_at;
	  }

	  public void setTrade_suspended_by_user( boolean trade_suspended_by_user ) {
	    this.trade_suspended_by_user = trade_suspended_by_user;
	  }

	  public void setMultiplier( String multiplier ) {
	    this.multiplier = multiplier;
	  }

	  public void setShorting_enabled( boolean shorting_enabled ) {
	    this.shorting_enabled = shorting_enabled;
	  }

	  public void setEquity( String equity ) {
	    this.equity = equity;
	  }

	  public void setLast_equity( String last_equity ) {
	    this.last_equity = last_equity;
	  }

	  public void setLong_market_value( String long_market_value ) {
	    this.long_market_value = long_market_value;
	  }

	  public void setShort_market_value( String short_market_value ) {
	    this.short_market_value = short_market_value;
	  }

	  public void setInitial_margin( String initial_margin ) {
	    this.initial_margin = initial_margin;
	  }

	  public void setMaintenance_margin( String maintenance_margin ) {
	    this.maintenance_margin = maintenance_margin;
	  }

	  public void setLast_maintenance_margin( String last_maintenance_margin ) {
	    this.last_maintenance_margin = last_maintenance_margin;
	  }

	  public void setSma( String sma ) {
	    this.sma = sma;
	  }

	  public void setDaytrade_count( float daytrade_count ) {
	    this.daytrade_count = daytrade_count;
	  }

}
