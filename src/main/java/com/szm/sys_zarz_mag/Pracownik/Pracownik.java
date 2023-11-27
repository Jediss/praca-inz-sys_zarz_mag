package com.szm.sys_zarz_mag.Pracownik;

import com.szm.sys_zarz_mag.IdDzialStan.IdDzialStan;
import com.szm.sys_zarz_mag.Magazyn.Magazyn;
import com.szm.sys_zarz_mag.Stawka.Stawka;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Pracownik")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pracownik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPracownik;

    @ManyToOne
    @JoinColumn(name = "idMagazyn")
    private Magazyn magazyn;

    @ManyToOne
    @JoinColumn(name = "idDzialStan")
    private IdDzialStan dzialStan;

    @ManyToOne
    @JoinColumn(name = "idStawka")
    private Stawka stawka;

    @Column(nullable = false)
    private String imie;

    @Column(nullable = false)
    private String nazwisko;

    @Column(nullable = false)
    private String dataZatrud;

    private String dataZwol;

    @Column(nullable = false)
    private String telefonP;

    @Column(nullable = false, unique = true)
    private String login;

    @Column(nullable = false)
    private String password;

}
