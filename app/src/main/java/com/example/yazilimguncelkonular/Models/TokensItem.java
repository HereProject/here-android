package com.example.yazilimguncelkonular.Models;

public class TokensItem{
	private String name;
	private String loginProvider;
	private int userId;
	private String value;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
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

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"TokensItem{" + 
			"name = '" + name + '\'' + 
			",loginProvider = '" + loginProvider + '\'' + 
			",userId = '" + userId + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}
