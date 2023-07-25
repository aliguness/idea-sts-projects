package com.aligunes.service;

import com.aligunes.repository.EvRepository;

public class EvService {
    private EvRepository evRepository;

    public EvService() {
        this.evRepository = new EvRepository();
    }
}
