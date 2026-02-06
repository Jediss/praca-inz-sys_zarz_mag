/**
 * MagazynTowar.java
 *
 * Model class representing the association between goods and their storage in a warehouse.
 * It includes references to the goods, warehouse, storage location, storage type, and unit of measurement,
 * along with the quantity of goods stored and the number of shelves used.
 */

package com.szm.sys_zarz_mag.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "MagazynTowar")
@Getter
@Setter
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
    private Double iloscTowar;

    @Column
    private Integer iloscStelazyMagazyn;
}
