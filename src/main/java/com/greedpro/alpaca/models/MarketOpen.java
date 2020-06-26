/**
 * 
 */
package com.greedpro.alpaca.models;

/**
 * @author vamsiravi
 *
 */
public class MarketOpen {
	

	 private String date;
	 private String open;
	 private String close;
	 private String session_open;
	 private String session_close;


	 // Getter Methods 

	 public String getDate() {
	  return date;
	 }

	 public String getOpen() {
	  return open;
	 }

	 public String getClose() {
	  return close;
	 }

	 public String getSession_open() {
	  return session_open;
	 }

	 public String getSession_close() {
	  return session_close;
	 }

	 // Setter Methods 

	 public void setDate(String date) {
	  this.date = date;
	 }

	 public void setOpen(String open) {
	  this.open = open;
	 }

	 public void setClose(String close) {
	  this.close = close;
	 }

	 public void setSession_open(String session_open) {
	  this.session_open = session_open;
	 }

	 public void setSession_close(String session_close) {
	  this.session_close = session_close;
	 }


}
