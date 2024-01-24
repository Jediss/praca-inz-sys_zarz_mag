package com.szm.sys_zarz_mag.Pracownik;

import com.szm.sys_zarz_mag.IdDzialStan.IdDzialStan;
import com.szm.sys_zarz_mag.Magazyn.Magazyn;
import com.szm.sys_zarz_mag.Stawka.Stawka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Pracownik findPracownikByNazwisko(@PathVariable String nazwisko) {
        return pracownikService.findPracownikByNazwisko(nazwisko);
    }

    @GetMapping("/byId/{id}")
    public Pracownik findPracownikById(@PathVariable long id) {
        return pracownikService.findPracownikById(id);
    }

    @GetMapping("/byLogin/{login}")
    public Pracownik findPracownikByLogin(@PathVariable String login) {
        return pracownikService.findPracownikByLogin(login);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deletePracownikById(@PathVariable long id) {
        pracownikService.deletePracownikById(id);
    }

    @GetMapping("/byImie/{imie}")
    public List<Pracownik> findPracownicyByImie(@PathVariable String imie) {
        return pracownikService.findPracownicyByImie(imie);
    }

    @GetMapping("/byDataZatrud/{dataZatrud}")
    public List<Pracownik> findPracownicyByDataZatrud(@PathVariable String dataZatrud) {
        return pracownikService.findPracownicyByDataZatrud(dataZatrud);
    }

    @GetMapping("/byDataZwol/{dataZwol}")
    public List<Pracownik> findPracownicyByDataZwol(@PathVariable String dataZwol) {
        return pracownikService.findPracownicyByDataZwol(dataZwol);
    }

    @GetMapping("/byTelefon/{telefon}")
    public List<Pracownik> findPracownicyByTelefon(@PathVariable String telefon) {
        return pracownikService.findPracownicyByTelefon(telefon);
    }
    @GetMapping("/byMagazyn")
    public List<Pracownik> findPracownicyByMagazyn(@RequestBody Magazyn magazyn) {
        return pracownikService.findPracownicyByMagazyn(magazyn);
    }

    @GetMapping("/byDzialStan/{idDzialStan}")
    public List<Pracownik> findPracownicyByDzialStan(@PathVariable Long idDzialStan) {
        return pracownikService.findPracownicyByDzialStan(new IdDzialStan(idDzialStan)); // Assuming constructor IdDzialStan(Long)
    }

    @GetMapping("/byStawka")
    public List<Pracownik> findPracownicyByStawka(@RequestBody Stawka stawka) {
        return pracownikService.findPracownicyByStawka(stawka);
    }

    @GetMapping("/byImieAndNazwiskoOrdered/{imie}/{nazwisko}")
    public List<Pracownik> findPracownicyByImieAndNazwiskoOrderedByNazwiskoAsc(@PathVariable String imie, @PathVariable String nazwisko) {
        return pracownikService.findPracownicyByImieAndNazwiskoOrderedByNazwiskoAsc(imie, nazwisko);
    }

    @GetMapping("/countByImie/{imie}")
    public int countPracownicyByImie(@PathVariable String imie) {
        return pracownikService.countPracownicyByImie(imie);
    }
}