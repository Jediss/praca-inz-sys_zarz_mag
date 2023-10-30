package com.szm.sys_zarz_mag.Stawka;

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
public class Stawka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_stawka;

    @Column(nullable = false)
    private float wartosc;
}
