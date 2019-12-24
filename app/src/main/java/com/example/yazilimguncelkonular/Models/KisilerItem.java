package com.example.yazilimguncelkonular.Models;

import java.util.List;

public class KisilerItem{
	private OgrenciDetay ogrenciDetay;
	private boolean emailConfirmed;
	private String normalizedUserName;
	private String normalizedEmail;
	private int universiteId;
	private String passwordHash;
	private boolean phoneNumberConfirmed;
	private boolean twoFactorEnabled;
	private List<TokensItem> tokens;
	private int id;
	private int accessFailedCount;
	private String email;
	private String lockoutEnd;
	private int bolumId;
	private List<Object> verilenDersler;
	private boolean lockoutEnabled;
	private OgretmenDetay ogretmenDetay;
	private String userName;
	private List<UserRolesItem> userRoles;
	private Universite universite;
	private int fakulteId;
	private String phoneNumber;
	private List<ClaimsItem> claims;
	private int userType;
	private List<AlinanDerslerItem> alinanDersler;
	//private int userType;
	private String concurrencyStamp;
	private List<LoginsItem> logins;
	private String securityStamp;

	public void setOgrenciDetay(OgrenciDetay ogrenciDetay){
		this.ogrenciDetay = ogrenciDetay;
	}

	public OgrenciDetay getOgrenciDetay(){
		return ogrenciDetay;
	}

	public void setEmailConfirmed(boolean emailConfirmed){
		this.emailConfirmed = emailConfirmed;
	}

	public boolean isEmailConfirmed(){
		return emailConfirmed;
	}

	public void setNormalizedUserName(String normalizedUserName){
		this.normalizedUserName = normalizedUserName;
	}

	public String getNormalizedUserName(){
		return normalizedUserName;
	}

	public void setNormalizedEmail(String normalizedEmail){
		this.normalizedEmail = normalizedEmail;
	}

	public String getNormalizedEmail(){
		return normalizedEmail;
	}

	public void setUniversiteId(int universiteId){
		this.universiteId = universiteId;
	}

	public int getUniversiteId(){
		return universiteId;
	}

	public void setPasswordHash(String passwordHash){
		this.passwordHash = passwordHash;
	}

	public String getPasswordHash(){
		return passwordHash;
	}

	public void setPhoneNumberConfirmed(boolean phoneNumberConfirmed){
		this.phoneNumberConfirmed = phoneNumberConfirmed;
	}

	public boolean isPhoneNumberConfirmed(){
		return phoneNumberConfirmed;
	}

	public void setTwoFactorEnabled(boolean twoFactorEnabled){
		this.twoFactorEnabled = twoFactorEnabled;
	}

	public boolean isTwoFactorEnabled(){
		return twoFactorEnabled;
	}

	public void setTokens(List<TokensItem> tokens){
		this.tokens = tokens;
	}

	public List<TokensItem> getTokens(){
		return tokens;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setAccessFailedCount(int accessFailedCount){
		this.accessFailedCount = accessFailedCount;
	}

	public int getAccessFailedCount(){
		return accessFailedCount;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setLockoutEnd(String lockoutEnd){
		this.lockoutEnd = lockoutEnd;
	}

	public String getLockoutEnd(){
		return lockoutEnd;
	}

	public void setBolumId(int bolumId){
		this.bolumId = bolumId;
	}

	public int getBolumId(){
		return bolumId;
	}

	public void setVerilenDersler(List<Object> verilenDersler){
		this.verilenDersler = verilenDersler;
	}

	public List<Object> getVerilenDersler(){
		return verilenDersler;
	}

	public void setLockoutEnabled(boolean lockoutEnabled){
		this.lockoutEnabled = lockoutEnabled;
	}

	public boolean isLockoutEnabled(){
		return lockoutEnabled;
	}

	public void setOgretmenDetay(OgretmenDetay ogretmenDetay){
		this.ogretmenDetay = ogretmenDetay;
	}

	public OgretmenDetay getOgretmenDetay(){
		return ogretmenDetay;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserRoles(List<UserRolesItem> userRoles){
		this.userRoles = userRoles;
	}

	public List<UserRolesItem> getUserRoles(){
		return userRoles;
	}

	public void setUniversite(Universite universite){
		this.universite = universite;
	}

	public Universite getUniversite(){
		return universite;
	}

	public void setFakulteId(int fakulteId){
		this.fakulteId = fakulteId;
	}

	public int getFakulteId(){
		return fakulteId;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setClaims(List<ClaimsItem> claims){
		this.claims = claims;
	}

	public List<ClaimsItem> getClaims(){
		return claims;
	}

//	public void setUserType(int userType){
//		this.userType = userType;
//	}
//
//	public int getUserType(){
//		return userType;
//	}

	public void setAlinanDersler(List<AlinanDerslerItem> alinanDersler){
		this.alinanDersler = alinanDersler;
	}

	public List<AlinanDerslerItem> getAlinanDersler(){
		return alinanDersler;
	}

	public void setUserType(int userType){
		this.userType = userType;
	}

	public int getUserType(){
		return userType;
	}

	public void setConcurrencyStamp(String concurrencyStamp){
		this.concurrencyStamp = concurrencyStamp;
	}

	public String getConcurrencyStamp(){
		return concurrencyStamp;
	}

	public void setLogins(List<LoginsItem> logins){
		this.logins = logins;
	}

	public List<LoginsItem> getLogins(){
		return logins;
	}

	public void setSecurityStamp(String securityStamp){
		this.securityStamp = securityStamp;
	}

	public String getSecurityStamp(){
		return securityStamp;
	}

	@Override
 	public String toString(){
		return 
			"KisilerItem{" + 
			"ogrenciDetay = '" + ogrenciDetay + '\'' + 
			",emailConfirmed = '" + emailConfirmed + '\'' + 
			",normalizedUserName = '" + normalizedUserName + '\'' + 
			",normalizedEmail = '" + normalizedEmail + '\'' + 
			",universiteId = '" + universiteId + '\'' + 
			",passwordHash = '" + passwordHash + '\'' + 
			",phoneNumberConfirmed = '" + phoneNumberConfirmed + '\'' + 
			",twoFactorEnabled = '" + twoFactorEnabled + '\'' + 
			",tokens = '" + tokens + '\'' + 
			",id = '" + id + '\'' + 
			",accessFailedCount = '" + accessFailedCount + '\'' + 
			",email = '" + email + '\'' + 
			",lockoutEnd = '" + lockoutEnd + '\'' + 
			",bolumId = '" + bolumId + '\'' + 
			",verilenDersler = '" + verilenDersler + '\'' + 
			",lockoutEnabled = '" + lockoutEnabled + '\'' + 
			",ogretmenDetay = '" + ogretmenDetay + '\'' + 
			",userName = '" + userName + '\'' + 
			",userRoles = '" + userRoles + '\'' + 
			",universite = '" + universite + '\'' + 
			",fakulteId = '" + fakulteId + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",claims = '" + claims + '\'' + 
			",_UserType = '" + userType + '\'' + 
			",alinanDersler = '" + alinanDersler + '\'' + 
			",userType = '" + userType + '\'' + 
			",concurrencyStamp = '" + concurrencyStamp + '\'' + 
			",logins = '" + logins + '\'' + 
			",securityStamp = '" + securityStamp + '\'' + 
			"}";
		}
}