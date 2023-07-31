package com.aligunes.controller;

import com.aligunes.entity.Arac;
import com.aligunes.entity.Kiralama;
import com.aligunes.service.KiralamaService;

import java.util.List;

public class KiralamaController {

    private KiralamaService kiralamaService;

    public KiralamaController() {

        this.kiralamaService = new KiralamaService();
    }


    public Kiralama kiralamaOlustur(Kiralama kiralama) {

        return kiralamaService.kiralamaOlustur(kiralama);
    }

    public List<Arac> kiralananAraclarByKisiId(Long id) {
        return kiralamaService.kiralananAraclarByKisiId(id);
    }
}
