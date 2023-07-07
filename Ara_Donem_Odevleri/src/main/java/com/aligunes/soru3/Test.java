package com.aligunes.soru3;

public class Test {
	
	public static void main(String[] args) {
		MyArrayList<String> myList = new MyArrayList<>();
		
		// Eleman ekleme
		 myList.add("Elma");
		 myList.add("Muz");
		 myList.add("Portakal");
		 myList.add("Kayısı");
		 myList.add("Karpuz");
		 myList.add("Şeftali");
		 myList.add("Kavun");
		 myList.add("Kiraz");
		 myList.add("Vişne");
		// Elemanları ekrana yazdırma
		 System.out.println("MyList: " + myList); // [Elma, Muz, Portakal, Kayısı, Karpuz, Şeftali, Kavun]
		 
		 // Belirli bir indekse eleman ekleme
		 myList.add(3, "Mango");
		 // Elemanları ekrana yazdırma
		 System.out.println("Mango eklendikten sonra MyList: " + myList); // [Elma, Mango, Muz, Portakal]
		 // Belirli bir indeksteki elemanı değiştirme
		 myList.set(0, "Üzüm");
		 // Elemanları ekrana yazdırma
		 System.out.println("Üzüm olarak değiştirildikten sonra MyList: " + myList); // [Üzüm, Mango, Muz, Portakal]
		 // Belirli bir indeksteki elemanı kaldırma
		 myList.remove(2);
		 // Elemanları ekrana yazdırma
		 System.out.println("2. indeksi kaldırıldıktan sonra MyList: " + myList); // [Üzüm, Mango, Portakal]
		 // Belirli bir elemanın listede olup olmadığını kontrol etme
		 System.out.println("MyList Mango içeriyor mu? " + myList.contains("Mango")); // true
		 System.out.println("MyList Portakal içeriyor mu? " + myList.contains("Portakal")); // false
		 // Listenin boyutunu alma
		 System.out.println("MyList'in boyutu: " + myList.size()); // 7
		 
		// Listenin boş olup olmadığını kontrol etme
		 System.out.println("MyList boş mu? " + myList.isEmpty()); // false 
	}

}
