package com.szm.sys_zarz_mag.controller;

import com.szm.sys_zarz_mag.service.PracownikService;
import com.szm.sys_zarz_mag.model.IdDzialStan;
import com.szm.sys_zarz_mag.model.Magazyn;
import com.szm.sys_zarz_mag.model.Stawka;
import com.szm.sys_zarz_mag.model.Pracownik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/pracownik")
public class PracownikController {

    private final PracownikService pracownikService;

    @Autowired
    public PracownikController(PracownikService pracownikService) {
        this.pracownikService = pracownikService;
    }

    @GetMapping("/byNazwisko/{nazwisko}")
    public Pracownik findPracownikByNazwisko(@PathVariable("nazwisko") String nazwisko) {
        return pracownikService.findPracownikByNazwisko(nazwisko);
    }

    @GetMapping("/byId/{id}")
    public Pracownik findPracownikById(@PathVariable("id") long id) {
        return pracownikService.findPracownikById(id);
    }

    @PutMapping("/updatePracownik/{email}")
    public Pracownik updatePracownik(@PathVariable("username") String username, @RequestBody Pracownik pracownik) {
        return pracownikService.updatePracownik(username, pracownik);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deletePracownikById(@PathVariable("id") long id) {
        pracownikService.deletePracownikById(id);
    }

    @GetMapping("/byImie/{imie}")
    public List<Pracownik> findPracownicyByImie(@PathVariable("imie") String imie) {
        return pracownikService.findPracownicyByImie(imie);
    }

    @GetMapping("/byDataZatrud/{dataZatrud}")
    public List<Pracownik> findPracownicyByDataZatrud(@PathVariable("dataZatrud") LocalDate dataZatrud) {
        return pracownikService.findPracownicyByDataZatrud(dataZatrud);
    }

    @GetMapping("/byTelefon/{telefon}")
    public List<Pracownik> findPracownicyByTelefon(@PathVariable("telefon") String telefon) {
        return pracownikService.findPracownicyByTelefon(telefon);
    }
    @GetMapping("/byMagazyn")
    public List<Pracownik> findPracownicyByMagazyn(@RequestBody Magazyn magazyn) {
        return pracownikService.findPracownicyByMagazyn(magazyn);
    }

    @GetMapping("/byDzialStan/{idDzialStan}")
    public List<Pracownik> findPracownicyByDzialStan(@PathVariable("idDzialStan") Long idDzialStan) {
        return pracownikService.findPracownicyByDzialStan(new IdDzialStan(idDzialStan));
    }

    @GetMapping("/byStawka")
    public List<Pracownik> findPracownicyByStawka(@RequestBody Stawka stawka) {
        return pracownikService.findPracownicyByStawka(stawka);
    }

    @GetMapping("/byImieAndNazwiskoOrdered/{imie}/{nazwisko}")
    public List<Pracownik> findPracownicyByImieAndNazwiskoOrderedByNazwiskoAsc(@PathVariable("imie") String imie, @PathVariable("nazwisko") String nazwisko) {
        return pracownikService.findPracownicyByImieAndNazwiskoOrderedByNazwiskoAsc(imie, nazwisko);
    }

    @GetMapping("/countByImie/{imie}")
    public int countPracownicyByImie(@PathVariable("imie") String imie) {
        return pracownikService.countPracownicyByImie(imie);
    }
}