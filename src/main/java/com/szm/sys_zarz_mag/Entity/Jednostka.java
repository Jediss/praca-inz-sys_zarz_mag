package com.szm.sys_zarz_mag.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Jednostka")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Jednostka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJednostka;

    @Column(unique = true)
    private String jednostka;
}
