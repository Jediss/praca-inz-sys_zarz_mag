package com.szm.sys_zarz_mag.Stanowisko;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StanowiskoService {

    private final StanowiskoRepository stanowiskoRepository;

    @Autowired
    public StanowiskoService(StanowiskoRepository stanowiskoRepository) {
        this.stanowiskoRepository = stanowiskoRepository;
    }

    public Stanowisko findStanowiskoByNazwa(String nazwa) {
        return stanowiskoRepository.findByStanowisko(nazwa);
    }

    public Stanowisko findStanowiskoById(long id) {
        return stanowiskoRepository.findByIdStanowisko(id);
    }

    public void deleteStanowiskoByNazwa(String nazwa) {
        stanowiskoRepository.deleteByStanowisko(nazwa);
    }

    public List<Stanowisko> findStanowiskoByFragmentNazwy(String fragmentNazwy) {
        return stanowiskoRepository.findByStanowiskoContaining(fragmentNazwy);
    }

    public List<Stanowisko> findAllStanowiskaSortedAlphabetically() {
        return stanowiskoRepository.findByOrderByStanowiskoAsc();
    }

    public List<Stanowisko> findExistingStanowiska() {
        return stanowiskoRepository.findByStanowiskoIsNotNull();
    }

    public int countStanowiskoByNazwa(String nazwa) {
        return stanowiskoRepository.countByStanowisko(nazwa);
    }
}
