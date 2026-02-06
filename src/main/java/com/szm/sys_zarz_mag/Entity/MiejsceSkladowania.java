/** <h2>Domyślny proces składowania towarów</h2>
 * <ol>
* <li>stelazTowar - duży stelaż z rzędami, może być wiele stelaży</li>
* <li>rzadTowar - rząd/półka na stelaży, może być wiele rzędów/półek</li>
* <li>levelTowar - miejsce na rzędzie/półce, może być wiele leveli</li>
* <li>levelIndexTowar - miejsce zawarte w levelTowar, najmniejsza jednostka
 * miary miejsca, może być wiele indeksów</li>
 * </ol>
 * <p>
 *     czyWolneTowar - flaga określająca czy dane miejsce jest wolne (true)
 *     czy zajęte (false)
 * </p>
 * <p>
 *     Pytania do przemyślenia:
 *     <ul>
 *         <li>Czy powinno się dodać liczbę ogólną wszystkich stelaży czy
 *         na podstawie konkretnej liczby z atrybutu stelazTowar będzie
 *         wnioskowanie ilości wszyskich stelaży?
 *         <p>
 *             SOLVED
 *             Powinna być liczba ogólna stelaży w magazynie, aby
 *             wiedzieć ile jest dostępnych miejsc składowania, ale nie
 *             powinna być zapisana w tabeli MiejsceSkladowania tylko w
 *             tabeli Magazyn.
 *             </p>
 *          </li>
 *     </ul>
 * </p>*/

package com.szm.sys_zarz_mag.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "MiejsceSkladowania")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MiejsceSkladowania {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMiejsceSkladowania;

    @Column
    private Integer rzadTowar;

    @Column
    private Integer stelazTowar;

    @Column
    private Integer levelTowar;

    @Column
    private Integer levelIndexTowar;

    @Column(nullable = false)
    private Boolean czyWolneTowar;
}