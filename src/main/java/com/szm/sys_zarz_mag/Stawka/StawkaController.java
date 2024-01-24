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
    public Stawka findStawkaByWartosc(@PathVariable double wartosc) {
        return stawkaService.findStawkaByWartosc(wartosc);
    }

    @GetMapping("/findById/{id}")
    public Stawka findStawkaById(@PathVariable long id) {
        return stawkaService.findStawkaById(id);
    }

    @DeleteMapping("/deleteByWartosc/{wartosc}")
    public void deleteStawkaByWartosc(@PathVariable double wartosc) {
        stawkaService.deleteStawkaByWartosc(wartosc);
    }

    @GetMapping("/findByWartoscGreaterThan/{wartosc}")
    public List<Stawka> findStawkiByWartoscGreaterThan(@PathVariable double wartosc) {
        return stawkaService.findStawkiByWartoscGreaterThan(wartosc);
    }

    @GetMapping("/findByWartoscLessThan/{wartosc}")
    public List<Stawka> findStawkiByWartoscLessThan(@PathVariable double wartosc) {
        return stawkaService.findStawkiByWartoscLessThan(wartosc);
    }

    @GetMapping("/findByWartoscBetween/{wartosc1}/{wartosc2}")
    public List<Stawka> findStawkiByWartoscBetween(@PathVariable double wartosc1, @PathVariable double wartosc2) {
        return stawkaService.findStawkiByWartoscBetween(wartosc1, wartosc2);
    }

    @GetMapping("/findExisting")
    public List<Stawka> findExistingStawki() {
        return stawkaService.findExistingStawki();
    }

    @GetMapping("/countByWartosc/{wartosc}")
    public int countStawkiByWartosc(@PathVariable double wartosc) {
        return stawkaService.countStawkiByWartosc(wartosc);
    }
}