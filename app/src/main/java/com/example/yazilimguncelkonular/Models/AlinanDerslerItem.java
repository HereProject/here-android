package com.example.yazilimguncelkonular.Models;

public class AlinanDerslerItem{
	private int dersId;
	private int ogrenciId;
	private int id;

	public void setDersId(int dersId){
		this.dersId = dersId;
	}

	public int getDersId(){
		return dersId;
	}

	public void setOgrenciId(int ogrenciId){
		this.ogrenciId = ogrenciId;
	}

	public int getOgrenciId(){
		return ogrenciId;
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
			"AlinanDerslerItem{" + 
			"dersId = '" + dersId + '\'' + 
			",ogrenciId = '" + ogrenciId + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}
