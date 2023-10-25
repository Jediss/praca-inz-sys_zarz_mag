package com.szm.sys_zarz_mag.Jednostka;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Jednostka {

    @Id
    private int ID_jednostka;
    private String jednostka;
}
