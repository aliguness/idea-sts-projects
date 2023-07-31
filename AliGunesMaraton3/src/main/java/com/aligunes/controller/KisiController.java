package com.aligunes.controller;

import com.aligunes.entity.Kisi;
import com.aligunes.service.KisiService;

public class KisiController {

    private KisiService kisiService;

    public KisiController() {

        this.kisiService = new KisiService();
    }

    public Kisi kisiOlustur(Kisi kisi){
        return kisiService.kisiOlustur(kisi);
    }

    public Kisi kisiAraById(Long id) {
        return kisiService.kisiAraById(id);
    }
}
