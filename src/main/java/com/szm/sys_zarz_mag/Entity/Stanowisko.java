package com.szm.sys_zarz_mag.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Stanowisko")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stanowisko {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStanowisko;

    @Column(nullable = false, unique = true)
    private String stanowisko;
}
