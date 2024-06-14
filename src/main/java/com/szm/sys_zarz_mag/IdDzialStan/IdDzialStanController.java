package com.szm.sys_zarz_mag.IdDzialStan;

import com.szm.sys_zarz_mag.Dzial.Dzial;
import com.szm.sys_zarz_mag.Stanowisko.Stanowisko;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/idDzialStan")
public class IdDzialStanController {

    private final IdDzialStanService idDzialStanService;

    @Autowired
    public IdDzialStanController(IdDzialStanService idDzialStanService) {
        this.idDzialStanService = idDzialStanService;
    }

    @GetMapping("/byStanowisko")
    public List<IdDzialStan> findIdDzialStanByStanowisko(@RequestBody Stanowisko stanowisko) {
        return idDzialStanService.findIdDzialStanByStanowisko(stanowisko);
    }

    @GetMapping("/byDzial")
    public List<IdDzialStan> findIdDzialStanByDzial(@RequestBody Dzial dzial) {
        return idDzialStanService.findIdDzialStanByDzial(dzial);
    }


    @DeleteMapping("/deleteByStanowisko")
    public void deleteIdDzialStanByStanowisko(@RequestBody Stanowisko stanowisko) {
        idDzialStanService.deleteIdDzialStanByStanowisko(stanowisko);
    }


    @DeleteMapping("/deleteByDzial")
    public void deleteIdDzialStanByDzial(@RequestBody Dzial dzial) {
        idDzialStanService.deleteIdDzialStanByDzial(dzial);
    }


    @GetMapping("/countByStanowisko/{idStanowisko}")
    public int countIdDzialStanByStanowisko(@PathVariable("idStanowisko") Long idStanowisko) {
        return idDzialStanService.countIdDzialStanByStanowisko(idStanowisko);
    }


    @GetMapping("/countByDzial/{idDzial}")
    public int countIdDzialStanByDzial(@PathVariable("idDzial") Long idDzial) {
        return idDzialStanService.countIdDzialStanByDzial(idDzial);
    }
}
