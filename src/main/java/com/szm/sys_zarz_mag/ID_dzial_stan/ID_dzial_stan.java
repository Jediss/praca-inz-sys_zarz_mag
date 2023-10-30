package com.szm.sys_zarz_mag.ID_dzial_stan;

import com.szm.sys_zarz_mag.Dzial.Dzial;
import com.szm.sys_zarz_mag.Stanowisko.Stanowisko;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ID_dzial_stan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_dzial_stan;

    @ManyToOne
    @JoinColumn(name = "ID_stanowisko")
    private Stanowisko stanowisko;

    @ManyToOne
    @JoinColumn(name = "ID_dzial")
    private Dzial dzial;
}
