package com.aligunes.oopkavramlar;

// Class
public class Calisan {

    // Fields  // Variables

    // private 'lar erisim belirteclerimizdir.private, public, protected bunlarla - Encapsulation(koruma) yapıyoruz.
    private Long kimlikNo;

    private String adi;
    private String soyadi;

    private Float maas;
    private Boolean sigorta;

    public Calisan() {
    }
    // hazırlayıcı metothodlar - Constructor
    public Calisan(Long kimlikNo, String adi, String soyadi, Float maas, Boolean sigorta) {
        this.kimlikNo = kimlikNo;
        this.adi = adi;
        this.soyadi = soyadi;
        this.maas = maas;
        this.sigorta = sigorta;
    }
// setter's Getter's
    public Long getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(Long kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public Float getMaas() {
        return maas;
    }

    public void setMaas(Float maas) {
        this.maas = maas;
    }

    public Boolean getSigorta() {
        return sigorta;
    }

    public void setSigorta(Boolean sigorta) {
        this.sigorta = sigorta;
    }

    // toString Method 'u.
    @Override  // metodu kendime göre dolduracağım diyor. EZME işlemi. Yani istediğin gibi kullanmak.
    public String toString() {
        return "Calisan{" +
                "kimlikNo=" + kimlikNo +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", maas=" + maas +
                ", sigorta=" + sigorta +
                '}';
    }
    // Sıradan bir method
    public Float getMaasSonDurumu(float asgariUcret, float bonus){
        return asgariUcret * 3 + bonus;
    }

    // Polymorphism
    public Float getMaasSonDurumu(float asgariUcret, float bonus, int ucretliIzin){
        return asgariUcret * 3 + bonus + ucretliIzin * 14;
    }
}
