package com.szm.sys_zarz_mag.Controller;

import com.szm.sys_zarz_mag.Service.Impl.MagazynTowarServiceimpl;
import com.szm.sys_zarz_mag.Entity.MagazynTowar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/magazynTowar")
public class MagazynTowarController {

    private final MagazynTowarServiceimpl magazynTowarServiceimpl;

    @Autowired
    public MagazynTowarController(MagazynTowarServiceimpl magazynTowarServiceimpl) {
        this.magazynTowarServiceimpl = magazynTowarServiceimpl;
    }

    @GetMapping("/allInMagazynTowar")
    public List<MagazynTowar> findAll() {
        return magazynTowarServiceimpl.findAll();
    }

    //Całość do poprawy
    @GetMapping("/towaryWMagazynie/{idMagazyn}")
    public List<MagazynTowar> znajdzTowaryWMagazynie(@PathVariable("idMagazyn") Long idMagazyn) {
        return magazynTowarServiceimpl.znajdzTowaryWMagazynie(idMagazyn);
    }

    @GetMapping("/towaryWMagazynieONazwie/{idMagazyn}/{nazwaMagazyn}")
    public List<MagazynTowar> znajdzTowaryWMagazynieONazwie(@PathVariable Long idMagazyn, @PathVariable String nazwaMagazyn) {
        return magazynTowarServiceimpl.znajdzTowaryWMagazynieONazwie(idMagazyn, nazwaMagazyn);
    }
    @GetMapping("/magazynyZTowarem/{idTowar}")
    public List<MagazynTowar> znajdzMagazynyZTowarem(@PathVariable Long idTowar) {
        return magazynTowarServiceimpl.znajdzMagazynyZTowarem(idTowar);
    }

    @GetMapping("/towarWMagazynie/{idTowar}/{idMagazyn}")
    public MagazynTowar znajdzTowarWMagazynie(@PathVariable Long idTowar, @PathVariable Long idMagazyn) {
        return magazynTowarServiceimpl.znajdzTowarWMagazynie(idTowar, idMagazyn);
    }


    // @GetMapping("/towarWTymMagazynie/{idTowar}/{idMagazyn}")
    // public MagazynTowar znajdzTowarWTymMagazynie(@PathVariable Long idTowar, @PathVariable Long idMagazyn) {
    //     return magazynTowarService.znajdzTowarWTymMagazynie(idTowar, idMagazyn);
    // }
}