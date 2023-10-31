package com.szm.sys_zarz_mag.Towar;

import com.szm.sys_zarz_mag.Jednostka.Jednostka;
import com.szm.sys_zarz_mag.MiejsceSkladowania.MiejsceSkladowania;
import com.szm.sys_zarz_mag.RodzajSkladowania.RodzajSkladowania;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TowarService {

    private final TowarRepository towarRepository;

    @Autowired
    public TowarService(TowarRepository towarRepository) {
        this.towarRepository = towarRepository;
    }

    public Towar znajdzTowarNaPodstawieNazwy(String nazwaTowar) {
        return towarRepository.findByNazwaTowar(nazwaTowar);
    }

    public List<Towar> znajdzTowaryZIlosciaWiekszaNiz(double ilosc) {
        return towarRepository.findByIloscGreaterThan(ilosc);
    }


    //Dodanie nazwy towaru
    public void dodajNazweTowaru(long towarId, String nazwa) {
        towarRepository.addNazwaTowaru(towarId, nazwa);
    }

    // Metoda dodająca ilość towaru
    public void dodajIloscTowaru(long towarId, double ilosc) {
        towarRepository.addIloscTowaru(towarId, ilosc);
    }

    // Metoda dodająca datę przyjęcia towaru
    public void dodajDatePrzyjecia(long towarId, String data) {
        towarRepository.addDataPrzyjecia(towarId, data);
    }

    // Metoda dodająca datę wysyłki towaru
    public void dodajDateWysylki(long towarId, String data) {
        towarRepository.addDataWysylki(towarId, data);
    }

    // Metoda dodająca rodzaj składowania towaru
    public void dodajRodzajSkladowania(long towarId, RodzajSkladowania rodzajSkladowania) {
        towarRepository.addRodzajSkladowania(towarId, rodzajSkladowania);
    }

    // Metoda dodająca jednostkę towaru
    public void dodajJednostke(long towarId, Jednostka jednostka) {
        towarRepository.addJednostka(towarId, jednostka);
    }

    // Metoda edycji Ilości towaru
    public void edytujIloscTowaru(long towarId, double ilosc) {
        towarRepository.editIloscTowaru(towarId, ilosc);
    }

    // Metoda edycji Nazwy towaru
    public void edytujNazweTowaru(long towarId, String nazwa) {
        towarRepository.editNazwaTowaru(towarId, nazwa);
    }

    // Metoda edycji Daty przyjęcia towaru
    public void edytujDatePrzyjecia(long towarId, String data) {
        towarRepository.editDataPrzyjecia(towarId, data);
    }

    // Metoda edycji Daty wysyłki towaru
    public void edytujDateWysylki(long towarId, String data) {
        towarRepository.editDataWysylki(towarId, data);
    }

    // Metoda edycji Rodzaju Składowania towaru
    public void edytujRodzajSkladowania(long towarId, RodzajSkladowania rodzajSkladowania) {
        towarRepository.editRodzajSkladowania(towarId, rodzajSkladowania);
    }

    // Metoda edycji Miejsca Składowania towaru
    public void edytujMiejsceSkladowania(long towarId, MiejsceSkladowania miejsceSkladowania) {
        towarRepository.editMiejsceSkladowania(towarId, miejsceSkladowania);
    }

    // Metoda edycji Jednostki towaru
    public void edytujJednostke(long towarId, Jednostka jednostka) {
        towarRepository.editJednostka(towarId, jednostka);
    }

    // Metoda usuwająca dany towar
    public void usunTowar(long towarId) {
        towarRepository.deleteTowarById(towarId);
    }

    // Metoda zwracająca towary na podstawie ilości mniejszej niż podana
    public List<Towar> znajdzTowaryZIlosciaMniejszaNiz(double ilosc) {
        return towarRepository.findByIloscLessThan(ilosc);
    }

    // Metoda zwracająca towary na podstawie ilości pomiędzy dwiema podanymi wartościami
    public List<Towar> znajdzTowaryZIlosciaPomiedzy(double ilosc1, double ilosc2) {
        return towarRepository.findByIloscBetween(ilosc1, ilosc2);
    }

    // Metoda zwracająca towary na podstawie daty wysyłki
    public List<Towar> znajdzTowaryZDataWysylki(String dataWysylki) {
        return towarRepository.findByDataWysylki(dataWysylki);
    }

    // Metoda zwracająca towary na podstawie unikalności
    public List<Towar> znajdzTowaryZNazwaNotNull() {
        return towarRepository.findByNazwaTowarIsNotNull();
    }

    // Metoda zwracająca liczbę towarów na podstawie nazwy
    public int policzTowaryZNazwa(String nazwaTowar) {
        return towarRepository.countByNazwaTowar(nazwaTowar);
    }

    // Metoda dodająca pełne miejsce składowania towaru
    public void dodajMiejsceSkladowania(long towarId, MiejsceSkladowania miejsceSkladowania) {
        towarRepository.addMiejsceSkladowania(towarId, miejsceSkladowania);
    }
}
