package com.aligunes.service;

import com.aligunes.repository.KisiRepository;

public class KisiService {
    private KisiRepository kisiRepository;

    public KisiService() {
        this.kisiRepository = new KisiRepository();
    }
}
