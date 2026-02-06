package com.szm.sys_zarz_mag.DTO;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MiejsceSkladowaniaDTO {

    private Long id;
    private Integer rzadTowar;
    private Integer stelazTowar;
    private Integer levelTowar;
    private Integer levelIndexTowar;
    private Boolean czyWolneTowar;
}
