package com.example.yazilimguncelkonular.Models;

public class OgrenciDetay{
	private String ad;
	private int gender;
	private String soyad;
	//private boolean gender;
	private int id;
	private int userId;
	private String tc;

	public void setAd(String ad){
		this.ad = ad;
	}

	public String getAd(){
		return ad;
	}

	public void setGender(int gender){
		this.gender = gender;
	}

	public int getGender(){
		return gender;
	}

	public void setSoyad(String soyad){
		this.soyad = soyad;
	}

	public String getSoyad(){
		return soyad;
	}

//	public void setGender(boolean gender){
//		this.gender = gender;
//	}
//
//	public boolean isGender(){
//		return gender;
//	}

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

	public void setTc(String tc){
		this.tc = tc;
	}

	public String getTc(){
		return tc;
	}

	@Override
 	public String toString(){
		return 
			"OgrenciDetay{" + 
			"ad = '" + ad + '\'' + 
			",gender = '" + gender + '\'' + 
			",soyad = '" + soyad + '\'' + 
			",_Gender = '" + gender + '\'' + 
			",id = '" + id + '\'' + 
			",userId = '" + userId + '\'' + 
			",tc = '" + tc + '\'' + 
			"}";
		}
}
