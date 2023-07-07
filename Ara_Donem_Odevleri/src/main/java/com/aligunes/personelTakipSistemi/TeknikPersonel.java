package com.aligunes.personelTakipSistemi;

import java.time.LocalDate;

public class TeknikPersonel extends VardiyaliCalisanlar{
	
	static int idSayar =1;

	public TeknikPersonel(String ad, String soyad,EDepartman departmani) {
		super(ad, soyad,departmani);
		super.setId("T-" + idSayar++);
	}
	
	public TeknikPersonel(String ad, String soyad, EDepartman depatmani, float maas, LocalDate iseGirisTarihi,
			EVardiya vardiya) {
		super(ad, soyad, depatmani, maas, iseGirisTarihi, vardiya);
		super.setId("T-" + idSayar++);
	}

	@Override
	public String toString() {
		return "TeknikPersonel [getVardiya()=" + getVardiya() + ", getId()=" + getId() + ", getAd()=" + getAd()
				+ ", getSoyad()=" + getSoyad() + ", getDepartmani()=" + getDepartmani() + ", getMaas()=" + getMaas()
				+ ", getIseGirisTarihi()=" + getIseGirisTarihi() + ", getMesaiSaati()=" + getMesaiSaati() + "]";
	}

}
