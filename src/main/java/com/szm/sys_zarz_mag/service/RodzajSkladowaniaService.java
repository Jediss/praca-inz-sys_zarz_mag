package com.szm.sys_zarz_mag.service;

import com.szm.sys_zarz_mag.model.RodzajSkladowania;
import com.szm.sys_zarz_mag.repository.RodzajSkladowaniaRepository;
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

    public RodzajSkladowania saveRodzajSkladowania(RodzajSkladowania rodzajSkladowania) {
        return rodzajSkladowaniaRepository.save(rodzajSkladowania);
    }

    public List<RodzajSkladowania> findAllRodzajeSkladowania() {
        return rodzajSkladowaniaRepository.findAll();
    }

    //TODO: add CRUD methods
}
