package com.szm.sys_zarz_mag.MagazynTowar;

import com.szm.sys_zarz_mag.Magazyn.Magazyn;
import com.szm.sys_zarz_mag.Towar.Towar;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MagazynTowar")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MagazynTowar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMagazynTowar;

    @ManyToOne
    @JoinColumn(name = "idTowar")
    private Towar towar;

    @ManyToOne
    @JoinColumn(name = "idMagazyn")
    private Magazyn magazyn;
}
