package com.szm.sys_zarz_mag.Towar;

import com.szm.sys_zarz_mag.Jednostka.Jednostka;
import com.szm.sys_zarz_mag.RodzajSkladowania.RodzajSkladowania;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.szm.sys_zarz_mag.MiejsceSkladowania.MiejsceSkladowania;

import java.util.List;
@Repository
public interface TowarRepository extends JpaRepository<Towar, Long> {

    //Zapytanie zwracające towar na podstawie nazwy
    Towar findByNazwaTowar(String nazwaTowar);


    //Zapytanie zwracające towary na podstawie ilości większej niż podana
    List<Towar> findByIloscGreaterThan(double ilosc);


    //Zapytanie zwracające towary na podstawie ilości mniejszej niż podana
    List<Towar> findByIloscLessThan(double ilosc);


    //Zapytanie zwracające towary na podstawie ilości pomiędzy dwiema podanymi wartościami
    List<Towar> findByIloscBetween(double ilosc1, double ilosc2);


    //Zapytanie zwracające towary na podstawie daty wysyłki
    List<Towar> findByDataWysylki(String dataWysylki);


    //Zapytanie zwracające towary na podstawie unikalności
    List<Towar> findByNazwaTowarIsNotNull();


    //Zapytanie zwracające liczbę towarów na podstawie nazwy
    int countByNazwaTowar(String nazwaTowar);


    //Dodanie nazwy towaru
    @Modifying
    @Query("UPDATE Towar t SET t.nazwaTowar = :nazwa WHERE t.IdTowar = :towarId")
    void addNazwaTowaru(@Param("towarId") long towarId, @Param("nazwa") String nazwa);


    //Dodanie ilości towaru
    @Modifying
    @Query("UPDATE Towar t SET t.ilosc = t.ilosc + :ilosc WHERE t.IdTowar = :towarId")
    void addIloscTowaru(@Param("towarId") long towarId, @Param("ilosc") double ilosc);


    //Dodanie daty przyjęcia towaru
    @Modifying
    @Query("UPDATE Towar t SET t.dataPrzyjecia = :data WHERE t.IdTowar = :towarId")
    void addDataPrzyjecia(@Param("towarId") long towarId, @Param("data") String data);


    //Dodanie daty wysyłki towaru
    @Modifying
    @Query("UPDATE Towar t SET t.dataWysylki = :data WHERE t.IdTowar = :towarId")
    void addDataWysylki(@Param("towarId") long towarId, @Param("data") String data);


    //Dodanie pełnego miejsca składowania towaru
    @Modifying
    @Query("UPDATE Towar t SET t.miejsceSkladowania = :miejsceSkladowania WHERE t.IdTowar = :towarId")
    void addMiejsceSkladowania(@Param("towarId") long towarId, @Param("miejsceSkladowania") MiejsceSkladowania miejsceSkladowania);


    //Dodanie rodzaju składowania towaru
    @Modifying
    @Query("UPDATE Towar t SET t.rodzajSkladowania = :rodzajSkladowania WHERE t.IdTowar = :towarId")
    void addRodzajSkladowania(@Param("towarId") long towarId, @Param("rodzajSkladowania") RodzajSkladowania rodzajSkladowania);


    //Dodanie jednostki towaru
    @Modifying
    @Query("UPDATE Towar t SET t.jednostka = :jednostka WHERE t.IdTowar = :towarId")
    void addJednostka(@Param("towarId") long towarId, @Param("jednostka") Jednostka jednostka);


    //Edycja Miejsca Składowania towaru
    @Modifying
    @Query("UPDATE Towar t SET t.miejsceSkladowania = :miejsceSkladowania WHERE t.IdTowar = :towarId")
    void editMiejsceSkladowania(@Param("towarId") long towarId, @Param("miejsceSkladowania") MiejsceSkladowania miejsceSkladowania);


    //Edycja Jednostki towaru
    @Modifying
    @Query("UPDATE Towar t SET t.jednostka = :jednostka WHERE t.IdTowar = :towarId")
    void editJednostka(@Param("towarId") long towarId, @Param("jednostka") Jednostka jednostka);


    //Edycja Rodzaju Składowania towaru
    @Modifying
    @Query("UPDATE Towar t SET t.rodzajSkladowania = :rodzajSkladowania WHERE t.IdTowar = :towarId")
    void editRodzajSkladowania(@Param("towarId") long towarId, @Param("rodzajSkladowania") RodzajSkladowania rodzajSkladowania);


    //Edycja ilości towaru
    @Modifying
    @Query("UPDATE Towar t SET t.ilosc = :ilosc WHERE t.IdTowar = :towarId")
    void editIloscTowaru(@Param("towarId") long towarId, @Param("ilosc") double ilosc);


    //Edycja nazwy towaru
    @Modifying
    @Query("UPDATE Towar t SET t.nazwaTowar = :nazwa WHERE t.IdTowar = :towarId")
    void editNazwaTowaru(@Param("towarId") long towarId, @Param("nazwa") String nazwa);


    //Edycja daty przyjęcia towaru
    @Modifying
    @Query("UPDATE Towar t SET t.dataPrzyjecia = :data WHERE t.IdTowar = :towarId")
    void editDataPrzyjecia(@Param("towarId") long towarId, @Param("data") String data);


    //Edycja daty wysyłki towaru
    @Modifying
    @Query("UPDATE Towar t SET t.dataWysylki = :data WHERE t.IdTowar = :towarId")
    void editDataWysylki(@Param("towarId") long towarId, @Param("data") String data);


    //Zapytanie usuwające dany towar
    @Modifying
    @Query("DELETE FROM Towar t WHERE t.IdTowar = :towarId")
    void deleteTowarById(@Param("towarId") long towarId);
}
