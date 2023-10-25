package com.szm.sys_zarz_mag.Miejsce_skladowania;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Miejsce_skladowania {

    @Id
    private long ID_miejsce_skladowania;
    private boolean hala;
    private boolean plac;
    private int x;
    private int y;
    private int level;

}
