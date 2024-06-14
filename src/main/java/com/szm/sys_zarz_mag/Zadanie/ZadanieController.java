package com.szm.sys_zarz_mag.Zadanie;

import com.szm.sys_zarz_mag.Pracownik.Pracownik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zadanie")
public class ZadanieController {

    private final ZadanieService zadanieService;

    @Autowired
    public ZadanieController(ZadanieService zadanieService) {
        this.zadanieService = zadanieService;
    }

    @GetMapping("/getAll")
    public List<Zadanie> getAllZadania() {
        return zadanieService.getAllZadania();
    }

    @GetMapping("/getById/{id}")
    public Zadanie getZadanieById(@PathVariable("id") Long id) {
        return zadanieService.getZadanieById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteZadanieById(@PathVariable("id") Long id) {
        zadanieService.deleteZadanieById(id);
    }

    @DeleteMapping("/deleteByOpis/{opis}")
    public void deleteZadanieByOpis(@PathVariable("id") String opis) {
        zadanieService.deleteZadanieByOpis(opis);
    }

    @GetMapping("/getByPracownik")
    public List<Zadanie> getZadaniaByPracownik(@RequestBody Pracownik pracownik) {
        return zadanieService.getZadaniaByPracownik(pracownik);
    }

    @GetMapping("/getByFragmentOpisu/{fragment}")
    public List<Zadanie> getZadaniaByFragmentOpisu(@PathVariable("fragment") String fragment) {
        return zadanieService.getZadaniaByFragmentOpisu(fragment);
    }

    @GetMapping("/getAllSortedByPracownikId")
    public List<Zadanie> getAllZadaniaSortedByPracownikId() {
        return zadanieService.getAllZadaniaSortedByPracownikId();
    }

    @GetMapping("/getByPracownikId/{id}")
    public List<Zadanie> getZadaniaByPracownikId(@PathVariable("id") Long id) {
        return zadanieService.getZadaniaByPracownikId(id);
    }
}
