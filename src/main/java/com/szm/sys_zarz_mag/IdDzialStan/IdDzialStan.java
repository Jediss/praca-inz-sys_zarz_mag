package com.szm.sys_zarz_mag.IdDzialStan;

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
public class IdDzialStan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IsDzialStan;

    @ManyToOne
    @JoinColumn(name = "IdStanowisko")
    private Stanowisko stanowisko;

    @ManyToOne
    @JoinColumn(name = "IdDzial")
    private Dzial dzial;
}
