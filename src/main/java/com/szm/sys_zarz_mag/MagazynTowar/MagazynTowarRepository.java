package com.szm.sys_zarz_mag.MagazynTowar;

import com.szm.sys_zarz_mag.MagazynTowar.MagazynTowar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MagazynTowarRepository extends JpaRepository<MagazynTowar, Long> {

    //Znajdź towary przypisane do danego magazynu
    List<MagazynTowar> findByMagazynIdMagazyn(Long idMagazyn);


    //Znajdź towary z danego magazynu o określonej nazwie
    List<MagazynTowar> findByMagazynNazwaMagazyn(String nazwaMagazyn);


    //Znajdź magazyny, w których znajduje się dany towar
    List<MagazynTowar> findByTowarIdTowar(Long idTowar);


    //Znajdź towar w określonym magazynie na podstawie jego ID
    MagazynTowar findByTowarIdTowarAndMagazynIdMagazyn(Long idTowar, Long idMagazyn);


    //@Query("SELECT rt FROM MagazynTowar rt WHERE rt.towar.IdTowar = :towarId AND rt.magazyn.IdMagazyn = :magazynId")
    //MagazynTowar findTowarInMagazyn(@Param("towarId") Long towarId, @Param("magazynId") Long magazynId);
}
