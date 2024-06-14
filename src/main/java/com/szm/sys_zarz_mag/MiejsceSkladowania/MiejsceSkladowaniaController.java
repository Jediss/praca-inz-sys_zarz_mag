package com.szm.sys_zarz_mag.MiejsceSkladowania;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/miejsceSkladowania")
public class MiejsceSkladowaniaController {

    private final MiejsceSkladowaniaService miejsceSkladowaniaService;

    @Autowired
    public MiejsceSkladowaniaController(MiejsceSkladowaniaService miejsceSkladowaniaService) {
        this.miejsceSkladowaniaService = miejsceSkladowaniaService;
    }

    @GetMapping("/byHala/{isHala}")
    public List<MiejsceSkladowania> findMiejsceSkladowaniaByHala(@PathVariable("isHala") boolean isHala) {
        return miejsceSkladowaniaService.findMiejsceSkladowaniaByHala(isHala);
    }

    @GetMapping("/byPlac/{isPlac}")
    public List<MiejsceSkladowania> findMiejsceSkladowaniaByPlac(@PathVariable("isPlac") boolean isPlac) {
        return miejsceSkladowaniaService.findMiejsceSkladowaniaByPlac(isPlac);
    }

    @GetMapping("/byLevel/{level}")
    public List<MiejsceSkladowania> findMiejsceSkladowaniaByLevel(@PathVariable("level") int level) {
        return miejsceSkladowaniaService.findMiejsceSkladowaniaByLevel(level);
    }

    @GetMapping("/byCoordinates/{xCoordinate}/{yCoordinate}")
    public MiejsceSkladowania findMiejsceSkladowaniaByCoordinates(@PathVariable("xCoordinate") int xCoordinate, @PathVariable("yCoordinate") int yCoordinate) {
        return miejsceSkladowaniaService.findMiejsceSkladowaniaByCoordinates(xCoordinate, yCoordinate);
    }

    @GetMapping("/byCoordinatesAndLevel/{xCoordinate}/{yCoordinate}/{level}")
    public MiejsceSkladowania findMiejsceSkladowaniaByCoordinatesAndLevel(@PathVariable("xCoordinate") int xCoordinate, @PathVariable("yCoordinate") int yCoordinate, @PathVariable("level") int level) {
        return miejsceSkladowaniaService.findMiejsceSkladowaniaByCoordinatesAndLevel(xCoordinate, yCoordinate, level);
    }

    @DeleteMapping("/deleteByCoordinates/{xCoordinate}/{yCoordinate}")
    public void deleteMiejsceSkladowaniaByCoordinates(@PathVariable("xCoordinate") int xCoordinate, @PathVariable("yCoordinate") int yCoordinate) {
        miejsceSkladowaniaService.deleteMiejsceSkladowaniaByCoordinates(xCoordinate, yCoordinate);
    }

    @DeleteMapping("/deleteByCoordinatesAndLevel/{xCoordinate}/{yCoordinate}/{level}")
    public void deleteMiejsceSkladowaniaByCoordinatesAndLevel(@PathVariable("xCoordinate") int xCoordinate, @PathVariable("yCoordinate") int yCoordinate, @PathVariable("level") int level) {
        miejsceSkladowaniaService.deleteMiejsceSkladowaniaByCoordinatesAndLevel(xCoordinate, yCoordinate, level);
    }

    // Modification endpoints for MiejsceSkladowania coordinates and level
    @PutMapping("/modifyXCoordinate")
    public void modifyMiejsceSkladowaniaXCoordinate(@RequestParam int value, @RequestParam boolean isAdding, @RequestParam int newValue) {
        miejsceSkladowaniaService.modifyMiejsceSkladowaniaXCoordinate(value, isAdding, newValue);
    }

    @PutMapping("/modifyYCoordinate")
    public void modifyMiejsceSkladowaniaYCoordinate(@RequestParam int value, @RequestParam boolean isAdding, @RequestParam int newValue) {
        miejsceSkladowaniaService.modifyMiejsceSkladowaniaYCoordinate(value, isAdding, newValue);
    }

    @PutMapping("/modifyLevel")
    public void modifyMiejsceSkladowaniaLevel(@RequestParam int value, @RequestParam boolean isAdding, @RequestParam int newValue) {
        miejsceSkladowaniaService.modifyMiejsceSkladowaniaLevel(value, isAdding, newValue);
    }

    @PutMapping("/modifyHala")
    public void modifyMiejsceSkladowaniaHala(@RequestParam boolean newValue) {
        miejsceSkladowaniaService.modifyMiejsceSkladowaniaHala(newValue);
    }

    @PutMapping("/modifyPlac")
    public void modifyMiejsceSkladowaniaPlac(@RequestParam boolean newValue) {
        miejsceSkladowaniaService.modifyMiejsceSkladowaniaPlac(newValue);
    }
    /*
    //
    @DeleteMapping("/removeXCoordinate")
    public void removeValueFromXCoordinate() {
        miejsceSkladowaniaService.removeValueFromXCoordinate();
    }

    @DeleteMapping("/removeYCoordinate")
    public void removeValueFromYCoordinate() {
        miejsceSkladowaniaService.removeValueFromYCoordinate();
    }

    @DeleteMapping("/removeLevel")
    public void removeValueFromLevel() {
        miejsceSkladowaniaService.removeValueFromLevel();
    }

    @DeleteMapping("/removeHala")
    public void removeValueFromHala() {
        miejsceSkladowaniaService.removeValueFromHala();
    }

    @DeleteMapping("/removePlac")
    public void removeValueFromPlac() {
        miejsceSkladowaniaService.removeValueFromPlac();
    }*/
}