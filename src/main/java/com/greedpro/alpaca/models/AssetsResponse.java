/**
 * 
 */
package com.greedpro.alpaca.models;

import java.util.ArrayList;

/**
 * @author vamsiravi
 *
 */
public class AssetsResponse {

	ArrayList<AssetResponse> assets = new ArrayList<AssetResponse>();

	// Getter Methods

	public ArrayList<AssetResponse> getAssets() {
		return assets;
	}

	// Setter Methods

	public void setAssets(ArrayList<AssetResponse> assets) {
		this.assets = assets;
	}

}
