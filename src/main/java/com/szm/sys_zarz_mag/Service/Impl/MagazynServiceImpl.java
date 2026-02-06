package com.szm.sys_zarz_mag.Service.Impl;
import com.szm.sys_zarz_mag.Entity.Magazyn;
import com.szm.sys_zarz_mag.Repository.MagazynRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagazynServiceImpl {

    private MagazynRepository magazynRepository;

    @Autowired
    public MagazynServiceImpl(MagazynRepository magazynRepository) {
        this.magazynRepository = magazynRepository;
    }

    public Magazyn findMagazynByNazwa(String nazwa) {
        return magazynRepository.findByNazwaMagazyn(nazwa);
    }

    public List<Magazyn> findMagazynyByAdresMiasto(String adresMiasto) {
        return magazynRepository.findByAdresMiastoM(adresMiasto);
    }

    public List<Magazyn> findMagazynyByAdresUlica(String adresUlica) {
        return magazynRepository.findByAdresUlicaM(adresUlica);
    }

    public List<Magazyn> findMagazynyByAdresMiastoIUlica(String adresMiasto, String adresUlica) {
        return magazynRepository.findByAdresMiastoMAndAdresUlicaM(adresMiasto, adresUlica);
    }

    public List<Magazyn> findMagazynyByAdresKod(String kodPocztowy) {
        return magazynRepository.findByAdresKodM(kodPocztowy);
    }

    public List<Magazyn> findMagazynyByAdresMiastoOrderedByNazwaAsc(String adresMiasto) {
        return magazynRepository.findByAdresMiastoMOrderByNazwaMagazynAsc(adresMiasto);
    }

    public int countMagazynyByNazwa(String nazwa) {
        return magazynRepository.countByNazwaMagazyn(nazwa);
    }

    public void deleteMagazynByNazwa(String nazwa) {
        magazynRepository.deleteByNazwaMagazyn(nazwa);
    }

    //
    //public List<Magazyn> findMagazynyByMiastoIUlica(String miasto, String ulica) {
        //return magazynRepository.findMagazynByMiastoIUlica(miasto, ulica);
    //}
}
