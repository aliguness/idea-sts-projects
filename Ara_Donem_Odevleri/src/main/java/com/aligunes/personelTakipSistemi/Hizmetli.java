package com.aligunes.personelTakipSistemi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hizmetli extends VardiyaliCalisanlar{

	private List<EKatlar> sorumluOlduguKatlar;
	static int idSayar =1;
	
	public Hizmetli(String ad, String soyad, EDepartman departmani) {
		super(ad, soyad, departmani);
		super.setId("H-"+idSayar++);
		sorumluOlduguKatlar = new ArrayList<>();
	}
	
	public Hizmetli(String ad, String soyad, EDepartman depatmani, float maas, LocalDate iseGirisTarihi,
			EVardiya vardiya) {
		super(ad, soyad, depatmani, maas, iseGirisTarihi,vardiya);
		super.setId("H-"+idSayar++);
		
	}

	public List<EKatlar> getSorumluOlduguKatlar() {
		return sorumluOlduguKatlar;
	}

	public void setSorumluOlduguKatlar(List<EKatlar> sorumluOlduguKatlar) {
		this.sorumluOlduguKatlar = sorumluOlduguKatlar;
	}

	@Override
	public String toString() {
		return "Hizmetli [sorumluOlduguKatlar=" + sorumluOlduguKatlar + ", getVardiya()=" + getVardiya() + ", getId()="
				+ getId() + ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad() + ", getDepartmani()="
				+ getDepartmani() + ", getMaas()=" + getMaas() + ", getIseGirisTarihi()=" + getIseGirisTarihi()
				+ ", getMesaiSaati()=" + getMesaiSaati() + "]";
	}

}
