package com.szm.sys_zarz_mag.Stawka;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StawkaRepository extends JpaRepository<Stawka, Long> {

    //Zapytanie zwracające stawkę na podstawie wartości
    Stawka findByWartosc(double wartosc);


    //Zapytanie zwracające stawkę na podstawie identyfikatora stawki
    Stawka findByIdStawka(long idStawka);


    //Zapytanie usuwające stawkę na podstawie wartości
    void deleteByWartosc(double wartosc);


    //Zapytanie zwracające listę stawek na podstawie wartości stawki większej niż podana
    List<Stawka> findByWartoscGreaterThan(double wartosc);


    //Zapytanie zwracające listę stawek na podstawie wartości stawki mniejszej niż podana
    List<Stawka> findByWartoscLessThan(double wartosc);


    // Zapytanie zwracające listę stawek na podstawie wartości stawki pomiędzy dwiema podanymi wartościami
    List<Stawka> findByWartoscBetween(double wartosc1, double wartosc2);


    // Zapytanie zwracające listę stawek na podstawie unikalności
    List<Stawka> findByWartoscIsNotNull();


    // Zapytanie zwracające liczbę stawek na podstawie wartości
    int countByWartosc(double wartosc);
}
