/**
 * 
 */
package com.greedpro.alpaca.models;

/**
 * @author vamsiravi
 *
 */
public class Latest {
	 private float price;
	 private float size;
	 private float exchange;
	 private float cond1;
	 private float cond2;
	 private float cond3;
	 private float cond4;
	 private float askprice;
	 private float asksize;
	 private float askexchange;
	 private float bidprice;
	 private float bidsize;
	 private float bidexchange;
	 private float timestamp;


	 // Getter Methods 

	 public float getPrice() {
	  return price;
	 }

	 public float getSize() {
	  return size;
	 }

	 public float getExchange() {
	  return exchange;
	 }

	 public float getCond1() {
	  return cond1;
	 }

	 public float getCond2() {
	  return cond2;
	 }

	 public float getCond3() {
	  return cond3;
	 }

	 public float getCond4() {
	  return cond4;
	 }

	 public float getAskprice() {
	  return askprice;
	 }

	 public float getAsksize() {
	  return asksize;
	 }

	 public float getAskexchange() {
	  return askexchange;
	 }

	 public float getBidprice() {
	  return bidprice;
	 }

	 public float getBidsize() {
	  return bidsize;
	 }

	 public float getBidexchange() {
	  return bidexchange;
	 }

	 public float getTimestamp() {
	  return timestamp;
	 }

	 // Setter Methods 

	 public void setPrice(float price) {
	  this.price = price;
	 }

	 public void setSize(float size) {
	  this.size = size;
	 }

	 public void setExchange(float exchange) {
	  this.exchange = exchange;
	 }

	 public void setCond1(float cond1) {
	  this.cond1 = cond1;
	 }

	 public void setCond2(float cond2) {
	  this.cond2 = cond2;
	 }

	 public void setCond3(float cond3) {
	  this.cond3 = cond3;
	 }

	 public void setCond4(float cond4) {
	  this.cond4 = cond4;
	 }

	 public void setAskprice(float askprice) {
	  this.askprice = askprice;
	 }

	 public void setAsksize(float asksize) {
	  this.asksize = asksize;
	 }

	 public void setAskexchange(float askexchange) {
	  this.askexchange = askexchange;
	 }

	 public void setBidprice(float bidprice) {
	  this.bidprice = bidprice;
	 }

	 public void setBidsize(float bidsize) {
	  this.bidsize = bidsize;
	 }

	 public void setBidexchange(float bidexchange) {
	  this.bidexchange = bidexchange;
	 }

	 public void setTimestamp(float timestamp) {
	  this.timestamp = timestamp;
	 }
}
