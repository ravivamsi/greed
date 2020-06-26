/**
 * 
 */
package com.greedpro.alpaca.models;

import java.util.ArrayList;

/**
 * @author vamsiravi
 *
 */
public class WatchlistsResponse {
	
	ArrayList < WatchlistResponse > watchlists = new ArrayList < WatchlistResponse > ();
	
	// Getter Methods 
	
	public ArrayList<WatchlistResponse> getWatchlists(){
		return watchlists;
	}
	
	// Setter Methods 
	
	public void setWatchlists(ArrayList<WatchlistResponse> watchlists) {
		this.watchlists = watchlists;
	}
	
}
