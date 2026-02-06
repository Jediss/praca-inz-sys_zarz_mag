package com.szm.sys_zarz_mag.DTO;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MagazynTowarDTO {

    private Long id;
    private Long idTowar;
    private Long idMagazyn;
    private Long idMiejsceSkladowania;
    private Long idRodzajSkladowania;
    private Long idJednostka;
    private Double iloscTowar;
    private Integer iloscStelazyMagazyn;
}
