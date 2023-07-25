package com.aligunes.controller;

import com.aligunes.service.EvService;

public class EvController {

    private EvService evService;

    public EvController() {
        this.evService = new EvService();
    }
}
