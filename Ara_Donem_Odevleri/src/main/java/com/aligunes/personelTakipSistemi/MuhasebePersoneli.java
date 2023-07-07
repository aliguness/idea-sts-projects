package com.aligunes.personelTakipSistemi;

import java.time.LocalDate;

public class MuhasebePersoneli extends Personel{
	
	static int idSayar =1;

	public MuhasebePersoneli(String ad, String soyad, EDepartman departmani) {
		super(ad, soyad, departmani);
		super.setId("MP-" + idSayar++);
	}
	
	public MuhasebePersoneli(String ad, String soyad, EDepartman depatmani, float maas, LocalDate iseGirisTarihi) {
		super(ad, soyad, depatmani, maas, iseGirisTarihi);
		super.setId("MP-" + idSayar++);
		
	}

	@Override
	public String toString() {
		return "MuhasebePersoneli [getId()=" + getId() + ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad()
				+ ", getDepartmani()=" + getDepartmani() + ", getMaas()=" + getMaas() + ", getIseGirisTarihi()="
				+ getIseGirisTarihi() + ", getMesaiSaati()=" + getMesaiSaati() + "]";
	}

}
