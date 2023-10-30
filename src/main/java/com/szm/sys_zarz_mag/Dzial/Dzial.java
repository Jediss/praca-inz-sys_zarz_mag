package com.szm.sys_zarz_mag.Dzial;

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
public class Dzial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_dzial;

    @Column(nullable = false)
    private String dzial;
}
