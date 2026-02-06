package com.szm.sys_zarz_mag.Controller;

import com.szm.sys_zarz_mag.Service.Impl.PracownikServiceImpl;
import com.szm.sys_zarz_mag.Entity.IdDzialStan;
import com.szm.sys_zarz_mag.Entity.Magazyn;
import com.szm.sys_zarz_mag.Entity.Stawka;
import com.szm.sys_zarz_mag.Entity.Pracownik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/pracownik")
public class PracownikController {

    private final PracownikServiceImpl pracownikServiceImpl;

    @Autowired
    public PracownikController(PracownikServiceImpl pracownikServiceImpl) {
        this.pracownikServiceImpl = pracownikServiceImpl;
    }

    @GetMapping("/byNazwisko/{nazwisko}")
    public Pracownik findPracownikByNazwisko(@PathVariable("nazwisko") String nazwisko) {
        return pracownikServiceImpl.findPracownikByNazwisko(nazwisko);
    }

    @GetMapping("/byId/{id}")
    public Pracownik findPracownikById(@PathVariable("id") long id) {
        return pracownikServiceImpl.findPracownikById(id);
    }

    @PutMapping("/updatePracownik/{email}")
    public Pracownik updatePracownik(@PathVariable("username") String username, @RequestBody Pracownik pracownik) {
        return pracownikServiceImpl.updatePracownik(username, pracownik);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deletePracownikById(@PathVariable("id") long id) {
        pracownikServiceImpl.deletePracownikById(id);
    }

    @GetMapping("/byImie/{imie}")
    public List<Pracownik> findPracownicyByImie(@PathVariable("imie") String imie) {
        return pracownikServiceImpl.findPracownicyByImie(imie);
    }

    @GetMapping("/byDataZatrud/{dataZatrud}")
    public List<Pracownik> findPracownicyByDataZatrud(@PathVariable("dataZatrud") LocalDate dataZatrud) {
        return pracownikServiceImpl.findPracownicyByDataZatrud(dataZatrud);
    }

    @GetMapping("/byTelefon/{telefon}")
    public List<Pracownik> findPracownicyByTelefon(@PathVariable("telefon") String telefon) {
        return pracownikServiceImpl.findPracownicyByTelefon(telefon);
    }
    @GetMapping("/byMagazyn")
    public List<Pracownik> findPracownicyByMagazyn(@RequestBody Magazyn magazyn) {
        return pracownikServiceImpl.findPracownicyByMagazyn(magazyn);
    }

    @GetMapping("/byDzialStan/{idDzialStan}")
    public List<Pracownik> findPracownicyByDzialStan(@PathVariable("idDzialStan") Long idDzialStan) {
        return pracownikServiceImpl.findPracownicyByDzialStan(new IdDzialStan(idDzialStan));
    }

    @GetMapping("/byStawka")
    public List<Pracownik> findPracownicyByStawka(@RequestBody Stawka stawka) {
        return pracownikServiceImpl.findPracownicyByStawka(stawka);
    }

    @GetMapping("/byImieAndNazwiskoOrdered/{imie}/{nazwisko}")
    public List<Pracownik> findPracownicyByImieAndNazwiskoOrderedByNazwiskoAsc(@PathVariable("imie") String imie, @PathVariable("nazwisko") String nazwisko) {
        return pracownikServiceImpl.findPracownicyByImieAndNazwiskoOrderedByNazwiskoAsc(imie, nazwisko);
    }

    @GetMapping("/countByImie/{imie}")
    public int countPracownicyByImie(@PathVariable("imie") String imie) {
        return pracownikServiceImpl.countPracownicyByImie(imie);
    }
}