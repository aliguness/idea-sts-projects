package com.aligunes.personelTakipSistemi;

import java.time.LocalDate;

public class InsanKaynaklariPersoneli extends Personel{
	
	static int idSayar =1;

	public InsanKaynaklariPersoneli(String ad, String soyad, EDepartman departmani) {
		super(ad, soyad, departmani);
		super.setId("IK-" + idSayar++);
	}
	
	public InsanKaynaklariPersoneli(String ad, String soyad, EDepartman depatmani, float maas, LocalDate iseGirisTarihi) {
		super(ad, soyad, depatmani, maas, iseGirisTarihi);
		super.setId("IK-" + idSayar++);
		
	}

	@Override
	public String toString() {
		return "İnsanKaynaklariPersoneli [getId()=" + getId() + ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad()
				+ ", getDepartmani()=" + getDepartmani() + ", getMaas()=" + getMaas() + ", getIseGirisTarihi()="
				+ getIseGirisTarihi() + ", getMesaiSaati()=" + getMesaiSaati() + "]";
	}
	
}
