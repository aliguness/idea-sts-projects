package com.aligunes.soru2_StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<Personel> personelListesi = new ArrayList<>();

		personelListesi.add(new Personel("Ahmet", 30));
		personelListesi.add(new Personel("Ayşe", 25));
		personelListesi.add(new Personel("Mehmet", 35));
		personelListesi.add(new Personel("Fatma", 28));
		personelListesi.add(new Personel("Ali", 32));
		personelListesi.add(new Personel("Zeynep", 29));
		personelListesi.add(new Personel("Mustafa", 40));
		personelListesi.add(new Personel("Esra", 27));
		personelListesi.add(new Personel("Ömer", 33));
		personelListesi.add(new Personel("Gül", 26));
		personelListesi.add(new Personel("Hakan", 31));
		personelListesi.add(new Personel("Elif", 24));
		personelListesi.add(new Personel("Serkan", 38));
		personelListesi.add(new Personel("Deniz", 23));
		personelListesi.add(new Personel("Sevgi", 30));
		personelListesi.add(new Personel("Murat", 37));
		personelListesi.add(new Personel("Selin", 22));
		personelListesi.add(new Personel("Cem", 29));
		personelListesi.add(new Personel("Pınar", 36));
		personelListesi.add(new Personel("Emre", 27));
		
		
		System.out.println("=================Ornek=================");
		
		List<String> isimler = personelListesi.stream().map(Personel::getAd).sorted().collect(Collectors.toList());
		System.out.println("İsimlerin alfabetik olarak sıralanmış Listesi: "+isimler);
		
		System.out.println("=================Soru 1=================");
		
		long otuzdanBuyukler = personelListesi.stream().filter(p -> p.getYas()>30).count();
		System.out.println("Otuz yasından büyüklerin sayısı : " + otuzdanBuyukler);
		
		System.out.println("=================Soru 2=================");
		
		long aIleBaslayanlar = personelListesi.stream().filter(p->p.getAd().startsWith("A")).count();
		System.out.println("A ile baslayanların sayısı : " + aIleBaslayanlar);
		
		System.out.println("=================Soru 3=================");
		String enBuyukYas = personelListesi.stream().max(Comparator.comparingInt(Personel::getYas)).map(Personel::getAd).toString();
		System.out.println("Yaşı en büyük olan personel : " + enBuyukYas);
		
		System.out.println("=================Soru 4=================");
		int aliYas = personelListesi.stream().filter(p->p.getAd().equals("Ali")).mapToInt(p->p.getYas()).findFirst().orElse(0);
		System.out.println("Alinin yasi : " + aliYas);
		
		System.out.println("=================Soru 5=================");
		List<String> yasiEnKucukUcKisi = personelListesi.stream().sorted(Comparator.comparingInt(Personel::getYas))
				.limit(3).map(Personel::getAd)
				.collect(Collectors.toList());
		System.out.println("Yaşı en küçük 3 kişinin adı : " + yasiEnKucukUcKisi);
		
		System.out.println("=================Soru 6=================");
		long yirmiBesOtuzBesArasiSayi = personelListesi.stream().filter(p-> p.getYas()<=35 && p.getYas()>=25).count();
		System.out.println("Yaşı 25 ile 35 arasında olan kişiler : " + yirmiBesOtuzBesArasiSayi);
		
		System.out.println("=================Soru 7=================");
		List<String> dortHarftenUzunlar = personelListesi.stream().filter(p->p.getAd().length()>4).map(p->p.getAd())
				.collect(Collectors.toList());
		System.out.println("İsmi 4 harften uzun olan kişiler : " + dortHarftenUzunlar);
		
		System.out.println("=================Soru 8=================");
		List<String> yasiEnBuyukIkıKisi = personelListesi.stream()
				.sorted(Comparator.comparingInt(Personel::getYas).reversed())
				.limit(2)
				.map(p->p.getAd()).collect(Collectors.toList());
		System.out.println("Yasi en büyük 2 kişi : " + yasiEnBuyukIkıKisi);
		
		System.out.println("=================Soru 9=================");
		List<String> aIleBitenler = personelListesi.stream().filter(p->p.getAd().endsWith("a")).map(p->p.getAd().toUpperCase())
				.collect(Collectors.toList());
		System.out.println("a ile bitenler : " + aIleBitenler);
		
		System.out.println("=================Soru 10=================");
		double isimUzunlukOrtalamasi = personelListesi.stream().mapToDouble(p->p.getAd().length()).average().getAsDouble();
		System.out.println("İsimlerin uzunluklarının ortalaması : " + isimUzunlukOrtalamasi);
		
		System.out.println("=================Soru 11=================");
		int enUzunIsminYasi = personelListesi.stream().max(Comparator.comparingInt(p->p.getAd().length())).map(p->p.getYas()).get();
		System.out.println("İsmi en uzun olan kişinin yaşı : " + enUzunIsminYasi);
		
		System.out.println("=================Soru 12=================");
		boolean ahmetIsmiVarMi = personelListesi.stream().map(p->p.getAd()).anyMatch(i->i.equalsIgnoreCase("Ahmet"));
		System.out.println("Ahmet ismi var mi ? " + ahmetIsmiVarMi);
		
		System.out.println("=================Soru 13=================");
		List<String> terstenVeAlfabetikIsimler = personelListesi.stream().map(p->p.getAd()).map(i-> new StringBuilder(i).reverse().toString())
				.sorted().collect(Collectors.toList());
		System.out.println("Ters çevrilmiş ve alfabetik sıralanmış isimler : " + terstenVeAlfabetikIsimler);
		
		System.out.println("=================Soru 14=================");
		List<String> eHarfiGecenler = personelListesi.stream().filter(p-> p.getAd().contains("e") || p.getAd().contains("E")).map(p->p.getAd())
				.collect(Collectors.toList());
		System.out.println("İsminde e harfi olan kişiler : " + eHarfiGecenler);
		
		System.out.println("=================Soru 15=================");
		Map<String, Integer> enKucukYasaSahip = personelListesi.stream().sorted(Comparator.comparingInt(Personel::getYas)).limit(1)
				.collect(Collectors.toMap(x->x.getAd(), y->y.getYas()));
		System.out.println("Yaşı en küçük olan kişinin adı ve yaşı : " + enKucukYasaSahip);
		

	}

}
