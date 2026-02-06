package com.szm.sys_zarz_mag.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Dzial")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Dzial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDzial;

    @Column(nullable = false, unique = true)
    private String dzial;
}
