package com.szm.sys_zarz_mag.Controller;

import com.szm.sys_zarz_mag.Service.Impl.StanowiskoServiceImpl;
import com.szm.sys_zarz_mag.Entity.Stanowisko;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stanowisko")
public class StanowiskoController {

    private final StanowiskoServiceImpl stanowiskoServiceImpl;

    @Autowired
    public StanowiskoController(StanowiskoServiceImpl stanowiskoServiceImpl) {
        this.stanowiskoServiceImpl = stanowiskoServiceImpl;
    }

    @PostMapping ("/saveStanowisko")
    public Stanowisko saveStanowisko(@RequestBody Stanowisko stanowisko) {
        return stanowiskoServiceImpl.saveStanowisko(stanowisko);
    }

    @Transactional
    @DeleteMapping("/deleteByNazwa/{nazwa}")
    public void deleteStanowiskoByNazwa(@PathVariable("nazwa") String nazwa) {
        stanowiskoServiceImpl.deleteStanowiskoByNazwa(nazwa);
    }

    @PutMapping("/updateStanowisko/{nazwa}")
    public Stanowisko updateStanowisko(@PathVariable("nazwa") String nazwa, @RequestBody Stanowisko stanowisko) {
        return stanowiskoServiceImpl.updateStanowisko(nazwa, stanowisko);
    }

    @GetMapping("/findByNazwa/{nazwa}")
    public Stanowisko findStanowiskoByNazwa(@PathVariable("nazwa") String nazwa) {
        return stanowiskoServiceImpl.findStanowiskoByNazwa(nazwa);
    }

    @GetMapping("/findById/{id}")
    public Stanowisko findStanowiskoById(@PathVariable("id") long id) {
        return stanowiskoServiceImpl.findStanowiskoById(id);
    }


    @GetMapping("/findByFragmentNazwy/{fragment}")
    public List<Stanowisko> findStanowiskoByFragmentNazwy(@PathVariable("fragment") String fragment) {
        return stanowiskoServiceImpl.findStanowiskoByFragmentNazwy(fragment);
    }

    @GetMapping("/findAllSorted")
    public List<Stanowisko> findAllStanowiskaSortedAlphabetically() {
        return stanowiskoServiceImpl.findAllStanowiskaSortedAlphabetically();
    }

    @GetMapping("/findExisting")
    public List<Stanowisko> findExistingStanowiska() {
        return stanowiskoServiceImpl.findExistingStanowiska();
    }

    @GetMapping("/countByNazwa/{nazwa}")
    public int countStanowiskoByNazwa(@PathVariable("nazwa") String nazwa) {
        return stanowiskoServiceImpl.countStanowiskoByNazwa(nazwa);
    }
}
