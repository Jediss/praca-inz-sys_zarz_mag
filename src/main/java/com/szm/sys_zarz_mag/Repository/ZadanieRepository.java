package com.szm.sys_zarz_mag.Repository;

import com.szm.sys_zarz_mag.Entity.Pracownik;
import com.szm.sys_zarz_mag.Entity.Zadanie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZadanieRepository extends JpaRepository<Zadanie, Long> {

    // Metoda do usuwania Zadania na podstawie ID
    void deleteByIdZadanie(long idZadanie);

    //Dodatkowe zapytania:

    // Znajdź Zadanie po opisie
    List<Zadanie> findByZadanieOpis(String opis);

    // Znajdź Zadania dla określonego Pracownika
    List<Zadanie> findByPracownik(Pracownik pracownik);

    // Można dodać inne niestandardowe zapytania w oparciu o potrzeby aplikacji
    // np. pobierz wszystkie Zadania, których opis zaczyna się od podanego fragmentu
    List<Zadanie> findByZadanieOpisStartingWith(String fragmentOpisu);

    //Pobierz wszystkie Zadania posortowane po ID Pracownika
    List<Zadanie> findByOrderByPracownikIdPracownikAsc();

    //Znajdź Zadanie na podstawie ID Pracownika
    List<Zadanie> findByPracownik_IdPracownik(Long idPracownik);

    Zadanie findByZadanieTytul(String tytul);
}
