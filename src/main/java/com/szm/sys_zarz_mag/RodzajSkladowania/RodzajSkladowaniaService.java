package com.szm.sys_zarz_mag.RodzajSkladowania;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RodzajSkladowaniaService {

    private RodzajSkladowaniaRepository rodzajSkladowaniaRepository;

    @Autowired
    public RodzajSkladowaniaService(RodzajSkladowaniaRepository rodzajSkladowaniaRepository) {
        this.rodzajSkladowaniaRepository = rodzajSkladowaniaRepository;
    }

    public void deleteRodzajSkladowaniaByNazwa(String nazwaRodzaju) {
        rodzajSkladowaniaRepository.deleteByRodzajSkladowania(nazwaRodzaju);
    }

    public RodzajSkladowania updateRodzajSkladowania(String nazwaRodzaju, RodzajSkladowania rodzajSkladowania) {

        RodzajSkladowania rodzajSkladowaniaDB = rodzajSkladowaniaRepository.findByRodzajSkladowania(nazwaRodzaju);

        if(rodzajSkladowania.getRodzajSkladowania() != null && !"".equalsIgnoreCase(rodzajSkladowania.getRodzajSkladowania())) {
            rodzajSkladowaniaDB.setRodzajSkladowania(rodzajSkladowania.getRodzajSkladowania());
        }

        return rodzajSkladowaniaRepository.save(rodzajSkladowaniaDB);
    }



    public RodzajSkladowania findRodzajSkladowaniaByNazwa(String nazwaRodzaju) {
        return rodzajSkladowaniaRepository.findByRodzajSkladowania(nazwaRodzaju);
    }

    public RodzajSkladowania findRodzajSkladowaniaById(long idRodzaju) {
        return rodzajSkladowaniaRepository.findByIdRodzajSkladowania(idRodzaju);
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

    public RodzajSkladowania saveRodzajSkladowania(RodzajSkladowania rodzajSkladowania) {
        return rodzajSkladowaniaRepository.save(rodzajSkladowania);
    }

    public List<RodzajSkladowania> findAllRodzajeSkladowania() {
        return rodzajSkladowaniaRepository.findAll();
    }
}
