package com.szm.sys_zarz_mag.controller;

import com.szm.sys_zarz_mag.service.IdDzialStanService;
import com.szm.sys_zarz_mag.model.Dzial;
import com.szm.sys_zarz_mag.model.IdDzialStan;
import com.szm.sys_zarz_mag.model.Stanowisko;
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


    @GetMapping("/countByStanowisko/{idStanowisko}")
    public int countIdDzialStanByStanowisko(@PathVariable("idStanowisko") Long idStanowisko) {
        return idDzialStanService.countIdDzialStanByStanowisko(idStanowisko);
    }


    @GetMapping("/countByDzial/{idDzial}")
    public int countIdDzialStanByDzial(@PathVariable("idDzial") Long idDzial) {
        return idDzialStanService.countIdDzialStanByDzial(idDzial);
    }
}
