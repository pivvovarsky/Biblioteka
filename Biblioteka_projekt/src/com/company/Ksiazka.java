package com.company;

public class Ksiazka {
    private String autor;
    private String tytul;
    private String terminOddania;
    private Uzytkownik uzytkownikWypozyczajacy;

    public Ksiazka(String autor, String tytul) {
        this.autor = autor;
        this.tytul = tytul;
        this.terminOddania = terminOddania;
        this.uzytkownikWypozyczajacy = uzytkownikWypozyczajacy;
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

    public String getTerminOddania() {
        return terminOddania;
    }

    public void setTerminOddania(String terminOddania) {
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