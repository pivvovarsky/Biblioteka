package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Biblioteka {
    private List<Ksiazka> listaKsiazek = new ArrayList<Ksiazka>();

    public List<Ksiazka> getListaKsiazek() {
        return listaKsiazek;
    }

    public void setListaKsiazek(List<Ksiazka> listaKsiazek) {
        this.listaKsiazek = listaKsiazek;
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

}
