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

    public List<Jednostka> findAllJednostki() {
        return jednostkaRepository.findAll();
    }

    //TODO: add CRUD methods
}
