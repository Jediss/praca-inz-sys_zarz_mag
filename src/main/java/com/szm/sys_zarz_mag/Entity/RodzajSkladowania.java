package com.szm.sys_zarz_mag.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "RodzajSkladowania")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RodzajSkladowania {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRodzajSkladowania;

    @Column(nullable = false, unique = true)
    private String rodzajSkladowania;
}
