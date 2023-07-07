package com.aligunes;

import java.io.*;

// Serializatione
public class AppMain {
    public static void main(String[] args) {

        Calisan calisan1 = new Calisan(1);
        calisan1.setAdi("Yiğitcan");
        calisan1.setSoyadi("Abay");
        calisan1.setDepartmani("Teknik Yönetim");
        calisan1.setEmail("abc@abac.com");
        calisan1.setMaasi(70_000);

        Calisan calisan2 = new Calisan(2, "Engin", "Ertikmen", "Stajyer", "aaa@abc.com", 10_000);


        try {
            FileOutputStream dosya = new FileOutputStream("serileşen.txt");
            ObjectOutputStream yazStream = new ObjectOutputStream(dosya);

            yazStream.writeObject(calisan1);
            yazStream.close();

            System.out.println("Yazma Başarılı");

        } catch (FileNotFoundException e) {
            System.out.println("Yazma Başarısız");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Yazma Başarısız");
            throw new RuntimeException(e);
        }

        //------------------------------------------

        try {
            FileInputStream okunacakDosya = new FileInputStream("serileşen.txt");
            ObjectInputStream okuStream = new ObjectInputStream(okunacakDosya);

            Calisan calisan = (Calisan) okuStream.readObject();
            System.out.println(calisan);
            okuStream.close();

            System.out.println("okuma başarılı");

        } catch (FileNotFoundException e) {
            System.out.println("okuma başarısız");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("okuma başarısız");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}