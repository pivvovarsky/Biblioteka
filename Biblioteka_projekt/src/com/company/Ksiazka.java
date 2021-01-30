package com.company;

import java.time.LocalDate;

public class Ksiazka {
    private String autor;
    private String tytul;
    private LocalDate terminOddania;
    private Uzytkownik uzytkownikWypozyczajacy;

    public Ksiazka(String autor, String tytul) {
        this.autor = autor;
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public LocalDate getTerminOddania() {
        return terminOddania;
    }

    public void setTerminOddania(LocalDate terminOddania) {
        this.terminOddania = terminOddania;
    }

    public Uzytkownik getUzytkownikWypozyczajacy() {
        return uzytkownikWypozyczajacy;
    }

    public void setUzytkownikWypozyczajacy(Uzytkownik uzytkownikWypozyczajacy) {
        this.uzytkownikWypozyczajacy = uzytkownikWypozyczajacy;
    }

    @Override
    public String toString() {
        return "{" +
                "autor='" + autor + '\'' +
                ", tytul='" + tytul + '\'' +
                ", terminOddania='" + terminOddania + '\'' +
                ", uzytkownikWypozyczajacy=" + uzytkownikWypozyczajacy +
                '}';
    }

}