package com.szm.sys_zarz_mag.Stanowisko;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Stanowisko {

    @Id
    private int ID_stanowisko;
    private String stanowisko;
}
