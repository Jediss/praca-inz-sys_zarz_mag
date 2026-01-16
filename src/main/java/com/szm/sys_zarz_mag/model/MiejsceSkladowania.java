package com.szm.sys_zarz_mag.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MiejsceSkladowania")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MiejsceSkladowania {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMiejsceSkladowania;

    @Column
    private int rzadTowar;

    @Column
    private int stelazTowar;

    @Column
    private int levelTowar;

    @Column
    private int levelIndexTowar;

    @Column(nullable = false)
    private boolean czyWolneTowar;
}