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
 *             Powinna być liczba ogólna stelaży w magazynie, aby
 *             wiedzieć ile jest dostępnych miejsc składowania, ale nie
 *             powinna być zapisana w tabeli MiejsceSkladowania tylko w
 *             tabeli Magazyn.
 *             </p>
 *          </li>
 *          <li>Ale jeżeli ogólna liczba stelaży będzie zapisana w tabeli
 *          Magazyn to jak będzie powiązana z tabelą MiejsceSkladowania?
 *          <p>
 *              Można dodać atrybut idMagazyn w tabeli MiejsceSkladowania jako
 *              klucz obcy powiązany z tabelą Magazyn. Tylko czy na pewno ten
 *              atrybut jest potrzebny? Mozńa napisać funkję serwisową, która
 *              sprawdzi ogólną ilość stelaży w tabeli Magazyn i
 *          </p>
 *         </li>
 *     </ul>
 * </p>*/

package com.szm.sys_zarz_mag.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MiejsceSkladowania")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MiejsceSkladowania {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMiejsceSkladowania;

    @Column
    private int rzadTowar;

    @Column
    private int stelazTowar;

    @Column
    private int levelTowar;

    @Column
    private int levelIndexTowar;

    @Column(nullable = false)
    private boolean czyWolneTowar;
}