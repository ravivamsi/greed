/**
 * 
 */
package com.greedpro.alpaca.models;

/**
 * @author vamsiravi
 *
 */
public class LatestQuoteResponse {
	 private String status;
	 private String symbol;
	 Latest latest;


	 // Getter Methods 

	 public String getStatus() {
	  return status;
	 }

	 public String getSymbol() {
	  return symbol;
	 }

	 public Latest getLatest() {
	  return latest;
	 }

	 // Setter Methods 

	 public void setStatus(String status) {
	  this.status = status;
	 }

	 public void setSymbol(String symbol) {
	  this.symbol = symbol;
	 }

	 public void setLatest(Latest latest) {
	  this.latest = latest;
	 }
}
