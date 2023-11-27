package com.szm.sys_zarz_mag.MiejsceSkladowania;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MiejsceSkladowaniaService {

    private MiejsceSkladowaniaRepository miejsceSkladowaniaRepository;

    @Autowired
    public MiejsceSkladowaniaService(MiejsceSkladowaniaRepository miejsceSkladowaniaRepository) {
        this.miejsceSkladowaniaRepository = miejsceSkladowaniaRepository;
    }
    public List<MiejsceSkladowania> findMiejsceSkladowaniaByHala(boolean isHala) {
        return miejsceSkladowaniaRepository.findByHala(isHala);
    }

    public List<MiejsceSkladowania> findMiejsceSkladowaniaByPlac(boolean isPlac) {
        return miejsceSkladowaniaRepository.findByPlac(isPlac);
    }

    public List<MiejsceSkladowania> findMiejsceSkladowaniaByLevel(int level) {
        return miejsceSkladowaniaRepository.findByLevel(level);
    }

    public MiejsceSkladowania findMiejsceSkladowaniaByCoordinates(int xCoordinate, int yCoordinate) {
        return miejsceSkladowaniaRepository.findByXAndY(xCoordinate, yCoordinate);
    }

    public MiejsceSkladowania findMiejsceSkladowaniaByCoordinatesAndLevel(int xCoordinate, int yCoordinate, int level) {
        return miejsceSkladowaniaRepository.findByXAndYAndLevel(xCoordinate, yCoordinate, level);
    }

    @Transactional
    public void deleteMiejsceSkladowaniaByCoordinates(int xCoordinate, int yCoordinate) {
        miejsceSkladowaniaRepository.deleteByXAndY(xCoordinate, yCoordinate);
    }

    @Transactional
    public void deleteMiejsceSkladowaniaByCoordinatesAndLevel(int xCoordinate, int yCoordinate, int level) {
        miejsceSkladowaniaRepository.deleteByXAndYAndLevel(xCoordinate, yCoordinate, level);
    }

    @Transactional
    public void deleteMiejsceSkladowaniaByCoordinatesAndLevelAndPlac(int xCoordinate, int yCoordinate, int level) {
        miejsceSkladowaniaRepository.deleteByXAndYAndLevelAndPlac(xCoordinate, yCoordinate, level);
    }

    @Transactional
    public void deleteMiejsceSkladowaniaByCoordinatesAndLevelAndHala(int xCoordinate, int yCoordinate, int level) {
        miejsceSkladowaniaRepository.deleteByXAndYAndLevelAndHala(xCoordinate, yCoordinate, level);
    }

    @Transactional
    public void modifyMiejsceSkladowaniaXCoordinate(int value, boolean isAdding, int newValue) {
        if (isAdding) {
            miejsceSkladowaniaRepository.addValueToX(value);
        } else if (newValue != 0) {
            miejsceSkladowaniaRepository.updateValueOfX(newValue);
        }
//        else {
//            removeValueFromXCoordinate();
//        }
    }

    @Transactional
    public void modifyMiejsceSkladowaniaYCoordinate(int value, boolean isAdding, int newValue) {
        if (isAdding) {
            miejsceSkladowaniaRepository.addValueToY(value);
        } else if (newValue != 0) {
            miejsceSkladowaniaRepository.updateValueOfY(newValue);
        }
//        else {
//            removeValueFromYCoordinate();
//        }
    }

    @Transactional
    public void modifyMiejsceSkladowaniaLevel(int value, boolean isAdding, int newValue) {
        if (isAdding) {
            miejsceSkladowaniaRepository.addValueToLevel(value);
        } else if (newValue != 0) {
            miejsceSkladowaniaRepository.updateValueOfLevel(newValue);
        }
//        else {
//            removeValueFromLevel();
//        }
    }

    @Transactional
    public void modifyMiejsceSkladowaniaHala(boolean newValue) {
        if (newValue) {
            miejsceSkladowaniaRepository.addValueToHala();
        }
//        else {
//            removeValueFromHala();
//        }
    }

    @Transactional
    public void modifyMiejsceSkladowaniaPlac(boolean newValue) {
        if (newValue) {
            miejsceSkladowaniaRepository.addValueToPlac();
        }
//        else {
//            removeValueFromPlac();
//        }
    }

    //Metody usuwania

    private void removeValueFromXCoordinate() {
        miejsceSkladowaniaRepository.removeValueFromX();
    }

    private void removeValueFromYCoordinate() {
        miejsceSkladowaniaRepository.removeValueFromY();
    }

    private void removeValueFromLevel() {
        miejsceSkladowaniaRepository.removeValueFromLevel();
    }

    private void removeValueFromHala() {
        miejsceSkladowaniaRepository.removeValueFromHala();
    }

    private void removeValueFromPlac() {
        miejsceSkladowaniaRepository.removeValueFromPlac();
    }
}

