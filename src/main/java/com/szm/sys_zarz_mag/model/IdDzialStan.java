package com.szm.sys_zarz_mag.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
