package com.szm.sys_zarz_mag.Controller;

import com.szm.sys_zarz_mag.Service.Impl.ZadanieServiceImpl;
import com.szm.sys_zarz_mag.Entity.Pracownik;
import com.szm.sys_zarz_mag.Entity.Zadanie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zadanie")
public class ZadanieController {

    private final ZadanieServiceImpl zadanieServiceImpl;

    @Autowired
    public ZadanieController(ZadanieServiceImpl zadanieServiceImpl) {
        this.zadanieServiceImpl = zadanieServiceImpl;
    }

    @GetMapping("/getAll")
    public List<Zadanie> getAllZadania() {
        return zadanieServiceImpl.getAllZadania();
    }


    @PostMapping("/add")
    public Zadanie addZadanie(@RequestBody Zadanie zadanie) {
        return zadanieServiceImpl.addZadanie(zadanie);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteZadanieById(@PathVariable("id") Long id) {
        zadanieServiceImpl.deleteZadanieById(id);
    }


    @GetMapping("/getById/{id}")
    public Zadanie getZadanieById(@PathVariable("id") Long id) {
        return zadanieServiceImpl.getZadanieById(id);
    }

    @GetMapping("/getByTytul/{tytul}")
    public Zadanie getZadanieByTytul(@PathVariable("tytul") String tytul) {
        return zadanieServiceImpl.getZadanieByTytul(tytul);
    }

    @GetMapping("/getByPracownik")
    public List<Zadanie> getZadaniaByPracownik(@RequestBody Pracownik pracownik) {
        return zadanieServiceImpl.getZadaniaByPracownik(pracownik);
    }

    @GetMapping("/getByFragmentOpisu/{fragment}")
    public List<Zadanie> getZadaniaByFragmentOpisu(@PathVariable("fragment") String fragment) {
        return zadanieServiceImpl.getZadaniaByFragmentOpisu(fragment);
    }

    @GetMapping("/getAllSortedByPracownikId")
    public List<Zadanie> getAllZadaniaSortedByPracownikId() {
        return zadanieServiceImpl.getAllZadaniaSortedByPracownikId();
    }

    @GetMapping("/getByPracownikId/{id}")
    public List<Zadanie> getZadaniaByPracownikId(@PathVariable("id") Long id) {
        return zadanieServiceImpl.getZadaniaByPracownikId(id);
    }
}
