package com.szm.sys_zarz_mag.Jednostka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jednostka")
public class JednostkaController {

    private final JednostkaService jednostkaService;

    @Autowired
    public JednostkaController(JednostkaService jednostkaService) {
        this.jednostkaService = jednostkaService;
    }

    @GetMapping("/byNazwa/{nazwaJednostki}")
    public Jednostka findJednostkaByNazwa(@PathVariable("nazwaJednostki") String nazwaJednostki) {
        return jednostkaService.findJednostkaByNazwa(nazwaJednostki);
    }

    @GetMapping("/byId/{idJednostka}")
    public Jednostka findJednostkaById(@PathVariable("idJednostka") long idJednostka) {
        return jednostkaService.findJednostkaById(idJednostka);
    }


    @DeleteMapping("/deleteByNazwa/{nazwaJednostki}")
    public void deleteJednostkaByNazwa(@PathVariable("nazwaJednostki") String nazwaJednostki) {
        jednostkaService.deleteJednostkaByNazwa(nazwaJednostki);
    }


    @GetMapping("/byFragmentNazwy/{fragmentNazwy}")
    public List<Jednostka> findJednostkiByFragmentNazwy(@PathVariable("fragmentNazwy") String fragmentNazwy) {
        return jednostkaService.findJednostkiByFragmentNazwy(fragmentNazwy);
    }


    @GetMapping("/allSorted")
    public List<Jednostka> findAllJednostkiSortedAlphabetically() {
        return jednostkaService.findAllJednostkiSortedAlphabetically();
    }


    @GetMapping("/existing")
    public List<Jednostka> findExistingJednostki() {
        return jednostkaService.findExistingJednostki();
    }


    @GetMapping("/countByNazwa/{nazwaJednostki}")
    public int countJednostkiByNazwa(@PathVariable("nazwaJednostki") String nazwaJednostki) {
        return jednostkaService.countJednostkiByNazwa(nazwaJednostki);
    }
}
