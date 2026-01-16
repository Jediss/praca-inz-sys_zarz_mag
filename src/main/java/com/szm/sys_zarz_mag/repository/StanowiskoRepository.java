package com.szm.sys_zarz_mag.repository;

import com.szm.sys_zarz_mag.model.Stanowisko;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StanowiskoRepository extends JpaRepository<Stanowisko, Long> {

    //Metoda zwracająca stanowisko na podstawie nazwy
    Stanowisko findByStanowisko(String nazwaStanowiska);


    //Metoda zwracająca stanowisko na podstawie identyfikatora stanowiska
    Stanowisko findByIdStanowisko(long idStanowisko);


   //Metoda usuwająca stanowisko na podstawie nazwy
    void deleteByStanowisko(String nazwaStanowiska);


    //Metoda zwracająca listę stanowisk na podstawie fragmentu nazwy
    List<Stanowisko> findByStanowiskoContaining(String fragmentNazwy);


    //Metoda zwracająca listę stanowisk posortowaną alfabetycznie
    List<Stanowisko> findByOrderByStanowiskoAsc();


    //Metoda zwracająca listę stanowisk na podstawie unikalności
    List<Stanowisko> findByStanowiskoIsNotNull();


    //Metoda zwracająca liczbę stanowisk na podstawie nazwy
    int countByStanowisko(String nazwaStanowiska);
}
