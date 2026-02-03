package com.szm.sys_zarz_mag.controller;

import com.szm.sys_zarz_mag.service.RodzajSkladowaniaService;
import com.szm.sys_zarz_mag.model.RodzajSkladowania;
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

    @GetMapping("/all")
    public List<RodzajSkladowania> findAllRodzajeSkladowania() {
        return rodzajSkladowaniaService.findAllRodzajeSkladowania();
    }

}