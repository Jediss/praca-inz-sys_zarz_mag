package com.szm.sys_zarz_mag.Service.Impl;

import com.szm.sys_zarz_mag.Repository.TowarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TowarServiceImpl {

    private TowarRepository towarRepository;

    @Autowired
    public TowarServiceImpl(TowarRepository towarRepository) {
        this.towarRepository = towarRepository;
    }

    //TODO: Implement new CRUD

}
