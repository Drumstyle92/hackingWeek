package it.bibloteca.develhope;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Drumastyle92
 * Main class that contains the core of the program.
 */
public class Test {
    /**
     *
     * @param args main parameter.
     * main method with a singleton object inside,
     * three book class objects, an arraylist and various ways to print the array.
     */
    public static void main(String[] args) {
        // singleton class object creation
        UtenteBiblioteca utenteBiblioteca = UtenteBiblioteca.getIstance();
        // creation of three book class objects
        Libro libro1 = new Libro("Mille leghe sotto i mari","parla del più e del meno");
        Libro libro2 = new Libro("50 sfumature di codice","parla di codici e unioni");
        Libro libro3 = new Libro("Forza Java","parla di quanto è bello java");


        // List that will contain the book class objects
        List<Libro> listalibri = new ArrayList<>();
        // we add the book class objects in the arrayList
        listalibri.add(libro1);
        listalibri.add(libro2);
        listalibri.add(libro3);
        utenteBiblioteca.aggiungiLibro(libro1.getNomeLibro());
        utenteBiblioteca.aggiungiLibro(libro2.getNomeLibro());
        utenteBiblioteca.aggiungiLibro(libro3.getNomeLibro());
        // displays the various names of the user's books in different ways
        System.out.println("=======================FOR1==================================");
        for (String libro : utenteBiblioteca.getListaLibri()) {
            System.out.println(libro);}
        System.out.println("=======================FOR2==================================");
        for(int i = 0; i < utenteBiblioteca.getListaLibri().toArray().length; i++){
            String result = utenteBiblioteca.getListaLibri().get(i);
            System.out.println(result);
        }
        System.out.println("=======================FOR3==================================");
        utenteBiblioteca.getListaLibri().forEach(System.out::println);
        System.out.println("=======================STREAM================================");
        System.out.println(utenteBiblioteca.getListaLibri().stream().toList());


    }
}
