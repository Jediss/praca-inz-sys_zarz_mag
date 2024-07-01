package com.szm.sys_zarz_mag.MiejsceSkladowania;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MiejsceSkladowaniaRepository extends JpaRepository<MiejsceSkladowania, Long> {



//    //Zapytanie dodające wartość do współrzędnej 'x'
//    @Modifying
//    @Query("UPDATE MiejsceSkladowania m SET m.x = m.x + :value")
//    void addValueToX(@Param("value") int value);
//    //Zapytanie aktualizacji dla wartości współrzędnej 'x'
//    @Modifying
//    @Query("UPDATE MiejsceSkladowania m SET m.x = :newValue")
//    void updateValueOfX(@Param("newValue") int newValue);
//    //Zapytanie usuwające wartość współrzędnej 'x'
//    @Modifying
//    @Query("UPDATE MiejsceSkladowania m SET m.x = NULL")
//    void removeValueFromX();


//    //Zapytanie dodające wartość do współrzędnej 'y'
//    @Modifying
//    @Query("UPDATE MiejsceSkladowania m SET m.y = m.y + :value")
//    void addValueToY(@Param("value") int value);
//    //Zapytanie aktualizacji dla wartości współrzędnej 'y'
//    @Modifying
//    @Query("UPDATE MiejsceSkladowania m SET m.y = :newValue")
//    void updateValueOfY(@Param("newValue") int newValue);
//    //Zapytanie usuwające wartość współrzędnej 'y'
//    @Modifying
//    @Query("UPDATE MiejsceSkladowania m SET m.y = NULL")
//    void removeValueFromY();



//    //Zapytanie usuwające miejsce składowania na podstawie wartości współrzędnych 'x', 'y' oraz 'level'
//    @Modifying
//    @Query("DELETE FROM MiejsceSkladowania m WHERE m.x = :xCoordinate AND m.y = :yCoordinate AND m.level = :level")
//    void deleteByXAndYAndLevel(@Param("xCoordinate") int xCoordinate, @Param("yCoordinate") int yCoordinate, @Param("level") int level);


}
