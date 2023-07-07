package com.aligunes.soru1_2;

import java.util.List;

public interface IKutuphane {

	boolean kiralamaYap() throws KutuphaneEx;

	Kitap kitapAra() throws KutuphaneEx;

	Musteri musteriAra() throws KutuphaneEx;

	List<Kitap> kiralananKitaplar() throws KutuphaneEx;

}
