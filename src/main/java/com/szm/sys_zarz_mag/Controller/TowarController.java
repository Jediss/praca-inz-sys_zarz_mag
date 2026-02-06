package com.szm.sys_zarz_mag.Controller;

import com.szm.sys_zarz_mag.Service.Impl.TowarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/towar")
public class TowarController {

    private final TowarServiceImpl towarServiceImpl;

    @Autowired
    public TowarController(TowarServiceImpl towarServiceImpl) {
        this.towarServiceImpl = towarServiceImpl;
    }
}