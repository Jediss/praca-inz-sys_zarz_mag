package com.szm.sys_zarz_mag.repository;

import com.szm.sys_zarz_mag.model.Jednostka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface JednostkaRepository extends JpaRepository<Jednostka, Long> {

    // Zapytanie zwracające jednostkę na podstawie nazwy
    Jednostka findByJednostka(String nazwaJednostki);


    // Zapytanie zwracające jednostkę na podstawie identyfikatora jednostki
    Jednostka findByIdJednostka(long idJednostka);


    // Zapytanie usuwające jednostkę na podstawie nazwy
    void deleteByJednostka(String nazwaJednostki);


    // Zapytanie zwracające listę jednostek na podstawie fragmentu nazwy
    List<Jednostka> findByJednostkaContaining(String fragmentNazwy);


    // Zapytanie zwracające listę jednostek posortowaną alfabetycznie
    List<Jednostka> findByOrderByJednostkaAsc();


    // Zapytanie zwracające listę jednostek na podstawie unikalności
    List<Jednostka> findByJednostkaIsNotNull();


    // Zapytanie zwracające liczbę jednostek na podstawie nazwy
    int countByJednostka(String nazwaJednostki);
}
