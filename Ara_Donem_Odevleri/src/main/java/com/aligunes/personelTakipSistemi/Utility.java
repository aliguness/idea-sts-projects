package com.aligunes.personelTakipSistemi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.Scanner;

public class Utility {
	
	static Scanner scanner = new Scanner(System.in);
	

	
	/*
	 * Dogru deger alana kadar bizden veri almaya devam eder.
	 * int deger alana kadar..
	 * 
	 */
	
	public static int intDegerAlma(String sorgu) {
		boolean kontrol=false;
		int deger = 0;
		do {
			
			try {
				
				System.out.println(sorgu);
				
				deger = scanner.nextInt();
				kontrol = false;
			}catch (Exception e) {
				kontrol =true;
				System.out.println(e.toString() +" " +  " Lütfen sayısal bir değer giriniz.. " );
			}finally {
				scanner.nextLine();
			}
			
		}while(kontrol);
		
		return deger;
	}
	
	public static double doubleDegerAlma(String sorgu) {
		boolean kontrol=false;
		double deger = 0;
		do {
			
			try {
				
				System.out.println(sorgu);
				
				deger = Double.parseDouble(scanner.nextLine());
				kontrol = false;
			}catch (Exception e) {
				kontrol =true;
				System.out.println(e.toString() +" " +  " Lütfen sayısal bir değer giriniz.. " );
			}
			
		}while(kontrol);
		
		return deger;
	}
	
	public static long longDegerAlma(String sorgu) {
		boolean kontrol=false;
		long deger = 0;
		do {
			
			try {
				
				System.out.println(sorgu);
				
				deger = Long.parseLong(scanner.nextLine());
				kontrol = false;
			}catch (Exception e) {
				kontrol =true;
				System.out.println(e.toString() +" " +  " Lütfen sayısal bir değer giriniz.. " );
			}
			
		}while(kontrol);
		
		return deger;
	}
	
	public static String stringDegerAlma(String sorgu) {
		System.out.println(sorgu);
		return scanner.nextLine();
	}
	
	public static LocalDate stringTarihDegeriAlma(String sorgu) {
		
		boolean kontrol = false;
		LocalDate date = null;
		do {
			try {
				System.out.println(sorgu);
				date=LocalDate.parse(scanner.nextLine());
				kontrol = false;
			} catch (Exception e) {
				System.out.println(e.toString()+ " : Lütfen yıl-ay-gun formatında bir tarih giriniz..");
				kontrol = true;
			}
			
		} while (kontrol);
		return date;
		
		
	}
	
	public static Optional<LocalDate> stringTarihDegeriniTarihDegerineCevirme(String sorgu, String tarih) {
		
		boolean kontrol = false;
		LocalDate date = null;
		
			try {
				System.out.println(sorgu);
				date=LocalDate.parse(tarih);
				kontrol = false;
			} catch (Exception e) {
				System.out.println(e.toString()+ " : Lütfen yıl-ay-gun formatında bir tarih giriniz..");
				kontrol = true;
			}
			
		
		return Optional.ofNullable(date);
		
		
	}
	
	public static LocalDate formatliLocalDateCevirme(String tarih,String format) {
		
		LocalDate date = null;
		
		try {
			DateTimeFormatter formater = DateTimeFormatter.ofPattern(format);
			date = LocalDate.parse(tarih, formater);
		} catch (Exception e) {
			System.out.println("Lütfen geçerli tarih giriniz");
		}
		return date;
		
	}
	

}
