package com.szm.sys_zarz_mag.Controller;

import com.szm.sys_zarz_mag.Service.Impl.JednostkaServiceImpl;
import com.szm.sys_zarz_mag.Entity.Jednostka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/jednostka")
public class JednostkaController {

    private final JednostkaServiceImpl jednostkaServiceImpl;

    @Autowired
    public JednostkaController(JednostkaServiceImpl jednostkaServiceImpl) {
        this.jednostkaServiceImpl = jednostkaServiceImpl;
    }

    @GetMapping("/all")
    public List<Jednostka> findAllJednostki() {
        return jednostkaServiceImpl.findAllJednostki();
    }

}
