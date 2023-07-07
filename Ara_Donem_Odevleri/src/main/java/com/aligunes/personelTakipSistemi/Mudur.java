package com.aligunes.personelTakipSistemi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mudur extends Personel{
	
	
	static int idSayar =1;
	private List<Departman> sorumluOlduguDepartmanlar;
	
	public Mudur(String ad, String soyad, EDepartman departmani) {
		super(ad, soyad, departmani);
		super.setId("M- " + idSayar++) ;
		this.sorumluOlduguDepartmanlar = new ArrayList<>();
	}
	
	public Mudur(String ad, String soyad, EDepartman depatmani, float maas, LocalDate iseGirisTarihi) {
		super(ad, soyad, depatmani, maas, iseGirisTarihi);
		super.setId("M- " + idSayar++) ;
		this.sorumluOlduguDepartmanlar = new ArrayList<>();
	}


	public List<Departman> getSorumluOlduguDepartmanlar() {
		return sorumluOlduguDepartmanlar;
	}

	public void setSorumluOlduguDepartmanlar(List<Departman> sorumluOlduguDepartmanlar) {
		this.sorumluOlduguDepartmanlar = sorumluOlduguDepartmanlar;
	}

	@Override
	public String toString() {
		return "Mudur [sorumluOlduguDepartmanlar=" + sorumluOlduguDepartmanlar + ", getId()=" + getId() + ", getAd()="
				+ getAd() + ", getSoyad()=" + getSoyad() + ", getDepartmani()=" + getDepartmani() + ", getMaas()="
				+ getMaas() + ", getIseGirisTarihi()=" + getIseGirisTarihi() + ", getMesaiSaati()=" + getMesaiSaati()
				+ "]";
	}

}
