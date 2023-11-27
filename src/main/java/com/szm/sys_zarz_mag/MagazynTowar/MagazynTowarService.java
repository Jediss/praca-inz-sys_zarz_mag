package com.szm.sys_zarz_mag.MagazynTowar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagazynTowarService {

    private MagazynTowarRepository magazynTowarRepository;

    @Autowired
    public MagazynTowarService(MagazynTowarRepository magazynTowarRepository) {
        this.magazynTowarRepository = magazynTowarRepository;
    }

    // Znajdź towary przypisane do danego magazynu
    public List<MagazynTowar> znajdzTowaryWMagazynie(Long idMagazyn) {
        return magazynTowarRepository.findByMagazynIdMagazyn(idMagazyn);
    }

    // Znajdź towary z danego magazynu o określonej nazwie
    public List<MagazynTowar> znajdzTowaryWMagazynieONazwie(Long idMagazyn, String nazwaMagazyn) {
        return magazynTowarRepository.findByMagazynNazwaMagazyn(nazwaMagazyn);
    }

    // Znajdź magazyny, w których znajduje się dany towar
    public List<MagazynTowar> znajdzMagazynyZTowarem(Long idTowar) {
        return magazynTowarRepository.findByTowarIdTowar(idTowar);
    }

    // Znajdź towar w określonym magazynie na podstawie jego ID
    public MagazynTowar znajdzTowarWMagazynie(Long idTowar, Long idMagazyn) {
        return magazynTowarRepository.findByTowarIdTowarAndMagazynIdMagazyn(idTowar, idMagazyn);
    }

    /*// Znajdź towar w danym magazynie
    public MagazynTowar znajdzTowarWTymMagazynie(Long idTowar, Long idMagazyn) {
        return magazynTowarRepository.findTowarInMagazyn(idTowar, idMagazyn);
   }*/
}
