package com.example.yazilimguncelkonular.Models;

public class ClaimsItem{
	private String claimType;
	private String claimValue;
	private int id;
	private int userId;

	public void setClaimType(String claimType){
		this.claimType = claimType;
	}

	public String getClaimType(){
		return claimType;
	}

	public void setClaimValue(String claimValue){
		this.claimValue = claimValue;
	}

	public String getClaimValue(){
		return claimValue;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	@Override
 	public String toString(){
		return 
			"ClaimsItem{" + 
			"claimType = '" + claimType + '\'' + 
			",claimValue = '" + claimValue + '\'' + 
			",id = '" + id + '\'' + 
			",userId = '" + userId + '\'' + 
			"}";
		}
}
