package com.aligunes.solidprensipleri.rapor.musteri;

import com.aligunes.solidprensipleri.Musteri;
import com.aligunes.solidprensipleri.Rapor;
import com.aligunes.solidprensipleri.rapor.IPdf;

public class MusteriRaporPdf extends Rapor implements IPdf {

    @Override
    public void mustreriRaporBilginiNotEt(Musteri musteri) {
        System.out.println("MusteriRaporPdf: " + musteri.getAdi() + " "  + musteri.getSoyadi());
    }

    @Override
    public void musteriRaporPdf(Musteri musteri) {
        System.out.println("musteriRaporPdf: " +  musteri.getAdi() + " "  + musteri.getSoyadi() );
    }
}
