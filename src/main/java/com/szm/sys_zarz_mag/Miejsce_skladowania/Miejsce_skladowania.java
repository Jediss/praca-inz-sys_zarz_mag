package com.szm.sys_zarz_mag.Miejsce_skladowania;

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
public class Miejsce_skladowania {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_miejsce_skladowania;

    @Column
    private boolean hala;

    @Column
    private boolean plac;

    @Column(nullable = false)
    private int x;

    @Column(nullable = false)
    private int y;

    @Column(nullable = false)
    private int level;

}
