package com.szm.sys_zarz_mag.Entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "IdDzialStan")
public class IdDzialStan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDzialStan;

    @ManyToOne
    @JoinColumn(name = "idStanowisko")
    private Stanowisko stanowisko;

    @ManyToOne
    @JoinColumn(name = "idDzial")
    private Dzial dzial;

    public IdDzialStan(Long idDzialStan) {
    }
}
