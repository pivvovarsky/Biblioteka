package com.company;

public class Uzytkownik {
    private String imie;
    private String nazwisko;
    private boolean zablokowany = false;
    public Uzytkownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Uzytkownik(String imie, String nazwisko, boolean zablokowany) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.zablokowany = zablokowany;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public boolean isZablokowany() {
        return zablokowany;
    }

    public void setZablokowany(boolean zablokowany) {
        this.zablokowany = zablokowany;
    }

    @Override
    public String toString() {
        return "{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", zablokowany=" + zablokowany +
                '}';
    }
}
