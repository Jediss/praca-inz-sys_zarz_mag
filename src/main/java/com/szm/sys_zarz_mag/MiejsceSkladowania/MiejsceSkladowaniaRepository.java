package com.szm.sys_zarz_mag.MiejsceSkladowania;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MiejsceSkladowaniaRepository extends JpaRepository<MiejsceSkladowania, Long> {

    //Zapytanie zwracające miejsce składowania na podstawie wartości logicznej 'hala'
    List<MiejsceSkladowania> findByHala(boolean isHala);


    // Zapytanie zwracające miejsce składowania na podstawie wartości logicznej 'plac'
    List<MiejsceSkladowania> findByPlac(boolean isPlac);


    // Zapytanie zwracające miejsce składowania na podstawie wartości 'level'
    List<MiejsceSkladowania> findByLevel(int level);


    // Zapytanie usuwające miejsce składowania na podstawie wartości współrzędnej 'x' i 'y'
    void deleteByXAndY(int xCoordinate, int yCoordinate);


    // Zapytanie zwracające miejsce składowania na podstawie wartości współrzędnych 'x' i 'y'
    MiejsceSkladowania findByXAndY(int xCoordinate, int yCoordinate);


    //Zapytanie zwracające miejsce składowania na podstawie wartości współrzędnych 'x', 'y' oraz 'level'
    MiejsceSkladowania findByXAndYAndLevel(int xCoordinate, int yCoordinate, int level);


    //Zapytanie dodające wartość do współrzędnej 'x'
    @Modifying
    @Query("UPDATE MiejsceSkladowania m SET m.x = m.x + :value")
    void addValueToX(@Param("value") int value);
    //Zapytanie aktualizacji dla wartości współrzędnej 'x'
    @Modifying
    @Query("UPDATE MiejsceSkladowania m SET m.x = :newValue")
    void updateValueOfX(@Param("newValue") int newValue);
    //Zapytanie usuwające wartość współrzędnej 'x'
    @Modifying
    @Query("UPDATE MiejsceSkladowania m SET m.x = NULL")
    void removeValueFromX();


    //Zapytanie dodające wartość do współrzędnej 'y'
    @Modifying
    @Query("UPDATE MiejsceSkladowania m SET m.y = m.y + :value")
    void addValueToY(@Param("value") int value);
    //Zapytanie aktualizacji dla wartości współrzędnej 'y'
    @Modifying
    @Query("UPDATE MiejsceSkladowania m SET m.y = :newValue")
    void updateValueOfY(@Param("newValue") int newValue);
    //Zapytanie usuwające wartość współrzędnej 'y'
    @Modifying
    @Query("UPDATE MiejsceSkladowania m SET m.y = NULL")
    void removeValueFromY();


    //Zapytanie dodające wartość do współrzędnej 'level'
    @Modifying
    @Query("UPDATE MiejsceSkladowania m SET m.level = m.level + :value")
    void addValueToLevel(@Param("value") int value);
    //Zapytanie aktualizacji dla wartości współrzędnej 'level'
    @Modifying
    @Query("UPDATE MiejsceSkladowania m SET m.level = :newValue")
    void updateValueOfLevel(@Param("newValue") int newValue);
    //Zapytanie usuwające wartość współrzędnej 'level'
    @Modifying
    @Query("UPDATE MiejsceSkladowania m SET m.level = NULL")
    void removeValueFromLevel();


    //Zapytanie dodające wartość do 'hala'
    @Modifying
    @Query("UPDATE MiejsceSkladowania m SET m.hala = true")
    void addValueToHala();
    //Zapytanie aktualizacji wartości 'hala'
    @Modifying
    @Query("UPDATE MiejsceSkladowania m SET m.hala = :newValue")
    void updateValueOfHala(@Param("newValue") boolean newValue);
    //Zapytanie usuwające wartość 'hala'
    @Modifying
    @Query("UPDATE MiejsceSkladowania m SET m.hala = false")
    void removeValueFromHala();


    //Zapytanie dodające wartość do 'plac':
    @Modifying
    @Query("UPDATE MiejsceSkladowania m SET m.plac = true")
    void addValueToPlac();
    //Zapytanie aktualizacji wartości 'plac'
    @Modifying
    @Query("UPDATE MiejsceSkladowania m SET m.plac = :newValue")
    void updateValueOfPlac(@Param("newValue") boolean newValue);
    //Zapytanie usuwające wartość 'plac':
    @Modifying
    @Query("UPDATE MiejsceSkladowania m SET m.plac = false")
    void removeValueFromPlac();


    //Zapytanie usuwające miejsce składowania na podstawie wartości współrzędnych 'x', 'y' oraz 'level'
    @Modifying
    @Query("DELETE FROM MiejsceSkladowania m WHERE m.x = :xCoordinate AND m.y = :yCoordinate AND m.level = :level")
    void deleteByXAndYAndLevel(@Param("xCoordinate") int xCoordinate, @Param("yCoordinate") int yCoordinate, @Param("level") int level);


    //Zapytanie usuwające miejsce składowania na podstawie wartości współrzędnych 'x', 'y', 'level' oraz 'plac'
    @Modifying
    @Query("DELETE FROM MiejsceSkladowania m WHERE m.x = :xCoordinate AND m.y = :yCoordinate AND m.level = :level AND m.plac = true")
    void deleteByXAndYAndLevelAndPlac(@Param("xCoordinate") int xCoordinate, @Param("yCoordinate") int yCoordinate, @Param("level") int level);


    //Zapytanie usuwające miejsce składowania na podstawie wartości współrzędnych 'x', 'y', 'level' oraz 'hala'
    @Modifying
    @Query("DELETE FROM MiejsceSkladowania m WHERE m.x = :xCoordinate AND m.y = :yCoordinate AND m.level = :level AND m.hala = true")
    void deleteByXAndYAndLevelAndHala(@Param("xCoordinate") int xCoordinate, @Param("yCoordinate") int yCoordinate, @Param("level") int level);

}
