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

    @Column(nullable = false)
    private double iloscTowar;

    @Column
    private Integer iloscStelazyM;
}
