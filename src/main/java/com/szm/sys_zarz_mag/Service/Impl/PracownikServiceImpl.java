package com.szm.sys_zarz_mag.Service.Impl;

import com.szm.sys_zarz_mag.Entity.IdDzialStan;
import com.szm.sys_zarz_mag.Entity.Magazyn;
import com.szm.sys_zarz_mag.Entity.Stawka;
import com.szm.sys_zarz_mag.Entity.Pracownik;
import com.szm.sys_zarz_mag.Repository.PracownikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Service
public class PracownikServiceImpl {

    private PracownikRepository pracownikRepository;

    @Autowired
    public PracownikServiceImpl(PracownikRepository pracownikRepository) {
        this.pracownikRepository = pracownikRepository;
    }

    public Pracownik findPracownikByNazwisko(String nazwisko) {
        return pracownikRepository.findByNazwisko(nazwisko);
    }

    public Pracownik findPracownikById(long id) {
        return pracownikRepository.findByIdPracownik(id);
    }

    public Pracownik updatePracownik(String email, Pracownik pracownik) {
        Pracownik pracownikDB = pracownikRepository.findByEmail(email);

        if(Objects.nonNull(pracownik.getImie()) && !"".equalsIgnoreCase(pracownik.getImie())) {
            pracownikDB.setImie(pracownik.getImie());
        }

        if(Objects.nonNull(pracownik.getNazwisko()) && !"".equalsIgnoreCase(pracownik.getNazwisko())) {
            pracownikDB.setNazwisko(pracownik.getNazwisko());
        }

        if(Objects.nonNull(pracownik.getEmail()) && !"".equalsIgnoreCase(pracownik.getEmail())) {
            pracownikDB.setEmail(pracownik.getEmail());
        }

        if(Objects.nonNull(pracownik.getTelefonP()) && !"".equalsIgnoreCase(pracownik.getTelefonP())) {
            pracownikDB.setTelefonP(pracownik.getTelefonP());
        }
        return pracownikRepository.save(pracownikDB);
    }

    public void deletePracownikById(long id) {
        pracownikRepository.deleteById(id);
    }

    public List<Pracownik> findPracownicyByImie(String imie) {
        return pracownikRepository.findByImie(imie);
    }

    public List<Pracownik> findPracownicyByDataZatrud(LocalDate dataZatrud) {
        return pracownikRepository.findByDataZatrud(dataZatrud);
    }

    public List<Pracownik> findPracownicyByTelefon(String telefon) {
        return pracownikRepository.findByTelefonP(telefon);
    }

    public List<Pracownik> findPracownicyByMagazyn(Magazyn magazyn) {
        return pracownikRepository.findByMagazyn(magazyn);
    }

    public List<Pracownik> findPracownicyByDzialStan(IdDzialStan dzialStan) {
        return pracownikRepository.findByDzialStan_IdDzialStan(dzialStan);
    }

    public List<Pracownik> findPracownicyByStawka(Stawka stawka) {
        return pracownikRepository.findByStawka(stawka);
    }

    public List<Pracownik> findPracownicyByImieAndNazwiskoOrderedByNazwiskoAsc(String imie, String nazwisko) {
        return pracownikRepository.findByImieAndNazwiskoOrderByNazwiskoAsc(imie, nazwisko);
    }

    public int countPracownicyByImie(String imie) {
        return pracownikRepository.countByImie(imie);
    }

    
}
