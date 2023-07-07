package com.aligunes.soru1_2;

public class Kiralama {

	private int id;
	private Kasiyer kasiyer;
	private Musteri musteri;
	private Kitap kitap;
	private long date;

	public Kiralama(int id, Kasiyer kasiyer, Musteri musteri, Kitap kitap) {
		super();
		this.id = id;
		this.kasiyer = kasiyer;
		this.musteri = musteri;
		this.kitap = kitap;
		this.date = System.currentTimeMillis();
	}

	public int getId() {
		return id;
	}

	public Kasiyer getKasiyer() {
		return kasiyer;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public Kitap getKitap() {
		return kitap;
	}

	public long getDate() {
		return date;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setKasiyer(Kasiyer kasiyer) {
		this.kasiyer = kasiyer;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}

	public void setDate(long date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Kiralama [id=" + id + ", kasiyer=" + kasiyer + ", musteri=" + musteri + ", kitap=" + kitap + ", date="
				+ date + "]";
	}

}
