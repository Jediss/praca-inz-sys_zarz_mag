package com.szm.sys_zarz_mag.Pracownik;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pracownik {

    @Id
    private long ID_pracownik;
    private String imie;
    private String nazwisko;
    private String data_zatrud;
    private String data_zwol;
    private String telefon_p;
    private String login;
    private String password;

}
