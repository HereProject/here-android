package com.example.yazilimguncelkonular.Models;

import java.util.List;

public class BolumlerItem{
	private String ad;
	private int fakulteId;
	private List<DerslerItem> dersler;
	private List<KisilerItem> kisiler;
	private int id;

	public void setAd(String ad){
		this.ad = ad;
	}

	public String getAd(){
		return ad;
	}

	public void setFakulteId(int fakulteId){
		this.fakulteId = fakulteId;
	}

	public int getFakulteId(){
		return fakulteId;
	}

	public void setDersler(List<DerslerItem> dersler){
		this.dersler = dersler;
	}

	public List<DerslerItem> getDersler(){
		return dersler;
	}

	public void setKisiler(List<KisilerItem> kisiler){
		this.kisiler = kisiler;
	}

	public List<KisilerItem> getKisiler(){
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
			"BolumlerItem{" + 
			"ad = '" + ad + '\'' + 
			",fakulteId = '" + fakulteId + '\'' + 
			",dersler = '" + dersler + '\'' + 
			",kisiler = '" + kisiler + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}