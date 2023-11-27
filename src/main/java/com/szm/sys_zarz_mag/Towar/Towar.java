package com.szm.sys_zarz_mag.Towar;

import com.szm.sys_zarz_mag.Jednostka.Jednostka;
import com.szm.sys_zarz_mag.MiejsceSkladowania.MiejsceSkladowania;
import com.szm.sys_zarz_mag.RodzajSkladowania.RodzajSkladowania;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private double ilosc;

    @Column(nullable = false)
    private String dataPrzyjecia;

    private String dataWysylki;
}
