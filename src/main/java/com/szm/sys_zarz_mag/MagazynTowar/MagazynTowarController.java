package com.szm.sys_zarz_mag.MagazynTowar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/magazynTowar")
public class MagazynTowarController {

    private final MagazynTowarService magazynTowarService;

    @Autowired
    public MagazynTowarController(MagazynTowarService magazynTowarService) {
        this.magazynTowarService = magazynTowarService;
    }

    @GetMapping("/towaryWMagazynie/{idMagazyn}")
    public List<MagazynTowar> znajdzTowaryWMagazynie(@PathVariable Long idMagazyn) {
        return magazynTowarService.znajdzTowaryWMagazynie(idMagazyn);
    }

    @GetMapping("/towaryWMagazynieONazwie/{idMagazyn}/{nazwaMagazyn}")
    public List<MagazynTowar> znajdzTowaryWMagazynieONazwie(@PathVariable Long idMagazyn, @PathVariable String nazwaMagazyn) {
        return magazynTowarService.znajdzTowaryWMagazynieONazwie(idMagazyn, nazwaMagazyn);
    }
    @GetMapping("/magazynyZTowarem/{idTowar}")
    public List<MagazynTowar> znajdzMagazynyZTowarem(@PathVariable Long idTowar) {
        return magazynTowarService.znajdzMagazynyZTowarem(idTowar);
    }

    @GetMapping("/towarWMagazynie/{idTowar}/{idMagazyn}")
    public MagazynTowar znajdzTowarWMagazynie(@PathVariable Long idTowar, @PathVariable Long idMagazyn) {
        return magazynTowarService.znajdzTowarWMagazynie(idTowar, idMagazyn);
    }


    // @GetMapping("/towarWTymMagazynie/{idTowar}/{idMagazyn}")
    // public MagazynTowar znajdzTowarWTymMagazynie(@PathVariable Long idTowar, @PathVariable Long idMagazyn) {
    //     return magazynTowarService.znajdzTowarWTymMagazynie(idTowar, idMagazyn);
    // }
}