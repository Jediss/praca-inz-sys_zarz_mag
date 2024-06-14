package com.szm.sys_zarz_mag.Stanowisko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stanowisko")
public class StanowiskoController {

    private final StanowiskoService stanowiskoService;

    @Autowired
    public StanowiskoController(StanowiskoService stanowiskoService) {
        this.stanowiskoService = stanowiskoService;
    }

    @GetMapping("/findByNazwa/{nazwa}")
    public Stanowisko findStanowiskoByNazwa(@PathVariable("nazwa") String nazwa) {
        return stanowiskoService.findStanowiskoByNazwa(nazwa);
    }

    @GetMapping("/findById/{id}")
    public Stanowisko findStanowiskoById(@PathVariable("id") long id) {
        return stanowiskoService.findStanowiskoById(id);
    }

    @DeleteMapping("/deleteByNazwa/{nazwa}")
    public void deleteStanowiskoByNazwa(@PathVariable("nazwa") String nazwa) {
        stanowiskoService.deleteStanowiskoByNazwa(nazwa);
    }

    @GetMapping("/findByFragmentNazwy/{fragment}")
    public List<Stanowisko> findStanowiskoByFragmentNazwy(@PathVariable("fragment") String fragment) {
        return stanowiskoService.findStanowiskoByFragmentNazwy(fragment);
    }

    @GetMapping("/findAllSorted")
    public List<Stanowisko> findAllStanowiskaSortedAlphabetically() {
        return stanowiskoService.findAllStanowiskaSortedAlphabetically();
    }

    @GetMapping("/findExisting")
    public List<Stanowisko> findExistingStanowiska() {
        return stanowiskoService.findExistingStanowiska();
    }

    @GetMapping("/countByNazwa/{nazwa}")
    public int countStanowiskoByNazwa(@PathVariable("nazwa") String nazwa) {
        return stanowiskoService.countStanowiskoByNazwa(nazwa);
    }
}
