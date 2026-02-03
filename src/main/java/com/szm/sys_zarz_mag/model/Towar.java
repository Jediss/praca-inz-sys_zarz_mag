/**
 * <h2>
 * Model klasy Towar reprezentujący towar w systemie zarządzania magazynem.
 * Zawiera informacje o nazwie towaru oraz datach przyjęcia i wysyłki.
 * </h2>
 *
 * <p>Pytania do przemyślenia:
 * <li>
 *     Czy miejsce składowania, jednostka i rodzaj składowania powinny być
 *     podpiętę pod tabele Towar czy może jednak pod tabelę Magazyn_Towar?
 * </li>
 * </p>
 *
 */

package com.szm.sys_zarz_mag.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "Towar")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Towar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTowar;

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
    private String nazwaTowar;

    @Column(nullable = false)
    private LocalDate dataPrzyjecia;

    private LocalDate dataWysylki;
}
