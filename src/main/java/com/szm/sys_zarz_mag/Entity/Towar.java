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
 *     SOLVED: PODPIĘTO DO TABELI MAGAZYN_TOWAR
 * </li>
 * </p>
 *
 */

package com.szm.sys_zarz_mag.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Towar")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Towar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTowar;

    @Column(nullable = false)
    private String nazwaTowar;

    @Column(nullable = false)
    private LocalDate dataPrzyjecia;

    private LocalDate dataWysylki;
}
