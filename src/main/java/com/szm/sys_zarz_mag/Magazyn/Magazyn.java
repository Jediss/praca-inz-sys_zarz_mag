package com.szm.sys_zarz_mag.Magazyn;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Magazyn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_magazyn;

    @Column(nullable = false)
    private String nazwa_magazyn;

    @Column(nullable = false)
    private String adres_ulica_m;

    @Column(nullable = false)
    private String adres_kod_m;

    @Column(nullable = false)
    private String adres_miasto_m;
}
