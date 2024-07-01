package com.szm.sys_zarz_mag.Dzial;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dzial")
public class DzialController {

    private final DzialService dzialService;

    @Autowired
    public DzialController(DzialService dzialService) {
        this.dzialService = dzialService;
    }

    @PostMapping("/saveDzial")
    public Dzial saveDzial(@RequestBody Dzial dzial) {
        return dzialService.saveDzial(dzial);
    }

    @Transactional
    @DeleteMapping("/deleteByNazwa/{nazwa}")
    public void deleteDzialByNazwa(@PathVariable("nazwa") String dzial) {
        dzialService.deleteDzialByNazwa(dzial);
    }

    @PutMapping("/updateDzial/{nazwa}")
    public Dzial updateDzial(@PathVariable("nazwa") String nazwa, @RequestBody Dzial dzial)
    {
        return dzialService.updateDzial(nazwa, dzial);
    }

    @GetMapping("/byNazwa/{nazwa}")
    public Dzial findDzialByNazwa(@PathVariable("nazwa") String nazwa) {
        return dzialService.findDzialByNazwa(nazwa);
    }

    @GetMapping("/byId/{id}")
    public Dzial findDzialById(@PathVariable("id") long id) {
        return dzialService.findDzialById(id);
    }

    @GetMapping("/byIdAndNazwa/{id}/{dzial}")
    public Dzial findDzialByIdAndNazwa(@PathVariable("id") long id, @PathVariable("dzial") String dzial) {
        return dzialService.findDzialByIdAndNazwa(id, dzial);
    }

    @GetMapping("/byPartialNazwa/{partialNazwa}")
    public List<Dzial> findDzialByPartialNazwa(@PathVariable("partialNazwa") String partialNazwa) {
        return dzialService.findDzialByPartialNazwa(partialNazwa);
    }

    @GetMapping("/byNazwaSorted/{nazwa}")
    public List<Dzial> findDzialByNazwaSorted(@PathVariable("nazwa") String nazwa) {
        return dzialService.findDzialByNazwaSorted(nazwa);
    }

    @GetMapping("/allNotNull")
    public List<Dzial> findDzialNotNull() {
        return dzialService.findDzialNotNull();
    }

    @GetMapping("/countByNazwa/{nazwa}")
    public int countDzialByNazwa(@PathVariable("nazwa") String nazwa) {
        return dzialService.countDzialByNazwa(nazwa);
    }
}
