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

    // Find Dzial by id and nazwa
    @GetMapping("/byIdAndNazwa/{id}/{nazwa}")
    public Dzial findDzialByIdAndNazwa(@PathVariable long id, @PathVariable String nazwa) {
        return dzialService.findDzialByIdAndNazwa(id, nazwa);
    }

    // Delete Dzial by nazwa
    @DeleteMapping("/deleteByNazwa/{nazwa}")
    public void deleteDzialByNazwa(@PathVariable String nazwa) {
        dzialService.deleteDzialByNazwa(nazwa);
    }

    // Find Dzial by partial nazwa
    @GetMapping("/byPartialNazwa/{partialNazwa}")
    public List<Dzial> findDzialByPartialNazwa(@PathVariable String partialNazwa) {
        return dzialService.findDzialByPartialNazwa(partialNazwa);
    }

    // Find Dzial by nazwa sorted
    @GetMapping("/byNazwaSorted/{nazwa}")
    public List<Dzial> findDzialByNazwaSorted(@PathVariable String nazwa) {
        return dzialService.findDzialByNazwaSorted(nazwa);
    }

    // Find Dzial not null
    @GetMapping("/allNotNull")
    public List<Dzial> findDzialNotNull() {
        return dzialService.findDzialNotNull();
    }

    // Count Dzial by nazwa
    @GetMapping("/countByNazwa/{nazwa}")
    public int countDzialByNazwa(@PathVariable String nazwa) {
        return dzialService.countDzialByNazwa(nazwa);
    }
}
