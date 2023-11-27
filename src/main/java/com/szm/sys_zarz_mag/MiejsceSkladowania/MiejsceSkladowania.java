package com.szm.sys_zarz_mag.MiejsceSkladowania;

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

    private boolean hala;

    private boolean plac;

    //@Column(nullable = false)
    private int x;

    //@Column(nullable = false)
    private int y;

    //@Column(nullable = false)
    private int level;
}