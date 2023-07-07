package com.aligunes.personelTakipSistemi;

import java.time.LocalDate;

public class BuroPersoneli extends VardiyaliCalisanlar{
	static int idSayar =1;
	
	public BuroPersoneli(String ad, String soyad , EDepartman departmani) {
		super(ad, soyad, departmani);
		super.setId("B-" +idSayar++);
		
	}

	public BuroPersoneli(String ad, String soyad, EDepartman depatmani, float maas, LocalDate iseGirisTarihi,
			EVardiya vardiya) {
		super(ad, soyad, depatmani, maas, iseGirisTarihi,vardiya);
		super.setId("B-" +idSayar++);
		
	}

	@Override
	public String toString() {
		return "BuroPersoneli [getVardiya()=" + getVardiya() + ", getId()=" + getId() + ", getAd()=" + getAd()
				+ ", getSoyad()=" + getSoyad() + ", getDepartmani()=" + getDepartmani() + ", getMaas()=" + getMaas()
				+ ", getIseGirisTarihi()=" + getIseGirisTarihi() + ", getMesaiSaati()=" + getMesaiSaati() + "]";
	}
}
