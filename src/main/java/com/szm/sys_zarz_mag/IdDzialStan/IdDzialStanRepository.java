package com.szm.sys_zarz_mag.IdDzialStan;

import com.szm.sys_zarz_mag.Dzial.Dzial;
import com.szm.sys_zarz_mag.Stanowisko.Stanowisko;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface IdDzialStanRepository extends JpaRepository<IdDzialStan, Long> {

    // Znajdź unikalne połączenia IdDzial - IdStanowisko
    List<IdDzialStan> findAllDistinctByIdDzialAndIdStanowisko();


    // Znajdź unikalne IdStanowisko powiązane z określonym IdDzial
    List<IdDzialStan> findDistinctIdStanowiskoByIdDzial(Long IdDzial);


    // Znajdź unikalne IdDzial powiązane z określonym IdStanowisko
    List<IdDzialStan> findDistinctIdDzialByIdStanowisko(Long IdStanowisko);


    // Metoda zwracająca listę obiektów IdDzialStan na podstawie stanowiska
    List<IdDzialStan> findByStanowisko(Stanowisko stanowisko);


    // Metoda zwracająca listę obiektów IdDzialStan na podstawie działu
    List<IdDzialStan> findByDzial(Dzial dzial);


    // Metoda zwracająca listę obiektów IdDzialStan na podstawie identyfikatora stanowiska
    List<IdDzialStan> findByStanowisko_IdStanowisko(Long idStanowisko);


    // Metoda zwracająca listę obiektów IdDzialStan na podstawie identyfikatora działu
    List<IdDzialStan> findByDzial_IdDzial(Long idDzial);


    // Metoda usuwająca obiekty IdDzialStan na podstawie stanowiska
    void deleteByStanowisko(Stanowisko stanowisko);


    // Metoda usuwająca obiekty IdDzialStan na podstawie działu
    void deleteByDzial(Dzial dzial);


    // Metoda zwracająca liczbę obiektów IdDzialStan na podstawie identyfikatora stanowiska
    int countByStanowisko_IdStanowisko(Long idStanowisko);


    // Metoda zwracająca liczbę obiektów IdDzialStan na podstawie identyfikatora działu
    int countByDzial_IdDzial(Long idDzial);
}
