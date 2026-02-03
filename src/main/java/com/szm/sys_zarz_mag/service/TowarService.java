package com.szm.sys_zarz_mag.service;

import com.szm.sys_zarz_mag.model.Towar;
import com.szm.sys_zarz_mag.repository.TowarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TowarService {

    private TowarRepository towarRepository;

    @Autowired
    public TowarService(TowarRepository towarRepository) {
        this.towarRepository = towarRepository;
    }

    public Towar znajdzTowarNaPodstawieNazwy(String nazwaTowar) {
        return towarRepository.findByNazwaTowar(nazwaTowar);
    }


    //Dodanie nazwy towaru
    public void dodajNazweTowaru(long towarId, String nazwa) {
        towarRepository.addNazwaTowaru(towarId, nazwa);
    }


    //Metoda dodająca datę przyjęcia towaru
    public void dodajDatePrzyjecia(long towarId, LocalDate data) {
        towarRepository.addDataPrzyjecia(towarId, data);
    }


    //Metoda dodająca datę wysyłki towaru
    public void dodajDateWysylki(long towarId, LocalDate data) {
        towarRepository.addDataWysylki(towarId, data);
    }


    //Metoda edycji Nazwy towaru
    public void edytujNazweTowaru(long towarId, String nazwa) {
        towarRepository.editNazwaTowaru(towarId, nazwa);
    }


    //Metoda edycji Daty przyjęcia towaru
    public void edytujDatePrzyjecia(long towarId, LocalDate data) {
        towarRepository.editDataPrzyjecia(towarId, data);
    }


    //Metoda edycji Daty wysyłki towaru
    public void edytujDateWysylki(long towarId, LocalDate data) {
        towarRepository.editDataWysylki(towarId, data);
    }


    //Metoda usuwająca dany towar
    public void usunTowar(long towarId) {
        towarRepository.deleteTowarById(towarId);
    }



    //Metoda zwracająca towary na podstawie daty wysyłki
    public List<Towar> znajdzTowaryZDataWysylki(LocalDate dataWysylki) {
        return towarRepository.findByDataWysylki(dataWysylki);
    }


    //Metoda zwracająca towary na podstawie unikalności
    public List<Towar> znajdzTowaryZNazwaNotNull() {
        return towarRepository.findByNazwaTowarIsNotNull();
    }


    //Metoda zwracająca liczbę towarów na podstawie nazwy
    public int policzTowaryZNazwa(String nazwaTowar) {
        return towarRepository.countByNazwaTowar(nazwaTowar);
    }

    public List<Towar> addAllTowar(List<Towar> towary) {
        return towarRepository.saveAll(towary);
    }
}
