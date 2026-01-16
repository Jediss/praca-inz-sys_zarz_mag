package com.szm.sys_zarz_mag.service;

import com.szm.sys_zarz_mag.model.Stawka;
import com.szm.sys_zarz_mag.repository.StawkaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StawkaService {

    private StawkaRepository stawkaRepository;

    @Autowired
    public StawkaService(StawkaRepository stawkaRepository) {
        this.stawkaRepository = stawkaRepository;
    }

    public Stawka findStawkaByWartosc(double wartosc) {
        return stawkaRepository.findByWartosc(wartosc);
    }

    public Stawka findStawkaById(long id) {
        return stawkaRepository.findByIdStawka(id);
    }

    public void deleteStawkaByWartosc(double wartosc) {
        stawkaRepository.deleteByWartosc(wartosc);
    }

    public List<Stawka> findStawkiByWartoscGreaterThan(double wartosc) {
        return stawkaRepository.findByWartoscGreaterThan(wartosc);
    }

    public List<Stawka> findStawkiByWartoscLessThan(double wartosc) {
        return stawkaRepository.findByWartoscLessThan(wartosc);
    }

    public List<Stawka> findStawkiByWartoscBetween(double wartosc1, double wartosc2) {
        return stawkaRepository.findByWartoscBetween(wartosc1, wartosc2);
    }

    public List<Stawka> findExistingStawki() {
        return stawkaRepository.findByWartoscIsNotNull();
    }

    public int countStawkiByWartosc(double wartosc) {
        return stawkaRepository.countByWartosc(wartosc);
    }
}
