/**
 * 
 */
package com.greedpro.alpaca.models;

import java.util.ArrayList;

/**
 * @author vamsiravi
 *
 */
public class WatchlistResponse {
	 private String id;
	 private String account_id;
	 private String created_at;
	 private String updated_at;
	 private String name;
	 ArrayList < AssetResponse > assets = new ArrayList < AssetResponse > ();


	 // Getter Methods 

	 public String getId() {
	  return id;
	 }

	 public String getAccount_id() {
	  return account_id;
	 }

	 public String getCreated_at() {
	  return created_at;
	 }

	 public String getUpdated_at() {
	  return updated_at;
	 }

	 public String getName() {
	  return name;
	 }
	 
	 public ArrayList<AssetResponse> getAssets(){
			return assets;
		}

	 // Setter Methods 

	 public void setId(String id) {
	  this.id = id;
	 }

	 public void setAccount_id(String account_id) {
	  this.account_id = account_id;
	 }

	 public void setCreated_at(String created_at) {
	  this.created_at = created_at;
	 }

	 public void setUpdated_at(String updated_at) {
	  this.updated_at = updated_at;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setAssets(ArrayList<AssetResponse> assets) {
			this.assets = assets;
		}

}
