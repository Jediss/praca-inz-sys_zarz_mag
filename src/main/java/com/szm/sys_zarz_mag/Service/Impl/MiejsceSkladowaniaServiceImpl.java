package com.szm.sys_zarz_mag.Service.Impl;

import com.szm.sys_zarz_mag.Entity.MiejsceSkladowania;
import com.szm.sys_zarz_mag.Repository.MiejsceSkladowaniaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class MiejsceSkladowaniaServiceImpl {

    private MiejsceSkladowaniaRepository miejsceSkladowaniaRepository;

    @Autowired
    public MiejsceSkladowaniaServiceImpl(MiejsceSkladowaniaRepository miejsceSkladowaniaRepository) {
        this.miejsceSkladowaniaRepository = miejsceSkladowaniaRepository;
    }

    public void deleteMiejsceSkladowaniaById(long id) {
        miejsceSkladowaniaRepository.deleteById(id);
    }

    /*TODO: add updateOrInsert method, 5 attributes in table:
       architecture: stelaz_towar[ rzad_towar{ level_towar(levelIndex_towar) } ] + czy_wolne_towar boolean flag
       - Potrzebne sprawdzenie czy nie ma dwóch takich samych kombinacji
       archtektonicznych
       - Jeżeli wprowadzono daną kombinację architektoniczną to dezaktywuje
       się flaga czy_wolne_towar */


    public void updateOrInsertMiejsceSkladowania(MiejsceSkladowania miejsceSkladowania){

        MiejsceSkladowania existingPlace =
                miejsceSkladowaniaRepository.findById(miejsceSkladowania.getIdMiejsceSkladowania()).orElse(null);
    }

    public MiejsceSkladowania updateMiejsceSkladowania(long id, MiejsceSkladowania miejsceSkladowania) {

        MiejsceSkladowania miejsceSkladowaniaDB = miejsceSkladowaniaRepository.findById(id).get();

        if (Objects.nonNull(miejsceSkladowania.getRzadTowar()) && !"".equalsIgnoreCase(String.valueOf(miejsceSkladowania.getRzadTowar()))) {
            miejsceSkladowaniaDB.setRzadTowar(miejsceSkladowania.getRzadTowar());
        }

        if (Objects.nonNull(miejsceSkladowania.getStelazTowar()) && !"".equalsIgnoreCase(String.valueOf(miejsceSkladowania.getStelazTowar()))) {
            miejsceSkladowaniaDB.setStelazTowar(miejsceSkladowania.getStelazTowar());
        }

        if (Objects.nonNull(miejsceSkladowania.getLevelTowar()) && !"".equalsIgnoreCase(String.valueOf(miejsceSkladowania.getLevelTowar()))) {
            miejsceSkladowaniaDB.setLevelTowar(miejsceSkladowania.getLevelTowar());
        }

        if (Objects.nonNull(miejsceSkladowania.getLevelIndexTowar()) && !"".equalsIgnoreCase(String.valueOf(miejsceSkladowania.getLevelIndexTowar()))) {
            miejsceSkladowaniaDB.setLevelIndexTowar(miejsceSkladowania.getLevelIndexTowar());
        }

//        if (Objects.nonNull(miejsceSkladowania.isCzyWolneTowar())) {
//            miejsceSkladowaniaDB.setCzyWolneTowar(miejsceSkladowania
//            .isCzyWolneTowar());
//        }

        return miejsceSkladowaniaRepository.save(miejsceSkladowaniaDB);
    }

}

