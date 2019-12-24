package com.example.yazilimguncelkonular.Models;

import java.util.List;

public class Fakulte{
	private Universite universite;
	private String ad;
	private List<Object> bolumler;
	private List<KisilerItem> kisiler;
	private int id;
	private int universiteId;

	public void setUniversite(Universite universite){
		this.universite = universite;
	}

	public Universite getUniversite(){
		return universite;
	}

	public void setAd(String ad){
		this.ad = ad;
	}

	public String getAd(){
		return ad;
	}

	public void setBolumler(List<Object> bolumler){
		this.bolumler = bolumler;
	}

	public List<Object> getBolumler(){
		return bolumler;
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

	public void setUniversiteId(int universiteId){
		this.universiteId = universiteId;
	}

	public int getUniversiteId(){
		return universiteId;
	}

	@Override
 	public String toString(){
		return 
			"Fakulte{" + 
			"universite = '" + universite + '\'' + 
			",ad = '" + ad + '\'' + 
			",bolumler = '" + bolumler + '\'' + 
			",kisiler = '" + kisiler + '\'' + 
			",id = '" + id + '\'' + 
			",universiteId = '" + universiteId + '\'' + 
			"}";
		}
}