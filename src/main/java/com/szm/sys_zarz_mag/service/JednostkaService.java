package com.szm.sys_zarz_mag.service;

import com.szm.sys_zarz_mag.model.Jednostka;
import com.szm.sys_zarz_mag.repository.JednostkaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JednostkaService {

    private JednostkaRepository jednostkaRepository;

    @Autowired
    public JednostkaService(JednostkaRepository jednostkaRepository) {
        this.jednostkaRepository = jednostkaRepository;
    }

    public Jednostka findJednostkaByNazwa(String nazwaJednostki) {
        return jednostkaRepository.findByJednostka(nazwaJednostki);
    }

    public Jednostka findJednostkaById(long idJednostka) {
        return jednostkaRepository.findByIdJednostka(idJednostka);
    }

    public void deleteJednostkaByNazwa(String nazwaJednostki) {
        jednostkaRepository.deleteByJednostka(nazwaJednostki);
    }

    public List<Jednostka> findJednostkiByFragmentNazwy(String fragmentNazwy) {
        return jednostkaRepository.findByJednostkaContaining(fragmentNazwy);
    }

    public List<Jednostka> findAllJednostkiSortedAlphabetically() {
        return jednostkaRepository.findByOrderByJednostkaAsc();
    }

    public List<Jednostka> findExistingJednostki() {
        return jednostkaRepository.findByJednostkaIsNotNull();
    }

    public int countJednostkiByNazwa(String nazwaJednostki) {
        return jednostkaRepository.countByJednostka(nazwaJednostki);
    }

    public List<Jednostka> findAllJednostki() {
        return jednostkaRepository.findAll();
    }
}
