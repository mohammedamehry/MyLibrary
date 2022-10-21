package com.proads.customads.Models;

import com.google.gson.annotations.SerializedName;

public class MoreAppsItem{

	@SerializedName("AppLink")
	private String appLink;

	@SerializedName("AppIcon")
	private String appIcon;

	@SerializedName("AppName")
	private String appName;

	public String getAppLink(){
		return appLink;
	}

	public String getAppIcon(){
		return appIcon;
	}

	public String getAppName(){
		return appName;
	}
}