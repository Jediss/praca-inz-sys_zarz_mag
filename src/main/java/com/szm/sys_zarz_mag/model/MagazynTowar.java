package com.szm.sys_zarz_mag.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MagazynTowar")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MagazynTowar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMagazynTowar;

    @ManyToOne
    @JoinColumn(name = "idTowar")
    private Towar towar;

    @ManyToOne
    @JoinColumn(name = "idMagazyn")
    private Magazyn magazyn;

    @ManyToOne
    @JoinColumn(name = "idMiejsceSkladowania")
    private MiejsceSkladowania miejsceSkladowania;

    @ManyToOne
    @JoinColumn(name = "idRodzajSkladowania")
    private RodzajSkladowania rodzajSkladowania;

    @ManyToOne
    @JoinColumn(name = "idJednostka")
    private Jednostka jednostka;

    @Column(nullable = false)
    private double iloscTowar;

    @Column
    private Integer iloscStelazyM;
}
