package com.szm.sys_zarz_mag.Zadanie;

import com.szm.sys_zarz_mag.Pracownik.Pracownik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZadanieService {

    private final ZadanieRepository zadanieRepository;

    @Autowired
    public ZadanieService(ZadanieRepository zadanieRepository) {
        this.zadanieRepository = zadanieRepository;
    }

    public List<Zadanie> getAllZadania() {
        return zadanieRepository.findAll();
    }


    public void deleteZadanieById(Long id) {
        zadanieRepository.deleteById(id);
    }


    public Zadanie getZadanieById(Long id) {
        return zadanieRepository.findById(id).orElse(null);
    }


    public List<Zadanie> getZadaniaByPracownik(Pracownik pracownik) {
        return zadanieRepository.findByPracownik(pracownik);
    }

    public List<Zadanie> getZadaniaByFragmentOpisu(String fragmentOpisu) {
        return zadanieRepository.findByZadanieOpisStartingWith(fragmentOpisu);
    }

    public List<Zadanie> getAllZadaniaSortedByPracownikId() {
        return zadanieRepository.findByOrderByPracownikIdPracownikAsc();
    }

    public List<Zadanie> getZadaniaByPracownikId(Long idPracownik) {
        return zadanieRepository.findByPracownik_IdPracownik(idPracownik);
    }

    public Zadanie getZadanieByTytul(String tytul) {
        return zadanieRepository.findByZadanieTytul(tytul);
    }
}