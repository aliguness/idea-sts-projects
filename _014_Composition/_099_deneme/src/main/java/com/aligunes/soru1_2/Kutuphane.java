package com.aligunes.soru1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Kutuphane implements IKutuphane {

	private final static List<Kitap> kitaplar = new ArrayList<>();
	private final static List<Musteri> musteriler = new ArrayList<>();
	private final static List<Kasiyer> kasiyerler = new ArrayList<>();
	private final static List<Kiralama> kiralamalar = new ArrayList<>();

	public static <T> void listeyeEkleme(List<T> list, T object) {
		list.add(object);
	}

	public void musteriOlusturma() {
		Musteri musteri1 = new Musteri(1, "Ali Güneş");
		Musteri musteri2 = new Musteri(2, "Serkan Zorlu");
		Musteri musteri3 = new Musteri(3, "Aminenur Göynük");
		Musteri musteri4 = new Musteri(4, "Ahmet Akkoyun");
		Musteri musteri5 = new Musteri(5, "Ahmet Birinci");
		Musteri musteri6 = new Musteri(6, "Ahmet İkinci");
		Musteri musteri7 = new Musteri(7, "Ahmet Üçüncü");

		listeyeEkleme(musteriler, musteri1);
		listeyeEkleme(musteriler, musteri2);
		listeyeEkleme(musteriler, musteri3);
		listeyeEkleme(musteriler, musteri4);
		listeyeEkleme(musteriler, musteri5);
		listeyeEkleme(musteriler, musteri6);
		listeyeEkleme(musteriler, musteri7);


	}

	public void kasiyerOlusturma() {
		Kasiyer kasiyer1 = new Kasiyer(1, "Sönmez Reis", 25000);
		Kasiyer kasiyer2 = new Kasiyer(2, "Jorge Jesus", 9500);
		Kasiyer kasiyer3 = new Kasiyer(3, "Julio Baptista", 5000);

		listeyeEkleme(kasiyerler, kasiyer2);
		listeyeEkleme(kasiyerler, kasiyer1);
		listeyeEkleme(kasiyerler, kasiyer3);
	}

	public static void kitapOlusturma() {
		listeyeEkleme(kitaplar, new Kitap(1, "Goriot Baba"));
		listeyeEkleme(kitaplar, new Kitap(2, "Sefiller"));
		listeyeEkleme(kitaplar, new Kitap(3, "Kürk Mantolu Madonna"));
		listeyeEkleme(kitaplar, new Kitap(4, "Don Kişot"));
		listeyeEkleme(kitaplar, new Kitap(5, "Anna Karanina 1"));
		listeyeEkleme(kitaplar, new Kitap(6, "Anna Karanina 2"));
		listeyeEkleme(kitaplar, new Kitap(7, "Anna Karanina 3"));
		listeyeEkleme(kitaplar, new Kitap(8, "Oblomov"));
		listeyeEkleme(kitaplar, new Kitap(9, "Karamozov kardeşler"));
		listeyeEkleme(kitaplar, new Kitap(10, "Ali Baba ve Kırk Haramiler"));
	}

	public void kiralamaOlusturma() {
		Kiralama kiralama1 = new Kiralama(1, kasiyerler.get(0), musteriler.get(0), kitaplar.get(0));
		kitaplar.get(0).setDurum(EDurum.KIRADA);
		Kiralama kiralama2 = new Kiralama(2, kasiyerler.get(0), musteriler.get(1), kitaplar.get(1));
		kitaplar.get(1).setDurum(EDurum.KIRADA);
		Kiralama kiralama3 = new Kiralama(3, kasiyerler.get(1), musteriler.get(1), kitaplar.get(2));
		kitaplar.get(2).setDurum(EDurum.KIRADA);
		Kiralama kiralama4 = new Kiralama(4, kasiyerler.get(1), musteriler.get(2), kitaplar.get(3));
		kitaplar.get(3).setDurum(EDurum.KIRADA);
		Kiralama kiralama5 = new Kiralama(5, kasiyerler.get(1), musteriler.get(2), kitaplar.get(4));
		kitaplar.get(4).setDurum(EDurum.KIRADA);
		Kiralama kiralama6 = new Kiralama(6, kasiyerler.get(1), musteriler.get(3), kitaplar.get(5));
		kitaplar.get(5).setDurum(EDurum.KIRADA);
		listeyeEkleme(kiralamalar, kiralama1);
		listeyeEkleme(kiralamalar, kiralama2);
		listeyeEkleme(kiralamalar, kiralama3);
		listeyeEkleme(kiralamalar, kiralama4);
		listeyeEkleme(kiralamalar, kiralama5);
		listeyeEkleme(kiralamalar, kiralama6);
	}

	@Override
	public boolean kiralamaYap() throws KutuphaneEx {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen müsteri id nizi giriniz");
		int musteriId = Integer.parseInt(scanner.nextLine());
		Musteri musteri = musteriler.get(musteriId - 1);
		System.out.println("Lütfen Kasiyer id nizi giriniz");
		int kasiyerId = Integer.parseInt(scanner.nextLine());
		Kasiyer kasiyer = kasiyerler.get(kasiyerId - 1);
		System.out.println("Kirada Olmayan Kitaplar");
		kitaplar.stream().filter(k -> k.getDurum().equals(EDurum.KUTUPHANEDE)).forEach(x -> {
			System.out.println(x.getId() + "-" + x.getIsim());
		});
		System.out.println("Lütfen bir secim yapınız");
		int kitapId = Integer.parseInt(scanner.nextLine());
		Kitap kitap = kitaplar.get(kitapId - 1);

		if (kitap.getDurum().equals(EDurum.KIRADA)) {
			throw new KutuphaneEx("Belirttiğiniz kitap kiradadır. Kiralama gerçekleşmemiştir");
		} else {
			Kiralama kiralama = new Kiralama(kiralamalar.size() + 1, kasiyer, musteri, kitap);
			kiralamalar.add(kiralama);
			System.out.println("");
			return true;
		}

	}

	@Override
	public Kitap kitapAra() throws KutuphaneEx {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen  kitap adı giriniz.");
		String isim = scanner.nextLine();

		Optional<Kitap> kitap = kitaplar.stream().filter(x -> x.getIsim().equalsIgnoreCase(isim)).findFirst();
		if (kitap.isEmpty()) {
			throw new KutuphaneEx("Kitap yok, bulunamadı");
		}
		return kitap.get();
	}

	@Override
	public Musteri musteriAra() throws KutuphaneEx {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen  musteri adını giriniz");
		String isim = scanner.nextLine();
		Optional<Musteri> musteri = musteriler.stream()
				.filter(m -> m.getAdi().equalsIgnoreCase(isim)).findFirst();
		if (musteri.isEmpty()) {
			throw new KutuphaneEx("Aradığınız musteri bulunamamaktadır");

		}else {
			return musteri.get();
		}


	}

	@Override
	public List<Kitap> kiralananKitaplar() throws KutuphaneEx {
		List<Kitap> kiralananKitaplar = kitaplar.stream()
				.filter(x -> x.getDurum().equals(EDurum.KIRADA))
				.collect(Collectors.toList());

		if (kiralananKitaplar.isEmpty()) {
			throw new KutuphaneEx(" Kirada bulunan kitap yok.");
		}

		return kiralananKitaplar;
	}

	public Musteri idyeGoreSonKiralayanKisi(int kitapId) throws KutuphaneEx {
		List<Kiralama> kiralama = kiralamalar.stream().filter(k -> k.getKitap().getId() == kitapId)
				.collect(Collectors.toList());
		Musteri musteri = null;
		try {
			musteri = kiralama.get(kiralama.size()-1).getMusteri();
		} catch (Exception e) {
			throw new KutuphaneEx("Bu kitaba ait herhangi bir kiralama yoktur");
		}

		return musteri;
	}

	public List<Musteri> kitapAdınaGoreKiralamaYapanMusteriler(String kitapAdı) {

		List<Musteri> musteriList = kiralamalar.stream().filter(k -> k.getKitap().getIsim().equalsIgnoreCase(kitapAdı))
				.map(x -> x.getMusteri()).collect(Collectors.toList());
		return musteriList;
	}

	public List<Musteri> ahmIleBaslayanMusteri() throws KutuphaneEx {

		List<Musteri> musteriList = musteriler.stream().filter(x -> x.getAdi().startsWith("Ahm"))
				.collect(Collectors.toList());

	//	List<Musteri> musteriList2 = kiralamalar.stream().map(x -> x.getMusteri())
	//			.filter(x -> x.getAdi().startsWith("Ahm")).collect(Collectors.toList());

	//	List<Musteri> musteriList3 = kiralamalar.stream().filter(x -> x.getMusteri().getAdi().startsWith("Ahm"))
	//			.map(x -> x.getMusteri()).collect(Collectors.toList());

		return musteriList;

	}

	public List<Kitap> musteriIdyeGoreKitaplar(int musteriId) throws KutuphaneEx {

		return kiralamalar.stream().filter(k -> k.getMusteri().getId() == musteriId).map(x -> x.getKitap())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) throws KutuphaneEx {
		Kutuphane kutuphane = new Kutuphane();
		kutuphane.musteriOlusturma();
		kutuphane.kasiyerOlusturma();
		kutuphane.kitapOlusturma();
		kutuphane.kiralamaOlusturma();

		try {
			System.out.println(kutuphane.kiralamaYap());
			System.out.println(kutuphane.kitapAra());
			System.out.println(kutuphane.musteriAra());
			System.out.println(kutuphane.kiralananKitaplar());
			System.out.println(kutuphane.idyeGoreSonKiralayanKisi(3));


		} catch (KutuphaneEx e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}


		System.out.println("***");
		System.out.println(kutuphane.ahmIleBaslayanMusteri());
		System.out.println("***");
		System.out.println("kitap ismine göre kiralamalar");
		System.out.println(kutuphane.kitapAdınaGoreKiralamaYapanMusteriler("Sefiller"));
		System.out.println("***");
		System.out.println("id'ye göre kiralama yapan müşteriler");
		System.out.println(kutuphane.musteriIdyeGoreKitaplar(3));

	}
}
