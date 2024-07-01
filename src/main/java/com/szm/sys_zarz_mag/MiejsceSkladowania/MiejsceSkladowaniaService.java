package com.szm.sys_zarz_mag.MiejsceSkladowania;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Objects;

@Service
public class MiejsceSkladowaniaService {

    private MiejsceSkladowaniaRepository miejsceSkladowaniaRepository;

    @Autowired
    public MiejsceSkladowaniaService(MiejsceSkladowaniaRepository miejsceSkladowaniaRepository) {
        this.miejsceSkladowaniaRepository = miejsceSkladowaniaRepository;
    }

    public MiejsceSkladowania saveMiejsceSkladowania(MiejsceSkladowania miejsceSkladowania) {
        return miejsceSkladowaniaRepository.save(miejsceSkladowania);
    }

    public void deleteMiejsceSkladowaniaById(long id) {
        miejsceSkladowaniaRepository.deleteById(id);
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

        if (Objects.nonNull(miejsceSkladowania.isCzyWolneTowar())) {
            miejsceSkladowaniaDB.setCzyWolneTowar(miejsceSkladowania.isCzyWolneTowar());
        }

        return miejsceSkladowaniaRepository.save(miejsceSkladowaniaDB);
    }

    public MiejsceSkladowania findMiejsceSkladowaniaById(long id) {
        return miejsceSkladowaniaRepository.findById(id).get();
    }


//    @Transactional
//    public void deleteMiejsceSkladowaniaByCoordinatesAndLevelAndHala(int xCoordinate, int yCoordinate, int level) {
//        miejsceSkladowaniaRepository.deleteByXAndYAndLevelAndHala(xCoordinate, yCoordinate, level);
//    }

//    @Transactional
//    public void modifyMiejsceSkladowaniaXCoordinate(int value, boolean isAdding, int newValue) {
//        if (isAdding) {
//            miejsceSkladowaniaRepository.addValueToX(value);
//        } else if (newValue != 0) {
//            miejsceSkladowaniaRepository.updateValueOfX(newValue);
//        }
//        else {
//            removeValueFromXCoordinate();
//        }


    //Metody usuwania
//    private void removeValueFromXCoordinate() {
//        miejsceSkladowaniaRepository.removeValueFromX();
//    }

}

