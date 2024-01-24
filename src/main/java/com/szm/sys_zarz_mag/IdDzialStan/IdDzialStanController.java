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

    // Delete IdDzialStan by Stanowisko
    @DeleteMapping("/deleteByStanowisko")
    public void deleteIdDzialStanByStanowisko(@RequestBody Stanowisko stanowisko) {
        idDzialStanService.deleteIdDzialStanByStanowisko(stanowisko);
    }

    // Delete IdDzialStan by Dzial
    @DeleteMapping("/deleteByDzial")
    public void deleteIdDzialStanByDzial(@RequestBody Dzial dzial) {
        idDzialStanService.deleteIdDzialStanByDzial(dzial);
    }

    // Count IdDzialStan by Stanowisko
    @GetMapping("/countByStanowisko/{idStanowisko}")
    public int countIdDzialStanByStanowisko(@PathVariable Long idStanowisko) {
        return idDzialStanService.countIdDzialStanByStanowisko(idStanowisko);
    }

    // Count IdDzialStan by Dzial
    @GetMapping("/countByDzial/{idDzial}")
    public int countIdDzialStanByDzial(@PathVariable Long idDzial) {
        return idDzialStanService.countIdDzialStanByDzial(idDzial);
    }
}
