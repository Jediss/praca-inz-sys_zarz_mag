package com.szm.sys_zarz_mag.controller;

import com.szm.sys_zarz_mag.service.TowarService;
import com.szm.sys_zarz_mag.model.Jednostka;
import com.szm.sys_zarz_mag.model.MiejsceSkladowania;
import com.szm.sys_zarz_mag.model.RodzajSkladowania;
import com.szm.sys_zarz_mag.model.Towar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/towar")
public class TowarController {

    private final TowarService towarService;

    @Autowired
    public TowarController(TowarService towarService) {
        this.towarService = towarService;
    }



    @PostMapping("/all")
    public List<Towar> addAllTowar(@RequestBody List<Towar> towary) {
        return towarService.addAllTowar(towary);
    }

    @PostMapping("/dodajNazwe")
    public void dodajNazweTowaru(@RequestParam long towarId, @RequestParam String nazwa) {
        towarService.dodajNazweTowaru(towarId, nazwa);
    }

    @PostMapping("/dodajDatePrzyjecia")
    public void dodajDatePrzyjecia(@RequestParam long towarId, @RequestParam LocalDate data) {
        towarService.dodajDatePrzyjecia(towarId, data);
    }

    @PostMapping("/dodajDateWysylki")
    public void dodajDateWysylki(@RequestParam long towarId, @RequestParam LocalDate data) {
        towarService.dodajDateWysylki(towarId, data);
    }

    @PostMapping("/dodajRodzajSkladowania")
    public void dodajRodzajSkladowania(@RequestParam long towarId, @RequestBody RodzajSkladowania rodzajSkladowania) {
        towarService.dodajRodzajSkladowania(towarId, rodzajSkladowania);
    }

    @PostMapping("/dodajJednostke")
    public void dodajJednostke(@RequestParam long towarId, @RequestBody Jednostka jednostka) {
        towarService.dodajJednostke(towarId, jednostka);
    }


    @PutMapping("/edytujNazwe")
    public void edytujNazweTowaru(@RequestParam long towarId, @RequestParam String nazwa) {
        towarService.edytujNazweTowaru(towarId, nazwa);
    }

    @PutMapping("/edytujDatePrzyjecia")
    public void edytujDatePrzyjecia(@RequestParam long towarId, @RequestParam LocalDate data) {
        towarService.edytujDatePrzyjecia(towarId, data);
    }

    @PutMapping("/edytujDateWysylki")
    public void edytujDateWysylki(@RequestParam long towarId, @RequestParam LocalDate data) {
        towarService.edytujDateWysylki(towarId, data);
    }

    @PutMapping("/edytujRodzajSkladowania")
    public void edytujRodzajSkladowania(@RequestParam long towarId, @RequestBody RodzajSkladowania rodzajSkladowania) {
        towarService.edytujRodzajSkladowania(towarId, rodzajSkladowania);
    }

    @PutMapping("/edytujMiejsceSkladowania")
    public void edytujMiejsceSkladowania(@RequestParam long towarId, @RequestBody MiejsceSkladowania miejsceSkladowania) {
        towarService.edytujMiejsceSkladowania(towarId, miejsceSkladowania);
    }

    @PutMapping("/edytujJednostke")
    public void edytujJednostke(@RequestParam long towarId, @RequestBody Jednostka jednostka) {
        towarService.edytujJednostke(towarId, jednostka);
    }

    @DeleteMapping("/usun/{towarId}")
    public void usunTowar(@PathVariable("towarId") long towarId) {
        towarService.usunTowar(towarId);
    }


    @GetMapping("/znajdzPoNazwie/{nazwaTowar}")
    public Towar znajdzTowarNaPodstawieNazwy(@PathVariable("nazwaTowar") String nazwaTowar) {
        return towarService.znajdzTowarNaPodstawieNazwy(nazwaTowar);
    }


    @GetMapping("/znajdzPoDacieWysylki/{dataWysylki}")
    public List<Towar> znajdzTowaryZDataWysylki(@PathVariable("dataWysylki") LocalDate dataWysylki) {
        return towarService.znajdzTowaryZDataWysylki(dataWysylki);
    }

    @GetMapping("/znajdzZNiepustaNazwa")
    public List<Towar> znajdzTowaryZNazwaNotNull() {
        return towarService.znajdzTowaryZNazwaNotNull();
    }

    @GetMapping("/policzPoNazwie/{nazwaTowar}")
    public int policzTowaryZNazwa(@PathVariable("nazwaTowar") String nazwaTowar) {
        return towarService.policzTowaryZNazwa(nazwaTowar);
    }


    @PostMapping("/dodajPelneMiejsceSkladowania")
    public void dodajMiejsceSkladowania(@RequestParam long towarId, @RequestBody MiejsceSkladowania miejsceSkladowania) {
        towarService.dodajMiejsceSkladowania(towarId, miejsceSkladowania);
    }
}