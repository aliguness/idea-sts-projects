package com.aligunes.personelTakipSistemi;

import java.time.LocalDate;

public abstract class VardiyaliCalisanlar  extends Personel{
	

	private EVardiya vardiya;

	public VardiyaliCalisanlar(String ad, String soyad, EDepartman departmani) {
		super(ad, soyad, departmani);
	}

	public VardiyaliCalisanlar(String ad, String soyad, EDepartman depatman, float maas, LocalDate iseGirisTarihi,
			EVardiya vardiya) {
		super(ad, soyad, depatman, maas, iseGirisTarihi);
		this.vardiya = vardiya;
	}

	public EVardiya getVardiya() {
		return vardiya;
	}

	public void setVardiya(EVardiya vardiya) {
		this.vardiya = vardiya;
	}

	@Override
	public String toString() {
		return "VardiyaliCalisanlar [vardiya=" + vardiya + ", getId()=" + getId() + ", getAd()=" + getAd()
				+ ", getSoyad()=" + getSoyad() + ", getDepartmani()=" + getDepartmani() + ", getMaas()=" + getMaas()
				+ ", getIseGirisTarihi()=" + getIseGirisTarihi() + ", getMesaiSaati()=" + getMesaiSaati() + "]";
	}
}
