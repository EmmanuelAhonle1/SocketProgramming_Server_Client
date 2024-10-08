// Copy-paste this file at the top of every file you turn in.
/*
* EE422C Final Project submission by
* Replace <...> with your actual data.
* <Emmanuel Ahonle>
* <eva278>
* <17610>
* Fall 2022
*/

package finalProject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class GsonItem {
	private String name;
	private String description;
	private double currBid;
	private double buyNow;
	private String timer;
	private String bidHistory;
	private String winningBidder;
	private boolean bidClosed;
		

	
	public GsonItem(String name, String description, double currBid, double buyNow, String timer, String bidHistory) {
		this.name = name;
		this.description = description;
		this.currBid = currBid;
		this.buyNow = buyNow;
		this.timer = timer;
		this.bidHistory = bidHistory;
		this.bidClosed = false;
	}
	

	public void setBidHistory(String string) {
		this.bidHistory = string;
	}

	public void setCurrBid(double currBid2) {
		this.currBid = currBid2;
	}

	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public double getCurrBid() {
		return this.currBid;
	}
	
	public double getBuyNow() {
		return this.buyNow;
	}
	
	public String getTimer() {
		return this.timer;
	}
	
	public String getBidHistory() {
		return this.bidHistory;
	}
	
	public String toString() {
		
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		
		return gson.toJson(this);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getWinningBidder() {
		return this.winningBidder;
	}
	
	public void setWinningBidder(String winningBidder) {
		this.winningBidder = winningBidder;
	}

	public void setTimer(String timer2) {
		// TODO Auto-generated method stub
		this.timer = timer2;
	}
	
	public void setBuyNow(int buyNow) {
		this.buyNow = buyNow;
	}
	
	public void setBidClosed() {
		this.bidClosed = true;
	}
	
	public boolean getBidClosed() {
		return this.bidClosed;
	}
	
	

}
