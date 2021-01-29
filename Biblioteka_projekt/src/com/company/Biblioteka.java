package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Biblioteka {
    private List<Ksiazka> listaKsiazek = new ArrayList<Ksiazka>();
    private List<Uzytkownik> listaUzytkownikow = new ArrayList<Uzytkownik>();
    ////METODY KSIAZKA:
    public List<Ksiazka> getListaKsiazek() {
        return listaKsiazek;
    }

    public void setListaKsiazek(List<Ksiazka> listaKsiazek) {
        this.listaKsiazek = listaKsiazek;
    }

    public List<Uzytkownik> getListaUzytkownikow() {
        return listaUzytkownikow;
    }

    private void sortujKsiazki(){
        listaKsiazek.sort((ksiazka1, ksiazka2) -> ksiazka1.getTytul().compareTo(ksiazka2.getTytul()));
    }

    void dodajKsiazke(Ksiazka ksiazka)
    {
        this.listaKsiazek.add(ksiazka);
        this.sortujKsiazki();
    }

    void usunKsiazke(int i){
        this.listaKsiazek.remove(i);
    }


    void wyswietlListeKsiazek()
    {
        for (int i = 0; i < listaKsiazek.size(); i ++) {
            System.out.println("KSIĄŻKA " + i + ": " + listaKsiazek.get(i).toString());
        }
    }
    ///METODY UZYTKOWNIK
    public void sortujUzytkownikow(){
        listaUzytkownikow.sort((uzytkownik1, uzytkownik2) -> uzytkownik1.getNazwisko().compareTo(uzytkownik2.getNazwisko()));
    }
    void dodajUzytkownika(Uzytkownik uzytkownik) {
        this.listaUzytkownikow.add(uzytkownik);
        this.sortujUzytkownikow();
    }

    void wyswietlListeUzytkownikow() {
        for (int i = 0; i < listaUzytkownikow.size(); i ++) {
            System.out.println("UŻYTKOWNIK " + i + ": " + listaUzytkownikow.get(i).toString());
        }
    }

    void usunUzytkownika(int idUzytkownika){
        this.listaUzytkownikow.remove(idUzytkownika);
    }

    public void setListaUzytkownikow(List<Uzytkownik> listaUzytkownikow) {
        this.listaUzytkownikow = listaUzytkownikow;
    }

    void edytujUzytkownika(int i, Uzytkownik uzytkownik){
        this.listaUzytkownikow.set(i,uzytkownik);
    }


}
