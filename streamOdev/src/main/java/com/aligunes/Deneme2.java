package com.aligunes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
1- isminde a gecen ogrencileri getirelim
2- her bir ogrencinin not ortalamasını hesaplayıp double bir listede toplayalım
3- butun ogrencilerin not ortalamasını hesaplayalım
4- bolumeGoreMaple metoduyla beraber ogrencileri bolumlere gore mapleyelim
5- ortalaması 50 den buyuk olanların durumu gecti kucuklerin durumu kaldı olarak guncellensin
6- her ogrenciye 4 uncu notuda ekleyelim
7- her ogrencinin herbir notuna 15 puan daha ekleyelim
8- her ogrenciyi id'sine karsılık ismi gelecek şekilde mapleyelim
*/
public class Deneme2 {

	static List<Student> students = new ArrayList<>();

	public static void main(String[] args) {
		Deneme2 deneme2 = new Deneme2();
		System.out.println(deneme2.aHarfiGecenOgrenciler());
		
	//	List<Double> ortalamalar=students.stream().map(x->x.getNotlar().stream().
	//			mapToDouble(y->y.doubleValue()).sum()/x.getNotlar().size()).collect(Collectors.toList());
	//	System.out.println(ortalamalar);

		List<Double> ortalamalar=students.stream().map(x->x.getNotlar().stream().
				mapToDouble(y->y.doubleValue()).average().getAsDouble()).collect(Collectors.toList());
		System.out.println(ortalamalar);


		
		students.stream().forEach(x->System.out.println(x.getName()  + "'in Ortalaması : "+x.ortHesapla()));
		
		Double sinifOrtalamasi = students.stream().mapToDouble(x->x.ortHesapla()).sum()/students.size();
		System.out.println("Sınıf Ortalaması : " +sinifOrtalamasi);
		
		
		System.out.println(deneme2.bolumeGoreMaple());
		
		students.stream().filter(x->x.ortHesapla()<50.0).forEach(x->x.setDurum("Kaldı"));
		students.stream().filter(x->x.ortHesapla()>=50.0).forEach(x->x.setDurum("Geçti"));
		
		students.stream().forEach(x->x.getNotlar().add(75.0));
		
		students.stream().forEach(x->x.setNotlar(x.getNotlar().stream().map(y->y + 15).toList()));
		
		System.out.println(students);
		Double sinifOrtalamasi2 = students.stream().mapToDouble(x->x.ortHesapla()).sum()/students.size();
		System.out.println("Sınıf Ortalaması-2 : " +sinifOrtalamasi2);
		
		Map<Integer, String> map = students.stream().collect(Collectors.toMap(x-> x.getId(), y-> y.getName()));
		System.out.println(map);
	}
	public Deneme2() {
		Student student = new Student();
		student.name = "Ali";
		student.notlar.add(50.0);
		student.notlar.add(50.0);
		student.notlar.add(50.0);
		student.bolum = "tm";
		student.id = 1;
		Student student2 = new Student();
		student2.name = "Ayşe";
		student2.notlar.add(80.0);
		student2.notlar.add(55.5);
		student2.notlar.add(79.4);
		student2.bolum = "mat";
		student2.id = 2;
		Student student3 = new Student();
		student3.name = "Hakan";
		student3.notlar.add(86.0);
		student3.notlar.add(97.5);
		student3.notlar.add(50.4);
		student3.bolum = "mat";
		student3.id = 3;
		Student student4 = new Student();
		student4.name = "Mert";
		student4.notlar.add(10.0);
		student4.notlar.add(35.5);
		student4.notlar.add(58.4);
		student4.bolum = "tm";
		student4.id = 4;
		Student student5 = new Student();
		student5.name = "Gamze";
		student5.notlar.add(68.0);
		student5.notlar.add(23.5);
		student5.notlar.add(90.4);
		student5.bolum = "mat";
		student5.id = 5;
		Student student6 = new Student();
		student6.name = "Merve";
		student6.notlar.add(36.0);
		student6.notlar.add(23.5);
		student6.notlar.add(58.4);
		student6.bolum = "tm";
		student6.id = 6;
		students.add(student);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
	}
	
	public List<Student> aHarfiGecenOgrenciler(){
		return students.stream().filter(x-> x.getName().contains("a")).collect(Collectors.toList());
		
	}
	
	public Map<String,List<Student>> bolumeGoreMaple() {
		return students.stream().collect(Collectors.groupingBy(x-> x.getBolum()));
	}

}
