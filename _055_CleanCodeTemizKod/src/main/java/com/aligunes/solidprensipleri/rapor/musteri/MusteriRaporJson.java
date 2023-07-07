package com.aligunes.solidprensipleri.rapor.musteri;

import com.aligunes.solidprensipleri.Musteri;
import com.aligunes.solidprensipleri.Rapor;
import com.aligunes.solidprensipleri.rapor.IJson;

public class MusteriRaporJson  extends Rapor implements IJson {

    @Override
    public void mustreriRaporBilginiNotEt(Musteri musteri) {
        System.out.println("MusteriRaporJson: " + musteri.getAdi() + " "  + musteri.getSoyadi());
    }

    @Override
    public void musteriRaporJson(Musteri musteri) {
        System.out.println("musteriRaporJson: " +  musteri.getAdi() + " "  + musteri.getSoyadi() );
    }
}
