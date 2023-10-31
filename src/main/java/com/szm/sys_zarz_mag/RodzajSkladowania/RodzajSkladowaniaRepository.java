package com.szm.sys_zarz_mag.RodzajSkladowania;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RodzajSkladowaniaRepository extends JpaRepository<RodzajSkladowania, Long> {

    //Zapytanie zwracające rodzaj składowania na podstawie nazwy
    RodzajSkladowania findByRodzajSkladowania(String nazwaRodzaju);


    //Zapytanie zwracające rodzaj składowania na podstawie identyfikatora rodzaju składowania
    RodzajSkladowania findByIdRodzajSkladowania(long idRodzaju);


    //Zapytanie usuwające rodzaj składowania na podstawie nazwy
    void deleteByRodzajSkladowania(String nazwaRodzaju);


    //Zapytanie zwracające listę rodzajów składowania na podstawie fragmentu nazwy
    List<RodzajSkladowania> findByRodzajSkladowaniaContaining(String fragmentNazwy);


    //Zapytanie zwracające listę rodzajów składowania na podstawie unikalności
    List<RodzajSkladowania> findByRodzajSkladowaniaIsNotNull();


    //Zapytanie zwracające liczbę rodzajów składowania na podstawie nazwy
    int countByRodzajSkladowania(String nazwaRodzaju);
}