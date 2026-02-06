package com.szm.sys_zarz_mag.Service.Impl;

import com.szm.sys_zarz_mag.Entity.Jednostka;
import com.szm.sys_zarz_mag.Repository.JednostkaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JednostkaServiceImpl {

    private JednostkaRepository jednostkaRepository;

    @Autowired
    public JednostkaServiceImpl(JednostkaRepository jednostkaRepository) {
        this.jednostkaRepository = jednostkaRepository;
    }

    public List<Jednostka> findAllJednostki() {
        return jednostkaRepository.findAll();
    }

    //TODO: add CRUD methods
}
