package com.szm.sys_zarz_mag.controller;

import com.szm.sys_zarz_mag.service.JednostkaService;
import com.szm.sys_zarz_mag.model.Jednostka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/jednostka")
public class JednostkaController {

    private final JednostkaService jednostkaService;

    @Autowired
    public JednostkaController(JednostkaService jednostkaService) {
        this.jednostkaService = jednostkaService;
    }

    @GetMapping("/all")
    public List<Jednostka> findAllJednostki() {
        return jednostkaService.findAllJednostki();
    }

}
