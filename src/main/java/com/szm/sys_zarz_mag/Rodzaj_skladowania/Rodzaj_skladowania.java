package com.szm.sys_zarz_mag.Rodzaj_skladowania;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Rodzaj_skladowania {

    @Id
    private int ID_rodzaj_skladowania;
    private String rodzaj_skladowania;
}
