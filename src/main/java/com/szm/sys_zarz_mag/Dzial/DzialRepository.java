package com.szm.sys_zarz_mag.Dzial;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DzialRepository extends JpaRepository<Dzial, Long> {

    //Zapytanie zwracające dział na podstawie nazwy
    Dzial findByDzial(String dzialName);


    //Zapytanie zwracające dział na podstawie identyfikatora działu
    Dzial findByIdDzial(long idDzial);


    //Zapytanie zwracające dział na podstawie identyfikatora działu oraz nazwy działu
    Dzial findByIdDzialAndDzial(long idDzial, String dzialName);


    //Zapytanie usuwające dział na podstawie nazwy
    void deleteByDzial(String dzial);


    //Zapytanie zwracające listę działów na podstawie fragmentu nazwy
    List<Dzial> findByDzialContaining(String partialDzialName);


    //Zapytanie zwracające listę działów na podstawie podanej nazwy i sortujące wyniki
    List<Dzial> findByDzialOrderByDzialAsc(String dzialName);


    //Zapytanie zwracające listę działów na podstawie unikalności
    List<Dzial> findByDzialIsNotNull();


    //Zapytanie zwracające liczbę działów na podstawie nazwy
    int countByDzial(String dzialName);


}
