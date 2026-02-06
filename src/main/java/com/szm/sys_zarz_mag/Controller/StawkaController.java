package com.szm.sys_zarz_mag.Controller;

import com.szm.sys_zarz_mag.Service.Impl.StawkaServiceImpl;
import com.szm.sys_zarz_mag.Entity.Stawka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stawka")
public class StawkaController {

    private final StawkaServiceImpl stawkaServiceImpl;

    @Autowired
    public StawkaController(StawkaServiceImpl stawkaServiceImpl) {
        this.stawkaServiceImpl = stawkaServiceImpl;
    }

    @GetMapping("/findByWartosc/{wartosc}")
    public Stawka findStawkaByWartosc(@PathVariable("wartosc") double wartosc) {
        return stawkaServiceImpl.findStawkaByWartosc(wartosc);
    }

    @GetMapping("/findById/{id}")
    public Stawka findStawkaById(@PathVariable("id") long id) {
        return stawkaServiceImpl.findStawkaById(id);
    }

    @DeleteMapping("/deleteByWartosc/{wartosc}")
    public void deleteStawkaByWartosc(@PathVariable("wartosc") double wartosc) {
        stawkaServiceImpl.deleteStawkaByWartosc(wartosc);
    }

    @GetMapping("/findByWartoscGreaterThan/{wartosc}")
    public List<Stawka> findStawkiByWartoscGreaterThan(@PathVariable("wartosc") double wartosc) {
        return stawkaServiceImpl.findStawkiByWartoscGreaterThan(wartosc);
    }

    @GetMapping("/findByWartoscLessThan/{wartosc}")
    public List<Stawka> findStawkiByWartoscLessThan(@PathVariable("wartosc") double wartosc) {
        return stawkaServiceImpl.findStawkiByWartoscLessThan(wartosc);
    }

    @GetMapping("/findByWartoscBetween/{wartosc1}/{wartosc2}")
    public List<Stawka> findStawkiByWartoscBetween(@PathVariable("wartosc1") double wartosc1, @PathVariable("wartosc2") double wartosc2) {
        return stawkaServiceImpl.findStawkiByWartoscBetween(wartosc1, wartosc2);
    }

    @GetMapping("/findExisting")
    public List<Stawka> findExistingStawki() {
        return stawkaServiceImpl.findExistingStawki();
    }

    @GetMapping("/countByWartosc/{wartosc}")
    public int countStawkiByWartosc(@PathVariable("wartosc") double wartosc) {
        return stawkaServiceImpl.countStawkiByWartosc(wartosc);
    }
}