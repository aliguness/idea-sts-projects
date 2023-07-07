package org.turkeyjug;

public class Araba {

   private String marka;  //ilk değerleri bu aşamada vermek pek iyi değil. Sonradan deger vermek daha kullanışlı
   private String renk;
   // renk = "Kırmızı";    Bunu kabul etmez. ilk atamada değeri: null dır.  atamasını ilk satırda ver diyor
   private int model;
   private double motorHacmi;

   final int trafikDurumu = 0;

   public int getTrafikDurumu() { //setter yapamazsın. Değer veremezsin yani sonradan değiştiremezsin çünkü final olmuştur. Çalışma zamanında değiştiremezsin.
      return trafikDurumu;
   }

   public int getModel() {
      return model;
   }

   public double getMotorHacmi() {
      return motorHacmi;
   }

   public Araba() {

   }
// public bir değişkeni hazırlayıcı metod içinde çalıştırmaz...
   public Araba(String marka, String renk, int model, double motorHacmi) {
      this.marka = marka;
      this.renk = renk;
      this.model = model;
      this.motorHacmi = motorHacmi;
   }

   @Override
   public String toString() {
      return "Araba{" +
              "marka='" + marka + '\'' +
              ", renk='" + renk + '\'' +
              ", model=" + model +
              ", motorHacmi=" + motorHacmi +
              '}';
   }
// çalışma zamanında değer değiştirmek için SET kullabiliyoruz.
   public void setMarka(String marka) {
      this.marka = marka;
   }

   public void setModel(int model) { // çalışma zamanında SET ile değer değiştirebiliyoruz.
      this.model = model;
   }

   public void setMotorHacmi(double motorHacmi) {
      this.motorHacmi = motorHacmi;
   }

   public void setRenk(String renk) {
      this.renk = renk;
   }
}
