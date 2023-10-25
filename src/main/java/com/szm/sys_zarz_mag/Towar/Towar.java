package com.szm.sys_zarz_mag.Towar;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Towar {

    @Id
    private long ID_towar;
    private String nazwa_towar;
    private float ilosc;
    private String data_przyjecia;
    private String data_wysylki;
}
