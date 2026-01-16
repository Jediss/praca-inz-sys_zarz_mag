package com.szm.sys_zarz_mag.service;

import com.szm.sys_zarz_mag.model.IdDzialStan;
import com.szm.sys_zarz_mag.model.Magazyn;
import com.szm.sys_zarz_mag.model.Stawka;
import com.szm.sys_zarz_mag.model.Pracownik;
import com.szm.sys_zarz_mag.repository.PracownikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Service
public class PracownikService {

    private PracownikRepository pracownikRepository;

    @Autowired
    public PracownikService(PracownikRepository pracownikRepository) {
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
