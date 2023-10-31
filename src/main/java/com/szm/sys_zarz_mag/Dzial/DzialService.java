package com.szm.sys_zarz_mag.Dzial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DzialService {

    private final DzialRepository dzialRepository;

    @Autowired
    public DzialService(DzialRepository dzialRepository) {
        this.dzialRepository = dzialRepository;
    }

    public Dzial findDzialByNazwa(String nazwa) {
        return dzialRepository.findByDzial(nazwa);
    }

    public Dzial findDzialById(long id) {
        return dzialRepository.findByIdDzial(id);
    }

    public Dzial findDzialByIdAndNazwa(long id, String nazwa) {
        return dzialRepository.findByIdDzialAndDzial(id, nazwa);
    }

    public void deleteDzialByNazwa(String nazwa) {
        dzialRepository.deleteByDzial(nazwa);
    }

    public List<Dzial> findDzialByPartialNazwa(String partialNazwa) {
        return dzialRepository.findByDzialContaining(partialNazwa);
    }

    public List<Dzial> findDzialByNazwaSorted(String nazwa) {
        return dzialRepository.findByDzialOrderByDzialAsc(nazwa);
    }

    public List<Dzial> findDzialNotNull() {
        return dzialRepository.findByDzialIsNotNull();
    }

    public int countDzialByNazwa(String nazwa) {
        return dzialRepository.countByDzial(nazwa);
    }
}
