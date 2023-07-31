package com.aligunes.service;

import com.aligunes.repository.KisiRepository;
import com.aligunes.entity.Kisi;

public class KisiService {

    private KisiRepository kisiRepository;

    public KisiService() {
        this.kisiRepository = new KisiRepository();
    }

    public Kisi kisiOlustur(Kisi kisi) {
        return kisiRepository.kisiOlustur(kisi);
    }

    public Kisi kisiAraById(Long id) {
        return kisiRepository.kisiAraById(id);
    }
}
