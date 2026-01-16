package com.szm.sys_zarz_mag.service;
import com.szm.sys_zarz_mag.model.Dzial;
import com.szm.sys_zarz_mag.model.IdDzialStan;
import com.szm.sys_zarz_mag.model.Stanowisko;
import com.szm.sys_zarz_mag.repository.IdDzialStanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdDzialStanService {

    private IdDzialStanRepository idDzialStanRepository;

    @Autowired
    public IdDzialStanService(IdDzialStanRepository idDzialStanRepository) {
        this.idDzialStanRepository = idDzialStanRepository;
    }


    //----------------------------------------------------------------
    /*public List<IdDzialStan> findAllDistinctIdDzialStan() {
        return idDzialStanRepository.findAllDistinctByIdDzialAndIdStanowisko();
    }

    public List<IdDzialStan> findDistinctIdStanowiskoByIdDzial(Long idDzial) {
        return idDzialStanRepository.findDistinctIdStanowiskoByIdDzial(idDzial);
    }

    public List<IdDzialStan> findDistinctIdDzialByIdStanowisko(Long idStanowisko) {
        return idDzialStanRepository.findDistinctIdDzialByIdStanowisko(idStanowisko);
    }*/
    //-----------------------------------------------------------------


    public List<IdDzialStan> findIdDzialStanByStanowisko(Stanowisko stanowisko) {
        return idDzialStanRepository.findByStanowisko(stanowisko);
    }

    public List<IdDzialStan> findIdDzialStanByDzial(Dzial dzial) {
        return idDzialStanRepository.findByDzial(dzial);
    }


    public int countIdDzialStanByStanowisko(Long idStanowisko) {
        return idDzialStanRepository.countByStanowisko_IdStanowisko(idStanowisko);
    }

    public int countIdDzialStanByDzial(Long idDzial) {
        return idDzialStanRepository.countByDzial_IdDzial(idDzial);
    }
}
