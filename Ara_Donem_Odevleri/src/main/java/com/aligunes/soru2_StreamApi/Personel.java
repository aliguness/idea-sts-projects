package com.aligunes.soru2_StreamApi;

public class Personel {
	
	private String ad;
	private int yas;
	
	public Personel(String ad, int yas) {
		super();
		this.ad = ad;
		this.yas = yas;
	}


	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "Personel [ad=" + ad + ", yas=" + yas + "]";
	}
	
	

}
