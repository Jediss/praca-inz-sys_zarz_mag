package com.szm.sys_zarz_mag.RodzajSkladowania;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3001")
@RequestMapping("/rodzajSkladowania")
public class RodzajSkladowaniaController {

    private final RodzajSkladowaniaService rodzajSkladowaniaService;

    @Autowired
    public RodzajSkladowaniaController(RodzajSkladowaniaService rodzajSkladowaniaService) {
        this.rodzajSkladowaniaService = rodzajSkladowaniaService;
    }


    @PostMapping("/saveRodzajSkladowania")
    public RodzajSkladowania saveRodzajSkladowania(@RequestBody RodzajSkladowania rodzajSkladowania) {
        return rodzajSkladowaniaService.saveRodzajSkladowania(rodzajSkladowania);
    }

    @Transactional
    @DeleteMapping("/deleteByNazwa/{nazwaRodzaju}")
    public void deleteRodzajSkladowaniaByNazwa(@PathVariable("nazwaRodzaju") String nazwaRodzaju) {
        rodzajSkladowaniaService.deleteRodzajSkladowaniaByNazwa(nazwaRodzaju);
    }

    @PutMapping("/updateRodzajSkladowania/{nazwaRodzaju}")
    public RodzajSkladowania updateRodzajSkladowania(@PathVariable("nazwaRodzaju") String nazwaRodzaju, @RequestBody RodzajSkladowania rodzajSkladowania)
    {
        return rodzajSkladowaniaService.updateRodzajSkladowania(nazwaRodzaju, rodzajSkladowania);
    }


    @GetMapping("/all")
    public List<RodzajSkladowania> findAllRodzajeSkladowania() {
        return rodzajSkladowaniaService.findAllRodzajeSkladowania();
    }

    @GetMapping("/findByNazwa/{nazwaRodzaju}")
    public RodzajSkladowania findRodzajSkladowaniaByNazwa(@PathVariable("nazwaRodzaju") String nazwaRodzaju) {
        return rodzajSkladowaniaService.findRodzajSkladowaniaByNazwa(nazwaRodzaju);
    }

    @GetMapping("/findById/{id}")
    public RodzajSkladowania findRodzajSkladowaniaById(@PathVariable("id") long id) {
        return rodzajSkladowaniaService.findRodzajSkladowaniaById(id);
    }

    @GetMapping("/findByFragmentNazwy/{fragment}")
    public List<RodzajSkladowania> findRodzajeSkladowaniaByFragmentNazwy(@PathVariable("fragment") String fragment) {
        return rodzajSkladowaniaService.findRodzajeSkladowaniaByFragmentNazwy(fragment);
    }

    @GetMapping("/findExisting")
    public List<RodzajSkladowania> findExistingRodzajeSkladowania() {
        return rodzajSkladowaniaService.findExistingRodzajeSkladowania();
    }

    @GetMapping("/countByNazwa/{nazwaRodzaju}")
    public int countRodzajeSkladowaniaByNazwa(@PathVariable("nazwaRodzaju") String nazwaRodzaju) {
        return rodzajSkladowaniaService.countRodzajeSkladowaniaByNazwa(nazwaRodzaju);
    }
}