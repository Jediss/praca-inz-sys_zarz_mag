package com.szm.sys_zarz_mag.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Stawka")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stawka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStawka;

    @Column(nullable = false)
    private Double wartosc;
}
