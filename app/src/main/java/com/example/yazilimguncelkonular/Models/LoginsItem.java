package com.example.yazilimguncelkonular.Models;

public class LoginsItem{
	private String providerDisplayName;
	private String loginProvider;
	private int userId;
	private String providerKey;

	public void setProviderDisplayName(String providerDisplayName){
		this.providerDisplayName = providerDisplayName;
	}

	public String getProviderDisplayName(){
		return providerDisplayName;
	}

	public void setLoginProvider(String loginProvider){
		this.loginProvider = loginProvider;
	}

	public String getLoginProvider(){
		return loginProvider;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	public void setProviderKey(String providerKey){
		this.providerKey = providerKey;
	}

	public String getProviderKey(){
		return providerKey;
	}

	@Override
 	public String toString(){
		return 
			"LoginsItem{" + 
			"providerDisplayName = '" + providerDisplayName + '\'' + 
			",loginProvider = '" + loginProvider + '\'' + 
			",userId = '" + userId + '\'' + 
			",providerKey = '" + providerKey + '\'' + 
			"}";
		}
}
