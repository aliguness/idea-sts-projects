package com.aligunes.service;

import com.aligunes.repository.KiralamaRepository;
import com.aligunes.entity.Arac;
import com.aligunes.entity.Kiralama;

import java.util.List;

public class KiralamaService {

    private KiralamaRepository kiralamaRepository;

    public KiralamaService() {

        this.kiralamaRepository = new KiralamaRepository();
    }

    public Kiralama kiralamaOlustur(Kiralama kiralama) {

        return kiralamaRepository.kiralamaOlustur(kiralama);
    }

    public List<Arac> kiralananAraclarByKisiId(Long id) {

        return kiralamaRepository.kiralananAraclarByKisiId(id);
    }
}
