package com.szm.sys_zarz_mag.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Magazyn")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Magazyn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMagazyn;

    @Column(nullable = false)
    private String nazwaMagazyn;

    @Column(nullable = false)
    private String adresUlicaM;

    @Column(nullable = false)
    private String adresKodM;

    @Column(nullable = false)
    private String adresMiastoM;

}
