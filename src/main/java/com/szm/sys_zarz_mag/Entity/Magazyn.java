package com.szm.sys_zarz_mag.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Magazyn")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Magazyn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMagazyn;

    @Column(nullable = false)
    private String nazwaMagazyn;

    @Column(nullable = false)
    private String adresUlicaM;

    @Column(nullable = false)
    private String adresKodM;

    @Column(nullable = false)
    private String adresMiastoM;

}
