package com.aligunes.soru1_2;

import java.util.ArrayList;
import java.util.List;

public class Musteri extends Kisi {

	private List<Kitap> kiralananKitaplar;

	public Musteri(int id, String isim) {
		super(id, isim);
		this.kiralananKitaplar = new ArrayList<>();
	}

	public List<Kitap> getKiralananKitaplar() {
		return kiralananKitaplar;
	}

	public void setKiralananKitaplar(List<Kitap> kiralananKitaplar) {
		this.kiralananKitaplar = kiralananKitaplar;
	}

	@Override
	public String toString() {
		return "Musteri [getId()=" + getId() + ", getIsim()=" + getAdi() + "]";
	}

}
