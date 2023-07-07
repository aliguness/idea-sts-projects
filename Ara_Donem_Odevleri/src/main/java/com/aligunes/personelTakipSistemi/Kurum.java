package com.aligunes.personelTakipSistemi;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Kurum {

	private String ad;
	private List<Personel> personelListesi;
	private List<Departman> departmanListesi;

	public Kurum(String ad) {
		super();
		this.ad = ad;
		personelListesi = new ArrayList<>();
		departmanListesi = new ArrayList<>();
	}

	public void calistir() {

		departmanOlustur();
		personelOlustur();
		int islem = 0;

		do {
			anaMenu();
			islem = Utility.intDegerAlma("Lütfen yapılacak işlemi seçiniz");

			switch (islem) {
			case 1:
				personelIslemleri();

				break;
			case 2:
				muhasebeIslemleri();
				break;
			case 3:
				raporlamalar();
				break;
			case 0:
				System.out.println("Çıkış yapılıyor!");
				break;

			default:
				System.out.println("Lütfen geçerli bir işlem giriniz.");
				break;
			}

		} while (islem != 0);
	}

	private void raporlamalar() {
		int islem = 0;

		do {
			raporlamalarMenu();
			islem = Utility.intDegerAlma("Lütfen yapılacak işlemi seçiniz");

			switch (islem) {
			case 1:
				departmanPersonelListele();
				break;
			case 2:
				enCokPersonelBulunanDepartman();
				break;
			case 3:
				departmanlaraGoreMaasOrtalamalari();
				break;
			case 4:
				mudurlerinSorumluOlduguDepartmanlariListele();
				break;
			case 5:
				kayitTarihineGoreListele();
				break;
			case 6:
				ayniGunIcındeIseBaslayanlariListele();
				break;

			default:
				break;
			}

		} while (islem != 0);

	}

	private void ayniGunIcındeIseBaslayanlariListele() {

		personelListesi.stream().collect(Collectors.groupingBy(x->x.getIseGirisTarihi())).forEach((x,y) -> System.out.println(x + "==>>" + y));;

	}

	private void kayitTarihineGoreListele() {
		personelListesi.stream().sorted(Comparator.comparing(Personel::getIseGirisTarihi))
		.collect(Collectors.toMap(x->x.getIseGirisTarihi(), y->y.getAd())).forEach((x,y)-> System.out.println(x + "=>>" + y));
		

	}

	private void mudurlerinSorumluOlduguDepartmanlariListele() {
		personelListesi.stream().filter(p -> p.getDepartmani().equals(EDepartman.MUDUR))
				.collect(Collectors.toMap(x ->(Mudur) x, x -> ((Mudur)x).getSorumluOlduguDepartmanlar())).
				forEach((x,y)-> System.out.println(x.getAd()+"'nın sorumlu olduğu departmanlar =" + y));;
		

	}

	private void departmanlaraGoreMaasOrtalamalari() {
		Map<EDepartman, Double> departmanMaasOrtMap = departmanListesi.stream().collect(Collectors.toMap(
				x -> x.getDepartmanAdi(),
				y -> y.getPersonelList().stream().map(x -> x.getMaas()).collect(Collectors.averagingDouble(x -> x))));

		departmanMaasOrtMap.forEach((k, v) -> System.out.println(k + " departmanının ortalaması =>> " + v));

	}

	private void enCokPersonelBulunanDepartman() {
		EDepartman departman = departmanListesi.stream().max(Comparator.comparingInt(x -> x.getPersonelList().size()))
				.map(x -> x.getDepartmanAdi()).get();
		System.out.println(departman);
	}

	private void departmanPersonelListele() {
		departmanlariListele();
		int departman = Utility.intDegerAlma("Lütfen departmanı seçiniz.");
		departmanListesi.get(departman - 1).getPersonelList().forEach(System.out::println);
	}

	private void muhasebeIslemleri() {
		int islem = 0;

		do {
			muhasebeIslemMenu();
			islem = Utility.intDegerAlma("Lütfen yapılacak işlemi seçiniz");

			switch (islem) {
			case 1:
				maasPersonelTanimla();
				break;
			case 2:
				odemeListesi();
				break;

			default:
				break;
			}
		} while (islem != 0);

	}

	private void odemeListesi() {
		personelListesi.stream().collect(Collectors.toMap(x -> x.getAd(), y -> y.getMaas()))
				.forEach((a, m) -> System.out.println(a + "=>>" + m));

	}

	private void maasPersonelTanimla() {

		personelListele();
		int personelSirasi = Utility.intDegerAlma("Maaş tanımlamak istediğiniz personeli seçiniz.");

		if (personelSirasi < 1 || personelSirasi > personelListesi.size()) {

			System.out.println("Lütfen geçerli bir işlem seçiniz..");

		} else {
			float maas = (float) Utility.doubleDegerAlma("Maaşı giriniz");

			personelListesi.get(personelSirasi - 1).setMaas(maas);

			System.out.println(
					personelListesi.get(personelSirasi - 1).getAd() + "'ın Maası " + maas + " olarak güncellenmiştir.");
		}

	}

	public void personelIslemleri() {

		int islem = 0;
		do {
			personelIslemMenu();
			islem = Utility.intDegerAlma("Lütfen yapacağınız işlemi giriniz");

			switch (islem) {
			case 1:
				personelEkle();
				break;
			case 2:
				personelListele();
				break;
			case 3:
				personelDüzenle();
				break;
			case 4:
				departmanEkle();
				break;
			case 5:
				departmanlariListele();
				break;

			default:
				System.out.println("Lütfen geçerli bir işlem giriniz..");
				break;
			}

		} while (islem != 0);

	}

	private void departmanlariListele() {
		for (int i = 0; i < departmanListesi.size(); i++) {
			System.out.println(i + 1 + " - " + departmanListesi.get(i));
		}

	}

	private void departmanEkle() {
		String departmanAdi = Utility.stringDegerAlma("Lütfen departman adını giriniz");
		Departman departman = new Departman(departmanAdi);
		departmanListesi.add(departman);

	}

	private void personelDüzenle() {
		personelListele();
		int personelSirasi = Utility.intDegerAlma("Düzenlemek istediğiniz personeli seçiniz.");
		String ad = Utility.stringDegerAlma("Personelin doğru adını giriniz");
		String soyad = Utility.stringDegerAlma("Personelin doğru soyadını giriniz");
		float maas = (float) Utility.doubleDegerAlma("Personelin doğru maaşını giriniz.");
		personelListesi.get(personelSirasi - 1).setAd(ad);
		personelListesi.get(personelSirasi - 1).setSoyad(soyad);
		personelListesi.get(personelSirasi - 1).setMaas(maas);

		System.out.println("Personel düzenlenmiştir.");

	}

	private void personelListele() {

		for (int i = 0; i < personelListesi.size(); i++) {
			System.out.println(i + 1 + "-" + personelListesi.get(i));
		}

	}

	private void personelEkle() {
		EDepartman[] departlamnlar = EDepartman.values();

		String ad = Utility.stringDegerAlma("Lütfen personelin adını giriniz.");
		String soyad = Utility.stringDegerAlma("Lütfen personelin soyadını giriniz.");

		for (EDepartman eDepartman : departlamnlar) {
			System.out.println(eDepartman.ordinal() + 1 + "-" + eDepartman.toString());
		}

		int secim = Utility.intDegerAlma("Lütfen personelin Departmanını seçiniz");
		switch (secim) {
		case 1:
			Hizmetli hizmetli = new Hizmetli(ad, soyad, EDepartman.HIZMETLI);
			departmanListesinePersonelEkle(hizmetli);
			personelListesi.add(hizmetli);
			break;
		case 2:
			BuroPersoneli buroPersoneli = new BuroPersoneli(ad, soyad, EDepartman.BURO);
			departmanListesinePersonelEkle(buroPersoneli);
			personelListesi.add(buroPersoneli);
			break;
		case 3:
			InsanKaynaklariPersoneli insanKaynaklariPersoneli = new InsanKaynaklariPersoneli(ad, soyad,
					EDepartman.INSAN_KAYNAKLARI);
			departmanListesinePersonelEkle(insanKaynaklariPersoneli);
			personelListesi.add(insanKaynaklariPersoneli);
			break;
		case 4:
			TeknikPersonel teknikPersonel = new TeknikPersonel(ad, soyad, EDepartman.TEKNIK_PERSONEL);
			departmanListesinePersonelEkle(teknikPersonel);
			personelListesi.add(teknikPersonel);
			break;
		case 5:
			MuhasebePersoneli muhasebePersoneli = new MuhasebePersoneli(ad, soyad, EDepartman.MUHASEBE);
			departmanListesinePersonelEkle(muhasebePersoneli);
			personelListesi.add(muhasebePersoneli);
			break;
		case 6:
			Mudur mudur = new Mudur(ad, soyad, EDepartman.MUDUR);
			departmanListesinePersonelEkle(mudur);
			personelListesi.add(mudur);
			break;
		case 7:
			GenelMudur genelMudur = new GenelMudur(ad, soyad, EDepartman.GENEL_MUDUR);
			departmanListesinePersonelEkle(genelMudur);
			personelListesi.add(genelMudur);
			break;

		default:

			System.out.println("Lütfen geçerli bir işlem giriniz");
			break;
		}

	}

	public void anaMenu() {
		System.out.println("1. Personel İşlemleri");
		System.out.println("2. Muhasebe İşlemleri");
		System.out.println("3. Raporlamalar");
		System.out.println("0. Çıkış");
	}

	public void personelIslemMenu() {
		System.out.println("1. Personel Ekleme");
		System.out.println("2. Personel Listesi");
		System.out.println("3. Personel Düzenleme");
		System.out.println("4. Departman Ekleme");
		System.out.println("5. Departman Listesi");
		System.out.println("0. Çıkış");
	}

	public void muhasebeIslemMenu() {
		System.out.println("1. Maaş Personel Tanımlama");
		System.out.println("2. Ödeme Listesi");
		System.out.println("0. Çıkış");
	}

	public void raporlamalarMenu() {
		System.out.println("1. Departman Personel Listesli");
		System.out.println("2. En Çok Personel Bulunan Departman");
		System.out.println("3. Departmanlara Göre maaş ortalamaları");
		System.out.println("4. Müdürlerin sorumlu olduğu departman listesi");
		System.out.println("5. Kayıt tarihlerine göre personellerin sıralı listesi");
		System.out.println("6. Aynı gün içinde işe başlayan personellerin listesi");
		System.out.println("0. Çıkış");
	}

	public void departmanOlustur() {
		Departman departman1 = new Departman(EDepartman.HIZMETLI);
		Departman departman2 = new Departman(EDepartman.BURO);
		Departman departman3 = new Departman(EDepartman.INSAN_KAYNAKLARI);
		Departman departman4 = new Departman(EDepartman.TEKNIK_PERSONEL);
		Departman departman5 = new Departman(EDepartman.MUHASEBE);
		Departman departman6 = new Departman(EDepartman.MUDUR);
		Departman departman7 = new Departman(EDepartman.GENEL_MUDUR);

		departmanListesi.add(departman1);
		departmanListesi.add(departman2);
		departmanListesi.add(departman3);
		departmanListesi.add(departman4);
		departmanListesi.add(departman5);
		departmanListesi.add(departman6);
		departmanListesi.add(departman7);
	}

	public void departmanListesinePersonelEkle(Personel personel) {

		for (Departman departman : departmanListesi) {
			if (departman.getDepartmanAdi().equals(personel.getDepartmani())) {
				departman.getPersonelList().add(personel);
			}
		}
	}

	public void personelOlustur() {
		BuroPersoneli buroPersoneli1 = new BuroPersoneli("Ali", "Güneş", EDepartman.BURO, 35000,
				LocalDate.of(2019, 10, 19), EVardiya.SABAH);
		BuroPersoneli buroPersoneli2 = new BuroPersoneli("Berna", "Güneş", EDepartman.BURO, 25000,
				LocalDate.of(2017, 7, 30), EVardiya.SABAH);
		BuroPersoneli buroPersoneli3 = new BuroPersoneli("Efe", "Güneş", EDepartman.BURO, 37500,
				LocalDate.of(2021, 1, 18), EVardiya.SABAH);

		departmanListesinePersonelEkle(buroPersoneli1);
		departmanListesinePersonelEkle(buroPersoneli2);
		departmanListesinePersonelEkle(buroPersoneli3);
		personelListesi.add(buroPersoneli1);
		personelListesi.add(buroPersoneli2);
		personelListesi.add(buroPersoneli3);

		GenelMudur genelMudur = new GenelMudur("Mehmet", "Güneş", EDepartman.GENEL_MUDUR, 100_000,
				LocalDate.of(2011, 4, 2));
		departmanListesinePersonelEkle(genelMudur);
		personelListesi.add(genelMudur);

		Hizmetli hizmetli1 = new Hizmetli("Ayberk", "Tuna", EDepartman.HIZMETLI, 15500, LocalDate.of(2018, 7, 10),
				EVardiya.SABAH);
		Hizmetli hizmetli2 = new Hizmetli("Serkan", "Özgenç", EDepartman.HIZMETLI, 15500, LocalDate.of(2020, 3, 20),
				EVardiya.GECE);
		departmanListesinePersonelEkle(hizmetli1);
		departmanListesinePersonelEkle(hizmetli2);
		personelListesi.add(hizmetli1);
		personelListesi.add(hizmetli2);

		InsanKaynaklariPersoneli insanKaynaklariPersoneli1 = new InsanKaynaklariPersoneli("Suleyman", "Demirel",
				EDepartman.INSAN_KAYNAKLARI, 30000, LocalDate.of(2016, 3, 10));
		InsanKaynaklariPersoneli insanKaynaklariPersoneli2 = new InsanKaynaklariPersoneli("Wolkan", "Konak",
				EDepartman.INSAN_KAYNAKLARI, 35000, LocalDate.of(2015, 4, 3));
		departmanListesinePersonelEkle(insanKaynaklariPersoneli1);
		departmanListesinePersonelEkle(insanKaynaklariPersoneli2);
		personelListesi.add(insanKaynaklariPersoneli1);
		personelListesi.add(insanKaynaklariPersoneli2);

		Mudur mudur1 = new Mudur("Deniz", "Güneş", EDepartman.MUDUR, 75000, LocalDate.of(2013, 1, 15));
		Mudur mudur2 = new Mudur("Şükran", "Güneş", EDepartman.MUDUR, 70000, LocalDate.of(2016, 2, 19));
		departmanListesinePersonelEkle(mudur1);
		departmanListesinePersonelEkle(mudur2);
		personelListesi.add(mudur1);
		personelListesi.add(mudur2);

		
		mudur1.getSorumluOlduguDepartmanlar().add(departmanListesi.get(0));
		mudur1.getSorumluOlduguDepartmanlar().add(departmanListesi.get(1));
		mudur1.getSorumluOlduguDepartmanlar().add(departmanListesi.get(2));
		mudur2.getSorumluOlduguDepartmanlar().add(departmanListesi.get(3));
		mudur2.getSorumluOlduguDepartmanlar().add(departmanListesi.get(4));
		

		MuhasebePersoneli muhasebePersoneli1 = new MuhasebePersoneli("Kemal", "Sunal", EDepartman.MUHASEBE, 30000,
				LocalDate.of(2014, 5, 20));
		MuhasebePersoneli muhasebePersoneli2 = new MuhasebePersoneli("Adile", "Naşit", EDepartman.MUHASEBE, 20000,
				LocalDate.of(2022, 4, 10));
		departmanListesinePersonelEkle(muhasebePersoneli1);
		departmanListesinePersonelEkle(muhasebePersoneli2);
		personelListesi.add(muhasebePersoneli1);
		personelListesi.add(muhasebePersoneli2);

		TeknikPersonel teknikPersonel1 = new TeknikPersonel("Volkan", "Pomak", EDepartman.TEKNIK_PERSONEL, 30000,
				LocalDate.of(2017, 6, 8), EVardiya.GECE);
		TeknikPersonel teknikPersonel2 = new TeknikPersonel("Melih", "Öztürk", EDepartman.TEKNIK_PERSONEL, 35500,
				LocalDate.of(2016, 2, 1), EVardiya.SABAH);
		departmanListesinePersonelEkle(teknikPersonel1);
		departmanListesinePersonelEkle(teknikPersonel2);
		personelListesi.add(teknikPersonel1);
		personelListesi.add(teknikPersonel2);
	}

}
