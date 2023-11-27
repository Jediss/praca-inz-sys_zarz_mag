package com.szm.sys_zarz_mag.Stanowisko;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Stanowisko")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stanowisko {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idStanowisko;

    @Column(nullable = false, unique = true)
    private String stanowisko;
}
