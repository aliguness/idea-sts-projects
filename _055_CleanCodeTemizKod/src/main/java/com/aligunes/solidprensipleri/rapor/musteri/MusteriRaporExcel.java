package com.aligunes.solidprensipleri.rapor.musteri;

import com.aligunes.solidprensipleri.Musteri;
import com.aligunes.solidprensipleri.Rapor;
import com.aligunes.solidprensipleri.rapor.IExcel;

public class MusteriRaporExcel extends Rapor implements  IExcel {

    @Override
    public void mustreriRaporBilginiNotEt(Musteri musteri) {
        System.out.println("mustreriRaporBilginiNotEt: " + musteri.getAdi() + " "  + musteri.getSoyadi());

    }
    @Override
    public void mustreriRaporExcel(Musteri musteri) {
        System.out.println("mustreriRaporExcel: " +  musteri.getAdi() + " "  + musteri.getSoyadi() );
    }
}
