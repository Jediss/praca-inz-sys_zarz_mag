package com.szm.sys_zarz_mag.MagazynTowar;

import com.szm.sys_zarz_mag.Magazyn.Magazyn;
import com.szm.sys_zarz_mag.Towar.Towar;
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
public class MagazynTowar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdMagazynTowar;

    @ManyToOne
    @JoinColumn(name = "IdTowar")
    private Towar towar;

    @ManyToOne
    @JoinColumn(name = "IdMagazyn")
    private Magazyn magazyn;
}
