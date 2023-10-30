package com.szm.sys_zarz_mag.Towar;

import com.szm.sys_zarz_mag.Jednostka.Jednostka;
import com.szm.sys_zarz_mag.Miejsce_skladowania.Miejsce_skladowania;
import com.szm.sys_zarz_mag.Rodzaj_skladowania.Rodzaj_skladowania;
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
public class Towar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_towar;

    @ManyToOne
    @JoinColumn(name = "ID_miejsce_skladowania")
    private Miejsce_skladowania miejsceSkladowania;

    @ManyToOne
    @JoinColumn(name = "ID_rodzaj_skladowania")
    private Rodzaj_skladowania rodzajSkladowania;

    @ManyToOne
    @JoinColumn(name = "ID_jednostka")
    private Jednostka jednostka;

    @Column(nullable = false)
    private String nazwa_towar;

    @Column(nullable = false)
    private double ilosc;

    @Column(nullable = false)
    private String data_przyjecia;

    @Column
    private String data_wysylki;
}
