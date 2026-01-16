package com.szm.sys_zarz_mag.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Jednostka")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Jednostka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idJednostka;

    @Column(unique = true)
    private String jednostka;
}
