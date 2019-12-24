package com.example.yazilimguncelkonular.Models;

public class VerilenDerslerItem{
	private String dersAdi;
	private int ogretmenId;
	private int bolumId;
	private int id;

	public void setDersAdi(String dersAdi){
		this.dersAdi = dersAdi;
	}

	public String getDersAdi(){
		return dersAdi;
	}

	public void setOgretmenId(int ogretmenId){
		this.ogretmenId = ogretmenId;
	}

	public int getOgretmenId(){
		return ogretmenId;
	}

	public void setBolumId(int bolumId){
		this.bolumId = bolumId;
	}

	public int getBolumId(){
		return bolumId;
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
			"VerilenDerslerItem{" + 
			"dersAdi = '" + dersAdi + '\'' + 
			",ogretmenId = '" + ogretmenId + '\'' + 
			",bolumId = '" + bolumId + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}
