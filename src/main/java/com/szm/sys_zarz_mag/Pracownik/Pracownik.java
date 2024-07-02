package com.szm.sys_zarz_mag.Pracownik;

import java.util.HashSet;
import java.util.Set;

import com.szm.sys_zarz_mag.IdDzialStan.IdDzialStan;
import com.szm.sys_zarz_mag.Magazyn.Magazyn;
import com.szm.sys_zarz_mag.Roles.Role;
import com.szm.sys_zarz_mag.Stawka.Stawka;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Pracownik", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "username")
})
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pracownik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPracownik;

    @ManyToOne
    @JoinColumn(name = "idMagazyn")
    private Magazyn magazyn;

    @ManyToOne
    @JoinColumn(name = "idDzialStan")
    private IdDzialStan dzialStan;

    @ManyToOne
    @JoinColumn(name = "idStawka")
    private Stawka stawka;

    @Column(nullable = false)
    private String imie;

    @Column(nullable = false)
    private String nazwisko;

    @Column(nullable = false)
    private String dataZatrud;

    private String dataZwol;

    @Column(nullable = false)
    private String telefonP;

    @NotBlank
    @Email
    @Column(unique = true)
    private String email;

    @NotBlank
    @Column(unique = true)
    private String username;

    @NotBlank
    @Column
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(  name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public Pracownik(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

}
