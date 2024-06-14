package com.szm.sys_zarz_mag.Stawka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stawka")
public class StawkaController {

    private final StawkaService stawkaService;

    @Autowired
    public StawkaController(StawkaService stawkaService) {
        this.stawkaService = stawkaService;
    }

    @GetMapping("/findByWartosc/{wartosc}")
    public Stawka findStawkaByWartosc(@PathVariable("wartosc") double wartosc) {
        return stawkaService.findStawkaByWartosc(wartosc);
    }

    @GetMapping("/findById/{id}")
    public Stawka findStawkaById(@PathVariable("id") long id) {
        return stawkaService.findStawkaById(id);
    }

    @DeleteMapping("/deleteByWartosc/{wartosc}")
    public void deleteStawkaByWartosc(@PathVariable("wartosc") double wartosc) {
        stawkaService.deleteStawkaByWartosc(wartosc);
    }

    @GetMapping("/findByWartoscGreaterThan/{wartosc}")
    public List<Stawka> findStawkiByWartoscGreaterThan(@PathVariable("wartosc") double wartosc) {
        return stawkaService.findStawkiByWartoscGreaterThan(wartosc);
    }

    @GetMapping("/findByWartoscLessThan/{wartosc}")
    public List<Stawka> findStawkiByWartoscLessThan(@PathVariable("wartosc") double wartosc) {
        return stawkaService.findStawkiByWartoscLessThan(wartosc);
    }

    @GetMapping("/findByWartoscBetween/{wartosc1}/{wartosc2}")
    public List<Stawka> findStawkiByWartoscBetween(@PathVariable("wartosc1") double wartosc1, @PathVariable("wartosc2") double wartosc2) {
        return stawkaService.findStawkiByWartoscBetween(wartosc1, wartosc2);
    }

    @GetMapping("/findExisting")
    public List<Stawka> findExistingStawki() {
        return stawkaService.findExistingStawki();
    }

    @GetMapping("/countByWartosc/{wartosc}")
    public int countStawkiByWartosc(@PathVariable("wartosc") double wartosc) {
        return stawkaService.countStawkiByWartosc(wartosc);
    }
}