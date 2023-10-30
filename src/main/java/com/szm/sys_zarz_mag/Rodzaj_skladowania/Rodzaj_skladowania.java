package com.szm.sys_zarz_mag.Rodzaj_skladowania;

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
public class Rodzaj_skladowania {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_rodzaj_skladowania;

    @Column(nullable = false)
    private String rodzaj_skladowania;
}
