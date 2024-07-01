package com.szm.sys_zarz_mag.Stanowisko;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StanowiskoService {

    private StanowiskoRepository stanowiskoRepository;

    @Autowired
    public StanowiskoService(StanowiskoRepository stanowiskoRepository) {
        this.stanowiskoRepository = stanowiskoRepository;
    }

    public Stanowisko saveStanowisko(Stanowisko stanowisko) {
        return stanowiskoRepository.save(stanowisko);
    }

    public void deleteStanowiskoByNazwa(String nazwa) {
        stanowiskoRepository.deleteByStanowisko(nazwa);
    }

    public Stanowisko updateStanowisko(String nazwa, Stanowisko stanowisko) {
        Stanowisko stanowiskoDB = stanowiskoRepository.findByStanowisko(nazwa);

        if(stanowisko.getStanowisko() != null && !"".equalsIgnoreCase(stanowisko.getStanowisko())) {
            stanowiskoDB.setStanowisko(stanowisko.getStanowisko());
        }

        return stanowiskoRepository.save(stanowiskoDB);
    }


    public Stanowisko findStanowiskoByNazwa(String nazwa) {
        return stanowiskoRepository.findByStanowisko(nazwa);
    }

    public Stanowisko findStanowiskoById(long id) {
        return stanowiskoRepository.findByIdStanowisko(id);
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
