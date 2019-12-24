package com.example.yazilimguncelkonular.Models;

public class UserRolesItem{
	private Role role;
	private int roleId;
	private int userId;

	public void setRole(Role role){
		this.role = role;
	}

	public Role getRole(){
		return role;
	}

	public void setRoleId(int roleId){
		this.roleId = roleId;
	}

	public int getRoleId(){
		return roleId;
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
			"UserRolesItem{" + 
			"role = '" + role + '\'' + 
			",roleId = '" + roleId + '\'' + 
			",userId = '" + userId + '\'' + 
			"}";
		}
}
