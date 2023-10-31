package com.szm.sys_zarz_mag.RodzajSkladowania;

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
public class RodzajSkladowania {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdRodzajSkladowania;

    @Column(nullable = false, unique = true)
    private String rodzajSkladowania;
}
