package com.szm.sys_zarz_mag.Magazyn_Towar;

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
public class Magazyn_Towar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_magazyn_towar;

    @ManyToOne
    @JoinColumn(name = "ID_towar")
    private Towar towar;

    @ManyToOne
    @JoinColumn(name = "ID_magazyn")
    private Magazyn magazyn;
}
