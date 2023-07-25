package com.aligunes.service;

import com.aligunes.repository.KiralamaRepository;

public class KiralamaService {
    private KiralamaRepository kiralamaRepository;

    public KiralamaService() {
        this.kiralamaRepository = new KiralamaRepository();
    }
}
