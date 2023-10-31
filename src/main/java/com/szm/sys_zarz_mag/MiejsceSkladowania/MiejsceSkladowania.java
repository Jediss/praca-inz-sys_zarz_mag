package com.szm.sys_zarz_mag.MiejsceSkladowania;

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
public class MiejsceSkladowania {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdMiejsceSkladowania;

    private boolean hala;

    private boolean plac;

    //@Column(nullable = false)
    private int x;

    //@Column(nullable = false)
    private int y;

    //@Column(nullable = false)
    private int level;
}