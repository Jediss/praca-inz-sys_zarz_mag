package com.szm.sys_zarz_mag.controller;

import com.szm.sys_zarz_mag.service.MiejsceSkladowaniaService;
import com.szm.sys_zarz_mag.model.MiejsceSkladowania;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/miejsceSkladowania")
public class MiejsceSkladowaniaController {

    private final MiejsceSkladowaniaService miejsceSkladowaniaService;

    @Autowired
    public MiejsceSkladowaniaController(MiejsceSkladowaniaService miejsceSkladowaniaService) {
        this.miejsceSkladowaniaService = miejsceSkladowaniaService;
    }

    @PostMapping("/saveMiejsceSkladowania")
    public MiejsceSkladowania saveMiejsceSkladowania(@RequestBody MiejsceSkladowania miejsceSkladowania) {
        return miejsceSkladowaniaService.saveMiejsceSkladowania(miejsceSkladowania);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteMiejsceSkladowaniaById(@PathVariable("id") long id) {
        miejsceSkladowaniaService.deleteMiejsceSkladowaniaById(id);
    }

    @PutMapping("/updateMiejsceSkladowania/{id}")
    public MiejsceSkladowania updateMiejsceSkladowania(@PathVariable("id") long id, @RequestBody MiejsceSkladowania miejsceSkladowania) {
        return miejsceSkladowaniaService.updateMiejsceSkladowania(id, miejsceSkladowania);
    }

    @GetMapping("/findById/{id}")
    public MiejsceSkladowania findMiejsceSkladowaniaById(@PathVariable("id") long id) {
        return miejsceSkladowaniaService.findMiejsceSkladowaniaById(id);
    }

//    @GetMapping("/byHala/{isHala}")
//    public List<MiejsceSkladowania> findMiejsceSkladowaniaByHala(@PathVariable("isHala") boolean isHala) {
//        return miejsceSkladowaniaService.findMiejsceSkladowaniaByHala(isHala);
//    }



//    @GetMapping("/byCoordinatesAndLevel/{xCoordinate}/{yCoordinate}/{level}")
//    public MiejsceSkladowania findMiejsceSkladowaniaByCoordinatesAndLevel(@PathVariable("xCoordinate") int xCoordinate, @PathVariable("yCoordinate") int yCoordinate, @PathVariable("level") int level) {
//        return miejsceSkladowaniaService.findMiejsceSkladowaniaByCoordinatesAndLevel(xCoordinate, yCoordinate, level);
//    }



//    @PutMapping("/modifyLevel")
//    public void modifyMiejsceSkladowaniaLevel(@RequestParam int value, @RequestParam boolean isAdding, @RequestParam int newValue) {
//        miejsceSkladowaniaService.modifyMiejsceSkladowaniaLevel(value, isAdding, newValue);
//    }


//    /*
//    //
//    @DeleteMapping("/removeXCoordinate")
//    public void removeValueFromXCoordinate() {
//        miejsceSkladowaniaService.removeValueFromXCoordinate();

}