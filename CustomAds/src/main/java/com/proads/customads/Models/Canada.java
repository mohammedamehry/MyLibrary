package com.proads.customads.Models;

import com.google.gson.annotations.SerializedName;

public class Canada{

	@SerializedName("Native")
	private String mynative;

	@SerializedName("Banner")
	private String banner;

	@SerializedName("Interstitial")
	private String interstitial;

	@SerializedName("Reward")
	private String reward;

	public String getNative(){
		return mynative;
	}

	public String getBanner(){
		return banner;
	}

	public String getInterstitial(){
		return interstitial;
	}

	public String getReward(){
		return reward;
	}
}