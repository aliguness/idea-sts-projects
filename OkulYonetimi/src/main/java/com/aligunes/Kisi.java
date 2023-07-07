package com.aligunes;

public class Kisi {
    private String isim;
    private String soyisim;

    public Kisi(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kisi{");
        sb.append("isim='").append(isim).append('\'');
        sb.append(", soyisim='").append(soyisim).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
