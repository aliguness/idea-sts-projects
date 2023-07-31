package com.aligunes.controller;

import com.aligunes.entity.Arac;
import com.aligunes.service.AracService;

import java.util.List;

public class AracController {

    private AracService aracService;

    public AracController() {
        this.aracService = new AracService();
    }

    public Arac aracOlustur(Arac arac) {
        return aracService.aracOlustur(arac);
    }

    public Arac aracAraById(Long id) {
        return aracService.aracAraById(id);
    }

    public List<Arac> kiradakiAraclar() {
        return aracService.kiradakiAraclar();
    }

    public List<Arac> musaitAracler() {
        return aracService.musaitAraclar();
    }
}
