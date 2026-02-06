package com.szm.sys_zarz_mag.Repository;

import com.szm.sys_zarz_mag.Entity.Magazyn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MagazynRepository extends JpaRepository<Magazyn, Long> {

    //Zapytanie zwracające magazyn na podstawie nazwy
    Magazyn findByNazwaMagazyn(String nazwaMagazyn);


    //Zapytanie zwracające listę magazynów na podstawie adresu miasta
    List<Magazyn> findByAdresMiastoM(String adresMiasto);


    //Zapytanie zwracające listę magazynów na podstawie ulicy
    List<Magazyn> findByAdresUlicaM(String adresUlica);


    // Zapytanie zwracające listę magazynów na podstawie miasta i ulicy
    List<Magazyn> findByAdresMiastoMAndAdresUlicaM(String adresMiasto, String adresUlica);



    //Zapytanie zwracające listę magazynów na podstawie kodu adresu
    List<Magazyn> findByAdresKodM(String kodPocztowy);


    // Zapytanie zwracające listę magazynów na podstawie miasta, posortowaną po nazwie magazynu
    List<Magazyn> findByAdresMiastoMOrderByNazwaMagazynAsc(String adresMiasto);


    // Zapytanie zwracające liczbę magazynów na podstawie nazwy
    int countByNazwaMagazyn(String nazwaMagazyn);


    //Zapytanie usuwające magazyn na podstawie nazwy
    void deleteByNazwaMagazyn(String nazwaMagazyn);

    //Optional
    //List<Magazyn> findByNazwaMagazynStartsWith(String prefix);
    //List<Magazyn> findByNazwaMagazynContaining(String fragmentNazwy);

    @Query("SELECT m FROM Magazyn m WHERE m.adresMiastoM = :miasto AND m.adresUlicaM = :ulica")
    List<Magazyn> findMagazynByMiastoIUlica(@Param("miasto") String miasto, @Param("ulica") String ulica);
}
