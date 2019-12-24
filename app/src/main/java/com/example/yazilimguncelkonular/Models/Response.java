package com.example.yazilimguncelkonular.Models;

import java.util.List;

public class Response{
	private String ad;
	private int fakulteId;
	private List<DerslerItem> dersler;
	private Fakulte fakulte;
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

	public void setFakulte(Fakulte fakulte){
		this.fakulte = fakulte;
	}

	public Fakulte getFakulte(){
		return fakulte;
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
			"Response{" + 
			"ad = '" + ad + '\'' + 
			",fakulteId = '" + fakulteId + '\'' + 
			",dersler = '" + dersler + '\'' + 
			",fakulte = '" + fakulte + '\'' + 
			",kisiler = '" + kisiler + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}