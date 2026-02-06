package com.szm.sys_zarz_mag.DTO;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PracownikDTO {

    private Long id;
    private Long idMagazyn;
    private Long idDzialStan;
    private Long idStawka;
    private String imie;
    private String nazwisko;
    private LocalDate dataZatrud;
    private String telefonP;
    private String email;

}
