package com.szm.sys_zarz_mag.Stawka;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Stawka")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stawka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idStawka;

    @Column(nullable = false)
    private double wartosc;
}
