package com.szm.sys_zarz_mag.Service.Impl;

import com.szm.sys_zarz_mag.Entity.RodzajSkladowania;
import com.szm.sys_zarz_mag.Repository.RodzajSkladowaniaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RodzajSkladowaniaServiceImpl {

    private RodzajSkladowaniaRepository rodzajSkladowaniaRepository;

    @Autowired
    public RodzajSkladowaniaServiceImpl(RodzajSkladowaniaRepository rodzajSkladowaniaRepository) {
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
