package com.szm.sys_zarz_mag.RodzajSkladowania;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rodzajSkladowania")
public class RodzajSkladowaniaController {

    private final RodzajSkladowaniaService rodzajSkladowaniaService;

    @Autowired
    public RodzajSkladowaniaController(RodzajSkladowaniaService rodzajSkladowaniaService) {
        this.rodzajSkladowaniaService = rodzajSkladowaniaService;
    }

    @GetMapping("/findByNazwa/{nazwaRodzaju}")
    public RodzajSkladowania findRodzajSkladowaniaByNazwa(@PathVariable String nazwaRodzaju) {
        return rodzajSkladowaniaService.findRodzajSkladowaniaByNazwa(nazwaRodzaju);
    }

    @GetMapping("/findById/{id}")
    public RodzajSkladowania findRodzajSkladowaniaById(@PathVariable long id) {
        return rodzajSkladowaniaService.findRodzajSkladowaniaById(id);
    }

    @DeleteMapping("/deleteByNazwa/{nazwaRodzaju}")
    public void deleteRodzajSkladowaniaByNazwa(@PathVariable String nazwaRodzaju) {
        rodzajSkladowaniaService.deleteRodzajSkladowaniaByNazwa(nazwaRodzaju);
    }

    @GetMapping("/findByFragmentNazwy/{fragment}")
    public List<RodzajSkladowania> findRodzajeSkladowaniaByFragmentNazwy(@PathVariable String fragment) {
        return rodzajSkladowaniaService.findRodzajeSkladowaniaByFragmentNazwy(fragment);
    }

    @GetMapping("/findExisting")
    public List<RodzajSkladowania> findExistingRodzajeSkladowania() {
        return rodzajSkladowaniaService.findExistingRodzajeSkladowania();
    }

    @GetMapping("/countByNazwa/{nazwaRodzaju}")
    public int countRodzajeSkladowaniaByNazwa(@PathVariable String nazwaRodzaju) {
        return rodzajSkladowaniaService.countRodzajeSkladowaniaByNazwa(nazwaRodzaju);
    }
}