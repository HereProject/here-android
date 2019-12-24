package com.example.yazilimguncelkonular.Models;

public class RoleClaimsItem{
	private String claimType;
	private int roleId;
	private String claimValue;
	private int id;

	public void setClaimType(String claimType){
		this.claimType = claimType;
	}

	public String getClaimType(){
		return claimType;
	}

	public void setRoleId(int roleId){
		this.roleId = roleId;
	}

	public int getRoleId(){
		return roleId;
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

	@Override
 	public String toString(){
		return 
			"RoleClaimsItem{" + 
			"claimType = '" + claimType + '\'' + 
			",roleId = '" + roleId + '\'' + 
			",claimValue = '" + claimValue + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}
