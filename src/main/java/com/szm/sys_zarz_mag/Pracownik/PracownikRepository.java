package com.szm.sys_zarz_mag.Pracownik;

import com.szm.sys_zarz_mag.IdDzialStan.IdDzialStan;
import com.szm.sys_zarz_mag.Magazyn.Magazyn;
import com.szm.sys_zarz_mag.Stawka.Stawka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PracownikRepository extends JpaRepository<Pracownik, Long> {

    //Zapytanie zwracające pracownika na podstawie nazwiska
    Pracownik findByNazwisko(String nazwisko);


    //Zapytanie zwracające pracownika na podstawie identyfikatora pracownika
    Pracownik findByIdPracownik(long idPracownik);


    //Zapytanie zwracające pracownika na podstawie loginu
    Pracownik findByLogin(String login);


    //Zapytanie usuwające pracownika na podstawie identyfikatora pracownika
    void deleteByIdPracownik(long idPracownik);


    //Zapytanie zwracające listę pracowników na podstawie imienia
    List<Pracownik> findByImie(String imie);


    //Zapytanie zwracające listę pracowników na podstawie daty zatrudnienia
    List<Pracownik> findByDataZatrud(String dataZatrud);


    //Zapytanie zwracające listę pracowników na podstawie daty zwolnienia
    List<Pracownik> findByDataZwol(String dataZwol);


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
