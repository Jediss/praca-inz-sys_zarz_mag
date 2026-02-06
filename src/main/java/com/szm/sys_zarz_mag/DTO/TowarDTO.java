package com.szm.sys_zarz_mag.DTO;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TowarDTO {

    private Long id;
    private String name;
    private LocalDateTime dataPzyjecia;
    private LocalDate dataWysylki;
}
