package com.example.yazilimguncelkonular.Models;

import java.util.List;

public class Universite{
	private String ad;
	private List<Object> fakulteler;
	private List<Object> kisiler;
	private int id;

	public void setAd(String ad){
		this.ad = ad;
	}

	public String getAd(){
		return ad;
	}

	public void setFakulteler(List<Object> fakulteler){
		this.fakulteler = fakulteler;
	}

	public List<Object> getFakulteler(){
		return fakulteler;
	}

	public void setKisiler(List<Object> kisiler){
		this.kisiler = kisiler;
	}

	public List<Object> getKisiler(){
		return kisiler;
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
			"Universite{" + 
			"ad = '" + ad + '\'' + 
			",fakulteler = '" + fakulteler + '\'' + 
			",kisiler = '" + kisiler + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}