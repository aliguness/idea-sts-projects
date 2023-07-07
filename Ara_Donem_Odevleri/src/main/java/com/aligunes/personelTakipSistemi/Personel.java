package com.aligunes.personelTakipSistemi;

import java.time.LocalDate;

public abstract class Personel {
	
	private String id;
	private String ad;
	private String soyad;
	private EDepartman depatrmani;
	private float maas;
	private LocalDate iseGirisTarihi;
	private int mesaiSaati;
	
	
	
	public Personel(String ad, String soyad,EDepartman departmani) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.depatrmani = departmani;
	}


	public Personel(String ad, String soyad, EDepartman depatrmani, float maas, LocalDate iseGirisTarihi) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.depatrmani = depatrmani;
		this.maas = maas;
		this.iseGirisTarihi = iseGirisTarihi;
	}

	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	public EDepartman getDepartmani() {
		return depatrmani;
	}


	public void setDepartmani(EDepartman depatmani) {
		this.depatrmani = depatmani;
	}


	public float getMaas() {
		return maas;
	}


	public void setMaas(float maas) {
		this.maas = maas;
	}


	public LocalDate getIseGirisTarihi() {
		return iseGirisTarihi;
	}


	public void setIseGirisTarihi(LocalDate iseGirisTarihi) {
		this.iseGirisTarihi = iseGirisTarihi;
	}


	public int getMesaiSaati() {
		return mesaiSaati;
	}


	public void setMesaiSaati(int mesaiSaati) {
		this.mesaiSaati = mesaiSaati;
	}


	@Override
	public String toString() {
		return "Personel [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", depatrmani=" + depatrmani + ", maas="
				+ maas + ", iseGirisTarihi=" + iseGirisTarihi + ", mesaiSaati=" + mesaiSaati + "]";
	}



	
	
	
	

}
