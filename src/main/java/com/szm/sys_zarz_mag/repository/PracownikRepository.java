package com.szm.sys_zarz_mag.repository;

import com.szm.sys_zarz_mag.model.IdDzialStan;
import com.szm.sys_zarz_mag.model.Magazyn;
import com.szm.sys_zarz_mag.model.Stawka;
import com.szm.sys_zarz_mag.model.Pracownik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface PracownikRepository extends JpaRepository<Pracownik, Long> {

    Optional<Pracownik> findByUsername(String username);

    Pracownik findByEmail(String email);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    //Zapytanie zwracające pracownika na podstawie nazwiska
    Pracownik findByNazwisko(String nazwisko);


    //Zapytanie zwracające pracownika na podstawie identyfikatora pracownika
    Pracownik findByIdPracownik(long idPracownik);


    //Zapytanie zwracające listę pracowników na podstawie imienia
    List<Pracownik> findByImie(String imie);


    //Zapytanie zwracające listę pracowników na podstawie daty zatrudnienia
    List<Pracownik> findByDataZatrud(LocalDate dataZatrud);


    //Zapytanie zwracające listę pracowników na podstawie numeru telefonu
    List<Pracownik> findByTelefonP(String telefonP);


    //Zapytanie zwracające listę pracowników na podstawie magazynu
    List<Pracownik> findByMagazyn(Magazyn magazyn);


    //Zapytanie zwracające listę pracowników na podstawie działu i stanowiska
    List<Pracownik> findByDzialStan_IdDzialStan(IdDzialStan dzialStan);


    //Zapytanie zwracające listę pracowników na podstawie stawki
    List<Pracownik> findByStawka(Stawka stawka);


    //Zapytanie zwracające listę pracowników na podstawie imienia i nazwiska, posortowaną po nazwisku
    List<Pracownik> findByImieAndNazwiskoOrderByNazwiskoAsc(String imie, String nazwisko);


    //Zapytanie zwracające liczbę pracowników na podstawie imienia
    int countByImie(String imie);
}
