package com.szm.sys_zarz_mag.IdDzialStan;
import com.szm.sys_zarz_mag.Dzial.Dzial;
import com.szm.sys_zarz_mag.Stanowisko.Stanowisko;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdDzialStanService {

    private final IdDzialStanRepository idDzialStanRepository;

    @Autowired
    public IdDzialStanService(IdDzialStanRepository idDzialStanRepository) {
        this.idDzialStanRepository = idDzialStanRepository;
    }

    public List<IdDzialStan> findAllDistinctIdDzialStan() {
        return idDzialStanRepository.findAllDistinctByIdDzialAndIdStanowisko();
    }

    public List<IdDzialStan> findDistinctIdStanowiskoByIdDzial(Long idDzial) {
        return idDzialStanRepository.findDistinctIdStanowiskoByIdDzial(idDzial);
    }

    public List<IdDzialStan> findDistinctIdDzialByIdStanowisko(Long idStanowisko) {
        return idDzialStanRepository.findDistinctIdDzialByIdStanowisko(idStanowisko);
    }

    public List<IdDzialStan> findIdDzialStanByStanowisko(Stanowisko stanowisko) {
        return idDzialStanRepository.findByStanowisko(stanowisko);
    }

    public List<IdDzialStan> findIdDzialStanByDzial(Dzial dzial) {
        return idDzialStanRepository.findByDzial(dzial);
    }

    public void deleteIdDzialStanByStanowisko(Stanowisko stanowisko) {
        idDzialStanRepository.deleteByStanowisko(stanowisko);
    }

    public void deleteIdDzialStanByDzial(Dzial dzial) {
        idDzialStanRepository.deleteByDzial(dzial);
    }

    public int countIdDzialStanByStanowisko(Long idStanowisko) {
        return idDzialStanRepository.countByStanowisko_IdStanowisko(idStanowisko);
    }

    public int countIdDzialStanByDzial(Long idDzial) {
        return idDzialStanRepository.countByDzial_IdDzial(idDzial);
    }
}
