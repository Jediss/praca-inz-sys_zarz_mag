package com.szm.sys_zarz_mag.Towar;

import com.szm.sys_zarz_mag.Jednostka.Jednostka;
import com.szm.sys_zarz_mag.MiejsceSkladowania.MiejsceSkladowania;
import com.szm.sys_zarz_mag.RodzajSkladowania.RodzajSkladowania;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/towar")
public class TowarController {

    private final TowarService towarService;

    @Autowired
    public TowarController(TowarService towarService) {
        this.towarService = towarService;
    }

    @PostMapping("/dodajNazwe")
    public void dodajNazweTowaru(@RequestParam long towarId, @RequestParam String nazwa) {
        towarService.dodajNazweTowaru(towarId, nazwa);
    }

    @PostMapping("/dodajIlosc")
    public void dodajIloscTowaru(@RequestParam long towarId, @RequestParam double ilosc) {
        towarService.dodajIloscTowaru(towarId, ilosc);
    }

    @PostMapping("/dodajDatePrzyjecia")
    public void dodajDatePrzyjecia(@RequestParam long towarId, @RequestParam String data) {
        towarService.dodajDatePrzyjecia(towarId, data);
    }

    @PostMapping("/dodajDateWysylki")
    public void dodajDateWysylki(@RequestParam long towarId, @RequestParam String data) {
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

    @PutMapping("/edytujIlosc")
    public void edytujIloscTowaru(@RequestParam long towarId, @RequestParam double ilosc) {
        towarService.edytujIloscTowaru(towarId, ilosc);
    }

    @PutMapping("/edytujNazwe")
    public void edytujNazweTowaru(@RequestParam long towarId, @RequestParam String nazwa) {
        towarService.edytujNazweTowaru(towarId, nazwa);
    }

    @PutMapping("/edytujDatePrzyjecia")
    public void edytujDatePrzyjecia(@RequestParam long towarId, @RequestParam String data) {
        towarService.edytujDatePrzyjecia(towarId, data);
    }

    @PutMapping("/edytujDateWysylki")
    public void edytujDateWysylki(@RequestParam long towarId, @RequestParam String data) {
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

    @GetMapping("/znajdzWiekszeNiz/{ilosc}")
    public List<Towar> znajdzTowaryZIlosciaWiekszaNiz(@PathVariable("ilosc") double ilosc) {
        return towarService.znajdzTowaryZIlosciaWiekszaNiz(ilosc);
    }

    @GetMapping("/znajdzMniejszeNiz/{ilosc}")
    public List<Towar> znajdzTowaryZIlosciaMniejszaNiz(@PathVariable("ilosc") double ilosc) {
        return towarService.znajdzTowaryZIlosciaMniejszaNiz(ilosc);
    }

    @GetMapping("/znajdzPomiedzy/{ilosc1}/{ilosc2}")
    public List<Towar> znajdzTowaryZIlosciaPomiedzy(@PathVariable("ilosc1") double ilosc1, @PathVariable("ilosc2") double ilosc2) {
        return towarService.znajdzTowaryZIlosciaPomiedzy(ilosc1, ilosc2);
    }

    @GetMapping("/znajdzPoDacieWysylki/{dataWysylki}")
    public List<Towar> znajdzTowaryZDataWysylki(@PathVariable("dataWysylki") String dataWysylki) {
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