package com.szm.sys_zarz_mag.Magazyn;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Magazyn {

    @Id
    private int ID_magazyn;
    private String nazwa_magazyn;
    private String adres_ulica_m;
    private String adres_kod_m;
    private String adres_miasto_m;
}
