package com.szm.sys_zarz_mag.repository;

import com.szm.sys_zarz_mag.model.Jednostka;
import com.szm.sys_zarz_mag.model.RodzajSkladowania;
import com.szm.sys_zarz_mag.model.Towar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.szm.sys_zarz_mag.model.MiejsceSkladowania;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface TowarRepository extends JpaRepository<Towar, Long> {

    //Zapytanie zwracające towar na podstawie nazwy
    Towar findByNazwaTowar(String nazwaTowar);


    //Zapytanie zwracające towary na podstawie daty wysyłki
    List<Towar> findByDataWysylki(LocalDate dataWysylki);


    //Zapytanie zwracające towary na podstawie unikalności
    List<Towar> findByNazwaTowarIsNotNull();


    //Zapytanie zwracające liczbę towarów na podstawie nazwy
    int countByNazwaTowar(String nazwaTowar);


    //Dodanie nazwy towaru
    @Modifying
    @Query("UPDATE Towar t SET t.nazwaTowar = :nazwa WHERE t.idTowar = :towarId")
    void addNazwaTowaru(@Param("towarId") long towarId, @Param("nazwa") String nazwa);


    //Dodanie daty przyjęcia towaru
    @Modifying
    @Query("UPDATE Towar t SET t.dataPrzyjecia = :data WHERE t.idTowar = :towarId")
    void addDataPrzyjecia(@Param("towarId") long towarId, @Param("data") LocalDate data);


    //Dodanie daty wysyłki towaru
    @Modifying
    @Query("UPDATE Towar t SET t.dataWysylki = :data WHERE t.idTowar = :towarId")
    void addDataWysylki(@Param("towarId") long towarId, @Param("data") LocalDate data);


    //Dodanie pełnego miejsca składowania towaru
    @Modifying
    @Query("UPDATE Towar t SET t.miejsceSkladowania = :miejsceSkladowania WHERE t.idTowar = :towarId")
    void addMiejsceSkladowania(@Param("towarId") long towarId, @Param("miejsceSkladowania") MiejsceSkladowania miejsceSkladowania);


    //Dodanie rodzaju składowania towaru
    @Modifying
    @Query("UPDATE Towar t SET t.rodzajSkladowania = :rodzajSkladowania WHERE t.idTowar = :towarId")
    void addRodzajSkladowania(@Param("towarId") long towarId, @Param("rodzajSkladowania") RodzajSkladowania rodzajSkladowania);


    //Dodanie jednostki towaru
    @Modifying
    @Query("UPDATE Towar t SET t.jednostka = :jednostka WHERE t.idTowar = :towarId")
    void addJednostka(@Param("towarId") long towarId, @Param("jednostka") Jednostka jednostka);


    //Edycja Miejsca Składowania towaru
    @Modifying
    @Query("UPDATE Towar t SET t.miejsceSkladowania = :miejsceSkladowania WHERE t.idTowar = :towarId")
    void editMiejsceSkladowania(@Param("towarId") long towarId, @Param("miejsceSkladowania") MiejsceSkladowania miejsceSkladowania);


    //Edycja Jednostki towaru
    @Modifying
    @Query("UPDATE Towar t SET t.jednostka = :jednostka WHERE t.idTowar = :towarId")
    void editJednostka(@Param("towarId") long towarId, @Param("jednostka") Jednostka jednostka);


    //Edycja Rodzaju Składowania towaru
    @Modifying
    @Query("UPDATE Towar t SET t.rodzajSkladowania = :rodzajSkladowania WHERE t.idTowar = :towarId")
    void editRodzajSkladowania(@Param("towarId") long towarId, @Param("rodzajSkladowania") RodzajSkladowania rodzajSkladowania);


    //Edycja nazwy towaru
    @Modifying
    @Query("UPDATE Towar t SET t.nazwaTowar = :nazwa WHERE t.idTowar = :towarId")
    void editNazwaTowaru(@Param("towarId") long towarId, @Param("nazwa") String nazwa);


    //Edycja daty przyjęcia towaru
    @Modifying
    @Query("UPDATE Towar t SET t.dataPrzyjecia = :data WHERE t.idTowar = :towarId")
    void editDataPrzyjecia(@Param("towarId") long towarId, @Param("data") LocalDate data);


    //Edycja daty wysyłki towaru
    @Modifying
    @Query("UPDATE Towar t SET t.dataWysylki = :data WHERE t.idTowar = :towarId")
    void editDataWysylki(@Param("towarId") long towarId, @Param("data") LocalDate data);


    //Zapytanie usuwające dany towar
    @Modifying
    @Query("DELETE FROM Towar t WHERE t.idTowar = :towarId")
    void deleteTowarById(@Param("towarId") long towarId);
}
