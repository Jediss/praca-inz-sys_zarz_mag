package com.szm.sys_zarz_mag.Controller;

import com.szm.sys_zarz_mag.Service.Impl.MiejsceSkladowaniaServiceImpl;
import com.szm.sys_zarz_mag.Entity.MiejsceSkladowania;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/miejsceSkladowania")
public class MiejsceSkladowaniaController {

    private final MiejsceSkladowaniaServiceImpl miejsceSkladowaniaServiceImpl;

    @Autowired
    public MiejsceSkladowaniaController(MiejsceSkladowaniaServiceImpl miejsceSkladowaniaServiceImpl) {
        this.miejsceSkladowaniaServiceImpl = miejsceSkladowaniaServiceImpl;
    }


    @DeleteMapping("/deleteById/{id}")
    public void deleteMiejsceSkladowaniaById(@PathVariable("id") long id) {
        miejsceSkladowaniaServiceImpl.deleteMiejsceSkladowaniaById(id);
    }

    @PutMapping("/updateMiejsceSkladowania/{id}")
    public MiejsceSkladowania updateMiejsceSkladowania(@PathVariable("id") long id, @RequestBody MiejsceSkladowania miejsceSkladowania) {
        return miejsceSkladowaniaServiceImpl.updateMiejsceSkladowania(id, miejsceSkladowania);
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