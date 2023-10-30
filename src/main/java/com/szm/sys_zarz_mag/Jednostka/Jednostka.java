package com.szm.sys_zarz_mag.Jednostka;

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
public class Jednostka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_jednostka;

    @Column
    private String jednostka;
}
