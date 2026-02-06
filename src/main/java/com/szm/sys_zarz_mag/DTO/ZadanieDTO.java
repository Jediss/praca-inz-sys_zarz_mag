package com.szm.sys_zarz_mag.DTO;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ZadanieDTO {

    private Long id;
    private Long idPracownik;
    private String zadanieOpis;
    private String zadanieTytul;
}
