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
    public Jednostka findJednostkaByNazwa(@PathVariable String nazwaJednostki) {
        return jednostkaService.findJednostkaByNazwa(nazwaJednostki);
    }

    @GetMapping("/byId/{idJednostka}")
    public Jednostka findJednostkaById(@PathVariable long idJednostka) {
        return jednostkaService.findJednostkaById(idJednostka);
    }

    // Delete Jednostka by Nazwa
    @DeleteMapping("/deleteByNazwa/{nazwaJednostki}")
    public void deleteJednostkaByNazwa(@PathVariable String nazwaJednostki) {
        jednostkaService.deleteJednostkaByNazwa(nazwaJednostki);
    }

    // Find Jednostki by Fragment Nazwy
    @GetMapping("/byFragmentNazwy/{fragmentNazwy}")
    public List<Jednostka> findJednostkiByFragmentNazwy(@PathVariable String fragmentNazwy) {
        return jednostkaService.findJednostkiByFragmentNazwy(fragmentNazwy);
    }

    // Find all Jednostki sorted alphabetically
    @GetMapping("/allSorted")
    public List<Jednostka> findAllJednostkiSortedAlphabetically() {
        return jednostkaService.findAllJednostkiSortedAlphabetically();
    }

    // Find existing Jednostki
    @GetMapping("/existing")
    public List<Jednostka> findExistingJednostki() {
        return jednostkaService.findExistingJednostki();
    }

    // Count Jednostki by Nazwa
    @GetMapping("/countByNazwa/{nazwaJednostki}")
    public int countJednostkiByNazwa(@PathVariable String nazwaJednostki) {
        return jednostkaService.countJednostkiByNazwa(nazwaJednostki);
    }
}
