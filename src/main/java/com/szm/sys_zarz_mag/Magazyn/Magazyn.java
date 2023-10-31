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
    private long IdMagazyn;

    @Column(nullable = false)
    private String nazwaMagazyn;

    @Column(nullable = false)
    private String adresUlicaM;

    @Column(nullable = false)
    private String adresKodM;

    @Column(nullable = false)
    private String adresMiastoM;
}
