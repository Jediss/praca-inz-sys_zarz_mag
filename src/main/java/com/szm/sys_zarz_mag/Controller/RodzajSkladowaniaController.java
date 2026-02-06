package com.szm.sys_zarz_mag.Controller;

import com.szm.sys_zarz_mag.Service.Impl.RodzajSkladowaniaServiceImpl;
import com.szm.sys_zarz_mag.Entity.RodzajSkladowania;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3001")
@RequestMapping("/rodzajSkladowania")
public class RodzajSkladowaniaController {

    private final RodzajSkladowaniaServiceImpl rodzajSkladowaniaServiceImpl;

    @Autowired
    public RodzajSkladowaniaController(RodzajSkladowaniaServiceImpl rodzajSkladowaniaServiceImpl) {
        this.rodzajSkladowaniaServiceImpl = rodzajSkladowaniaServiceImpl;
    }

    @PostMapping("/saveRodzajSkladowania")
    public RodzajSkladowania saveRodzajSkladowania(@RequestBody RodzajSkladowania rodzajSkladowania) {
        return rodzajSkladowaniaServiceImpl.saveRodzajSkladowania(rodzajSkladowania);
    }

    @GetMapping("/all")
    public List<RodzajSkladowania> findAllRodzajeSkladowania() {
        return rodzajSkladowaniaServiceImpl.findAllRodzajeSkladowania();
    }

}