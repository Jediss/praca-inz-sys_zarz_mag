package com.szm.sys_zarz_mag.Zadanie;

import com.szm.sys_zarz_mag.Pracownik.Pracownik;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Zadanie")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Zadanie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idZadanie;

    @ManyToOne
    @JoinColumn(name = "idPracownik")
    private Pracownik pracownik;

    @Column(name = "opis", length = 1000, nullable = false)
    private String zadanieOpis;

}
