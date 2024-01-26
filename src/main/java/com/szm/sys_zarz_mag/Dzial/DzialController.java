package com.szm.sys_zarz_mag.Dzial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dzial")
public class DzialController {

    private final DzialService dzialService;

    @Autowired
    public DzialController(DzialService dzialService) {
        this.dzialService = dzialService;
    }

    @GetMapping("/byNazwa/{nazwa}")
    public Dzial findDzialByNazwa(@PathVariable String nazwa) {
        return dzialService.findDzialByNazwa(nazwa);
    }

    @GetMapping("/byId/{id}")
    public Dzial findDzialById(@PathVariable long id) {
        return dzialService.findDzialById(id);
    }


    @GetMapping("/byIdAndNazwa/{id}/{nazwa}")
    public Dzial findDzialByIdAndNazwa(@PathVariable long id, @PathVariable String nazwa) {
        return dzialService.findDzialByIdAndNazwa(id, nazwa);
    }


    @DeleteMapping("/deleteByNazwa/{nazwa}")
    public void deleteDzialByNazwa(@PathVariable String nazwa) {
        dzialService.deleteDzialByNazwa(nazwa);
    }


    @GetMapping("/byPartialNazwa/{partialNazwa}")
    public List<Dzial> findDzialByPartialNazwa(@PathVariable String partialNazwa) {
        return dzialService.findDzialByPartialNazwa(partialNazwa);
    }


    @GetMapping("/byNazwaSorted/{nazwa}")
    public List<Dzial> findDzialByNazwaSorted(@PathVariable String nazwa) {
        return dzialService.findDzialByNazwaSorted(nazwa);
    }


    @GetMapping("/allNotNull")
    public List<Dzial> findDzialNotNull() {
        return dzialService.findDzialNotNull();
    }


    @GetMapping("/countByNazwa/{nazwa}")
    public int countDzialByNazwa(@PathVariable String nazwa) {
        return dzialService.countDzialByNazwa(nazwa);
    }
}
