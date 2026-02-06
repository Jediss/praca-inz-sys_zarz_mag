package com.szm.sys_zarz_mag.Controller;

import com.szm.sys_zarz_mag.Service.Impl.DzialServiceImpl;
import com.szm.sys_zarz_mag.Entity.Dzial;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dzial")
public class DzialController {

    private final DzialServiceImpl dzialServiceImpl;

    @Autowired
    public DzialController(DzialServiceImpl dzialServiceImpl) {
        this.dzialServiceImpl = dzialServiceImpl;
    }

    @PostMapping("/saveDzial")
    public Dzial saveDzial(@RequestBody Dzial dzial) {
        return dzialServiceImpl.saveDzial(dzial);
    }

    @Transactional
    @DeleteMapping("/deleteByNazwa/{nazwa}")
    public void deleteDzialByNazwa(@PathVariable("nazwa") String dzial) {
        dzialServiceImpl.deleteDzialByNazwa(dzial);
    }

    @PutMapping("/updateDzial/{nazwa}")
    public Dzial updateDzial(@PathVariable("nazwa") String nazwa, @RequestBody Dzial dzial)
    {
        return dzialServiceImpl.updateDzial(nazwa, dzial);
    }

    @GetMapping("/byNazwa/{nazwa}")
    public Dzial findDzialByNazwa(@PathVariable("nazwa") String nazwa) {
        return dzialServiceImpl.findDzialByNazwa(nazwa);
    }

    @GetMapping("/byId/{id}")
    public Dzial findDzialById(@PathVariable("id") long id) {
        return dzialServiceImpl.findDzialById(id);
    }

    @GetMapping("/byIdAndNazwa/{id}/{dzial}")
    public Dzial findDzialByIdAndNazwa(@PathVariable("id") long id, @PathVariable("dzial") String dzial) {
        return dzialServiceImpl.findDzialByIdAndNazwa(id, dzial);
    }

    @GetMapping("/byPartialNazwa/{partialNazwa}")
    public List<Dzial> findDzialByPartialNazwa(@PathVariable("partialNazwa") String partialNazwa) {
        return dzialServiceImpl.findDzialByPartialNazwa(partialNazwa);
    }

    @GetMapping("/byNazwaSorted/{nazwa}")
    public List<Dzial> findDzialByNazwaSorted(@PathVariable("nazwa") String nazwa) {
        return dzialServiceImpl.findDzialByNazwaSorted(nazwa);
    }

    @GetMapping("/allNotNull")
    public List<Dzial> findDzialNotNull() {
        return dzialServiceImpl.findDzialNotNull();
    }

    @GetMapping("/countByNazwa/{nazwa}")
    public int countDzialByNazwa(@PathVariable("nazwa") String nazwa) {
        return dzialServiceImpl.countDzialByNazwa(nazwa);
    }
}
