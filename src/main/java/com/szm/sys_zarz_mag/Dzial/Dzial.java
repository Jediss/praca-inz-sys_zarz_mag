package com.szm.sys_zarz_mag.Dzial;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dzial {

    @Id
    private int ID_dzial;
    private String dzial;
}
