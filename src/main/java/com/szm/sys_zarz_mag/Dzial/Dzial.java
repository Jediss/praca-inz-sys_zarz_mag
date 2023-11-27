package com.szm.sys_zarz_mag.Dzial;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Dzial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Dzial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDzial;

    @Column(nullable = false, unique = true)
    private String dzial;
}
