package com.szm.sys_zarz_mag.service;

import com.szm.sys_zarz_mag.model.Dzial;
import com.szm.sys_zarz_mag.repository.DzialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DzialService {

    private DzialRepository dzialRepository;

    @Autowired
    public DzialService(DzialRepository dzialRepository) {
        this.dzialRepository = dzialRepository;
    }

    public Dzial saveDzial(Dzial dzial) {
        return dzialRepository.save(dzial);
    }

    public Dzial findDzialByNazwa(String nazwa) {
        return dzialRepository.findByDzial(nazwa);
    }


    public Dzial findDzialById(long id) {
        return dzialRepository.findByIdDzial(id);
    }

    public void deleteDzialByNazwa(String dzial) {
        dzialRepository.deleteByDzial(dzial);
    }


    public Dzial updateDzial(String nazwa, Dzial dzial) {
        Dzial dzialDB = dzialRepository.findByDzial(nazwa);

        if(Objects.nonNull(dzial.getDzial()) && !"".equalsIgnoreCase(dzial.getDzial())) {
            dzialDB.setDzial(dzial.getDzial());
        }

        return dzialRepository.save(dzialDB);
    }

    public List<Dzial> findDzialByPartialNazwa(String partialNazwa) {
        return dzialRepository.findByDzialContaining(partialNazwa);
    }

    public Dzial findDzialByIdAndNazwa(long id, String nazwa) {
        return dzialRepository.findByIdDzialAndDzial(id, nazwa);
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
