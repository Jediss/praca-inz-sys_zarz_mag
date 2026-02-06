package com.szm.sys_zarz_mag.Controller;

import com.szm.sys_zarz_mag.Service.Impl.IdDzialStanServiceImpl;
import com.szm.sys_zarz_mag.Entity.Dzial;
import com.szm.sys_zarz_mag.Entity.IdDzialStan;
import com.szm.sys_zarz_mag.Entity.Stanowisko;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/idDzialStan")
public class IdDzialStanController {

    private final IdDzialStanServiceImpl idDzialStanServiceImpl;

    @Autowired
    public IdDzialStanController(IdDzialStanServiceImpl idDzialStanServiceImpl) {
        this.idDzialStanServiceImpl = idDzialStanServiceImpl;
    }

    @GetMapping("/byStanowisko")
    public List<IdDzialStan> findIdDzialStanByStanowisko(@RequestBody Stanowisko stanowisko) {
        return idDzialStanServiceImpl.findIdDzialStanByStanowisko(stanowisko);
    }

    @GetMapping("/byDzial")
    public List<IdDzialStan> findIdDzialStanByDzial(@RequestBody Dzial dzial) {
        return idDzialStanServiceImpl.findIdDzialStanByDzial(dzial);
    }


    @GetMapping("/countByStanowisko/{idStanowisko}")
    public int countIdDzialStanByStanowisko(@PathVariable("idStanowisko") Long idStanowisko) {
        return idDzialStanServiceImpl.countIdDzialStanByStanowisko(idStanowisko);
    }


    @GetMapping("/countByDzial/{idDzial}")
    public int countIdDzialStanByDzial(@PathVariable("idDzial") Long idDzial) {
        return idDzialStanServiceImpl.countIdDzialStanByDzial(idDzial);
    }
}
