package com.aligunes.soru1_2;

public abstract class Kisi {

	private int id;
	private String adi;

	public Kisi(int id, String adi) {
		super();
		this.id = id;
		this.adi = adi;
	}

	public int getId() {
		return id;
	}

	public String getAdi() {
		return adi;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	@Override
	public String toString() {
		return "Kisi [id=" + id + ", isim=" + adi + "]";
	}

}
