package com.szm.sys_zarz_mag.Pracownik;

import com.szm.sys_zarz_mag.IdDzialStan.IdDzialStan;
import com.szm.sys_zarz_mag.Magazyn.Magazyn;
import com.szm.sys_zarz_mag.Stawka.Stawka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PracownikService {

    private final PracownikRepository pracownikRepository;

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

    public Pracownik findPracownikByLogin(String login) {
        return pracownikRepository.findByLogin(login);
    }

    public void deletePracownikById(long id) {
        pracownikRepository.deleteById(id);
    }

    public List<Pracownik> findPracownicyByImie(String imie) {
        return pracownikRepository.findByImie(imie);
    }

    public List<Pracownik> findPracownicyByDataZatrud(String dataZatrud) {
        return pracownikRepository.findByDataZatrud(dataZatrud);
    }

    public List<Pracownik> findPracownicyByDataZwol(String dataZwol) {
        return pracownikRepository.findByDataZwol(dataZwol);
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
