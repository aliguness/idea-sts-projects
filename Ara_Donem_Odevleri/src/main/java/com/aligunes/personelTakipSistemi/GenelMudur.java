package com.aligunes.personelTakipSistemi;

import java.time.LocalDate;

public class GenelMudur extends Personel{
	
	static int idSayar =1;

	public GenelMudur(String ad, String soyad, EDepartman departmani) {
		super(ad, soyad, departmani);
		super.setId("GM-" + idSayar++) ;
	}

	public GenelMudur(String ad, String soyad, EDepartman depatmani, float maas, LocalDate iseGirisTarihi) {
		super(ad, soyad, depatmani, maas, iseGirisTarihi);
		super.setId("GM-" + idSayar++) ;
		
	}

	@Override
	public String toString() {
		return "GenelMudur [getId()=" + getId() + ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad()
				+ ", getDepartmani()=" + getDepartmani() + ", getMaas()=" + getMaas() + ", getIseGirisTarihi()="
				+ getIseGirisTarihi() + ", getMesaiSaati()=" + getMesaiSaati() + "]";
	}

	
}
