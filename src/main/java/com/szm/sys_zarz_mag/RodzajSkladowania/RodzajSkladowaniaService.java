package com.szm.sys_zarz_mag.RodzajSkladowania;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RodzajSkladowaniaService {

    private final RodzajSkladowaniaRepository rodzajSkladowaniaRepository;

    @Autowired
    public RodzajSkladowaniaService(RodzajSkladowaniaRepository rodzajSkladowaniaRepository) {
        this.rodzajSkladowaniaRepository = rodzajSkladowaniaRepository;
    }

    public RodzajSkladowania findRodzajSkladowaniaByNazwa(String nazwaRodzaju) {
        return rodzajSkladowaniaRepository.findByRodzajSkladowania(nazwaRodzaju);
    }

    public RodzajSkladowania findRodzajSkladowaniaById(long idRodzaju) {
        return rodzajSkladowaniaRepository.findByIdRodzajSkladowania(idRodzaju);
    }

    public void deleteRodzajSkladowaniaByNazwa(String nazwaRodzaju) {
        rodzajSkladowaniaRepository.deleteByRodzajSkladowania(nazwaRodzaju);
    }

    public List<RodzajSkladowania> findRodzajeSkladowaniaByFragmentNazwy(String fragmentNazwy) {
        return rodzajSkladowaniaRepository.findByRodzajSkladowaniaContaining(fragmentNazwy);
    }

    public List<RodzajSkladowania> findExistingRodzajeSkladowania() {
        return rodzajSkladowaniaRepository.findByRodzajSkladowaniaIsNotNull();
    }

    public int countRodzajeSkladowaniaByNazwa(String nazwaRodzaju) {
        return rodzajSkladowaniaRepository.countByRodzajSkladowania(nazwaRodzaju);
    }
}
