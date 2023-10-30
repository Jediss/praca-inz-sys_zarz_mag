package com.szm.sys_zarz_mag.Pracownik;

import com.szm.sys_zarz_mag.ID_dzial_stan.ID_dzial_stan;
import com.szm.sys_zarz_mag.Magazyn.Magazyn;
import com.szm.sys_zarz_mag.Stawka.Stawka;
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
public class Pracownik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_pracownik;

    @ManyToOne
    @JoinColumn(name = "ID_magazyn")
    private Magazyn magazyn;

    @ManyToOne
    @JoinColumn(name = "ID_dzial_stan")
    private ID_dzial_stan dzialStan;

    @ManyToOne
    @JoinColumn(name = "ID_stawka")
    private Stawka stawka;

    @Column(nullable = false)
    private String imie;

    @Column(nullable = false)
    private String nazwisko;

    @Column(nullable = false)
    private String data_zatrud;

    @Column
    private String data_zwol;

    @Column(nullable = false)
    private String telefon_p;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

}
