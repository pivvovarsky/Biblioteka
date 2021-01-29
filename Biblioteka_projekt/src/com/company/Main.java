package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Biblioteka biblioteka = new Biblioteka();
        Scanner input = new Scanner(System.in);

        String linia;
        do {
            wyswietlMenu();
            linia = input.nextLine();

            if (linia.equals("0")) {
                biblioteka.wyswietlListeKsiazek();
            }
            else if(linia.equals("1"))
            {
                String tytul, autor;
                System.out.println("Podaj tytul ksiazki");
                tytul = input.nextLine();
                System.out.println("Podaj autora ksiazki");
                autor = input.nextLine();

                // dodanie
                biblioteka.dodajKsiazke(new Ksiazka( autor, tytul));
            }
            else if(linia.equals("2"))
            {
                String i, tytul, autor;
                System.out.println("Podaj numer ksiazki do edytcji");
                i = input.nextLine();
                System.out.println("Podaj tytul ksiazki");
                tytul = input.nextLine();
                System.out.println("Podaj autora ksiazki");
                autor = input.nextLine();

                // edycja
                Ksiazka ksiazkaDoEdycji = biblioteka.getListaKsiazek().get(Integer.parseInt(i));
                ksiazkaDoEdycji.setTytul(tytul);
                ksiazkaDoEdycji.setAutor(autor);
            }
            else if(linia.equals("3"))
            {

            }
            else if(linia.equals("4"))
            {

            }
            else if(linia.equals("5"))
            {

            }
            else if(linia.equals("6"))
            {

            }
            else if(linia.equals("7"))
            {

            }
            else if(linia.equals("8"))
            {

            }
            else if(linia.equals("9"))
            {

            }
        } while (!linia.equals("q"));

        System.out.println("Dziekuje dobranoc");
    }


    static void wyswietlMenu()
    {
        System.out.println("-----MENU-----");
        System.out.println("Wybierz: ");
        System.out.println("0-Wyswietl baze ksiazek");
        System.out.println("1-Dodaj nowa ksiazke do biblioteki");
        System.out.println("2-Edytuj ksiazke z biblioteki");
        System.out.println("3-Usun ksiazke z biblioteki");
        System.out.println("4-Dodaj nowego uzytkownika");
        System.out.println("5-Edytuj uzytkownika");
        System.out.println("6-Zablokuj uzytkownika");
        System.out.println("8-Wypozycz ksiazke");
        System.out.println("9-Wyswietl baze uzytkownikow(Terminy wypozyczen)");
        System.out.println("q - Wyjdz z programu");
        System.out.println("-------------");
    }
}
