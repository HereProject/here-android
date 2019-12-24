package com.example.yazilimguncelkonular.Models;

import java.util.List;

public class Role{
	private List<Object> userRoles;
	private List<RoleClaimsItem> roleClaims;
	private String name;
	private int id;
	private String normalizedName;
	private String concurrencyStamp;

	public void setUserRoles(List<Object> userRoles){
		this.userRoles = userRoles;
	}

	public List<Object> getUserRoles(){
		return userRoles;
	}

	public void setRoleClaims(List<RoleClaimsItem> roleClaims){
		this.roleClaims = roleClaims;
	}

	public List<RoleClaimsItem> getRoleClaims(){
		return roleClaims;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setNormalizedName(String normalizedName){
		this.normalizedName = normalizedName;
	}

	public String getNormalizedName(){
		return normalizedName;
	}

	public void setConcurrencyStamp(String concurrencyStamp){
		this.concurrencyStamp = concurrencyStamp;
	}

	public String getConcurrencyStamp(){
		return concurrencyStamp;
	}

	@Override
 	public String toString(){
		return 
			"Role{" + 
			"userRoles = '" + userRoles + '\'' + 
			",roleClaims = '" + roleClaims + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",normalizedName = '" + normalizedName + '\'' + 
			",concurrencyStamp = '" + concurrencyStamp + '\'' + 
			"}";
		}
}