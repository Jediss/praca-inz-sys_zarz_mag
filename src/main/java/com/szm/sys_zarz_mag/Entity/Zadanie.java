package com.szm.sys_zarz_mag.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Zadanie")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Zadanie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idZadanie;

    @ManyToOne
    @JoinColumn(name = "idPracownik")
    private Pracownik pracownik;

    @Column(name = "opis", length = 1000, nullable = true)
    private String zadanieOpis;

    @Column(name = "zadanieTytul", length = 100, nullable = false, unique = true)
    private String zadanieTytul;

}
