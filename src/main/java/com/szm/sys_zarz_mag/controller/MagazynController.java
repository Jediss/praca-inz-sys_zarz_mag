package com.szm.sys_zarz_mag.controller;

import com.szm.sys_zarz_mag.service.MagazynService;
import com.szm.sys_zarz_mag.model.Magazyn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/magazyn")
public class MagazynController {

    private final MagazynService magazynService;

    @Autowired
    public MagazynController(MagazynService magazynService) {
        this.magazynService = magazynService;
    }

    @GetMapping("/byNazwa/{nazwa}")
    public Magazyn findMagazynByNazwa(@PathVariable("nazwa") String nazwa) {
        return magazynService.findMagazynByNazwa(nazwa);
    }

    @GetMapping("/byAdresMiasto/{adresMiasto}")
    public List<Magazyn> findMagazynyByAdresMiasto(@PathVariable("adresMiasto") String adresMiasto) {
        return magazynService.findMagazynyByAdresMiasto(adresMiasto);
    }
    @GetMapping("/byAdresUlica/{adresUlica}")
    public List<Magazyn> findMagazynyByAdresUlica(@PathVariable("adresUlica") String adresUlica) {
        return magazynService.findMagazynyByAdresUlica(adresUlica);
    }

    @GetMapping("/byAdresMiastoIUlica/{adresMiasto}/{adresUlica}")
    public List<Magazyn> findMagazynyByAdresMiastoIUlica(@PathVariable("adresMiasto") String adresMiasto, @PathVariable("adresUlica") String adresUlica) {
        return magazynService.findMagazynyByAdresMiastoIUlica(adresMiasto, adresUlica);
    }

    @GetMapping("/byAdresKod/{kodPocztowy}")
    public List<Magazyn> findMagazynyByAdresKod(@PathVariable("kodPocztowy") String kodPocztowy) {
        return magazynService.findMagazynyByAdresKod(kodPocztowy);
    }

    @GetMapping("/byAdresMiastoOrdered/{adresMiasto}")
    public List<Magazyn> findMagazynyByAdresMiastoOrderedByNazwaAsc(@PathVariable("adresMiasto") String adresMiasto) {
        return magazynService.findMagazynyByAdresMiastoOrderedByNazwaAsc(adresMiasto);
    }

    @GetMapping("/countByNazwa/{nazwa}")
    public int countMagazynyByNazwa(@PathVariable("nazwa") String nazwa) {
        return magazynService.countMagazynyByNazwa(nazwa);
    }

    @DeleteMapping("/deleteByNazwa/{nazwa}")
    public void deleteMagazynByNazwa(@PathVariable("nazwa") String nazwa) {
        magazynService.deleteMagazynByNazwa(nazwa);
    }

    //@GetMapping("/customQuery/{miasto}/{ulica}")
    //public List<Magazyn> findMagazynyByMiastoIUlica(@PathVariable String miasto, @PathVariable String ulica) {
        //return MagazynService.findMagazynyByMiastoIUlica(miasto, ulica);
    //}
}