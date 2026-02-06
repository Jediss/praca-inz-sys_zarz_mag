package com.szm.sys_zarz_mag.Controller;

import com.szm.sys_zarz_mag.Service.Impl.MagazynServiceImpl;
import com.szm.sys_zarz_mag.Entity.Magazyn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/magazyn")
public class MagazynController {

    private final MagazynServiceImpl magazynServiceImpl;

    @Autowired
    public MagazynController(MagazynServiceImpl magazynServiceImpl) {
        this.magazynServiceImpl = magazynServiceImpl;
    }

    @GetMapping("/byNazwa/{nazwa}")
    public Magazyn findMagazynByNazwa(@PathVariable("nazwa") String nazwa) {
        return magazynServiceImpl.findMagazynByNazwa(nazwa);
    }

    @GetMapping("/byAdresMiasto/{adresMiasto}")
    public List<Magazyn> findMagazynyByAdresMiasto(@PathVariable("adresMiasto") String adresMiasto) {
        return magazynServiceImpl.findMagazynyByAdresMiasto(adresMiasto);
    }
    @GetMapping("/byAdresUlica/{adresUlica}")
    public List<Magazyn> findMagazynyByAdresUlica(@PathVariable("adresUlica") String adresUlica) {
        return magazynServiceImpl.findMagazynyByAdresUlica(adresUlica);
    }

    @GetMapping("/byAdresMiastoIUlica/{adresMiasto}/{adresUlica}")
    public List<Magazyn> findMagazynyByAdresMiastoIUlica(@PathVariable("adresMiasto") String adresMiasto, @PathVariable("adresUlica") String adresUlica) {
        return magazynServiceImpl.findMagazynyByAdresMiastoIUlica(adresMiasto, adresUlica);
    }

    @GetMapping("/byAdresKod/{kodPocztowy}")
    public List<Magazyn> findMagazynyByAdresKod(@PathVariable("kodPocztowy") String kodPocztowy) {
        return magazynServiceImpl.findMagazynyByAdresKod(kodPocztowy);
    }

    @GetMapping("/byAdresMiastoOrdered/{adresMiasto}")
    public List<Magazyn> findMagazynyByAdresMiastoOrderedByNazwaAsc(@PathVariable("adresMiasto") String adresMiasto) {
        return magazynServiceImpl.findMagazynyByAdresMiastoOrderedByNazwaAsc(adresMiasto);
    }

    @GetMapping("/countByNazwa/{nazwa}")
    public int countMagazynyByNazwa(@PathVariable("nazwa") String nazwa) {
        return magazynServiceImpl.countMagazynyByNazwa(nazwa);
    }

    @DeleteMapping("/deleteByNazwa/{nazwa}")
    public void deleteMagazynByNazwa(@PathVariable("nazwa") String nazwa) {
        magazynServiceImpl.deleteMagazynByNazwa(nazwa);
    }

    //@GetMapping("/customQuery/{miasto}/{ulica}")
    //public List<Magazyn> findMagazynyByMiastoIUlica(@PathVariable String miasto, @PathVariable String ulica) {
        //return MagazynService.findMagazynyByMiastoIUlica(miasto, ulica);
    //}
}