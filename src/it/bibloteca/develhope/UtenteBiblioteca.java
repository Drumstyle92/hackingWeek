package it.bibloteca.develhope;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Drumstyle92
 *
 */
public class UtenteBiblioteca {
    /**
     * the private arrayList of the user class.
     */
    private List<String> listaLibri = new ArrayList<>();
    /**
     * creation of the private object of the class itself.
     */
    private static final UtenteBiblioteca utenteBiblioteca = new UtenteBiblioteca();

    /**
     * private constructor method.
     */
    private UtenteBiblioteca(){}


    /**
     *
     * @return takes the initialized object in the class.
     * method to be able to initialize the private object of the class outside the class.
     */
    public static UtenteBiblioteca getIstance(){
        return utenteBiblioteca;
    }

    /**
     *
     * @return returns the private arrayList of the class.
     * method to call arrayList outside the class.
     */
    public List<String> getListaLibri() {
        return listaLibri;
    }

    /**
     *
     * @param listaLibri insert (optional) a new list.
     * method to be able to modify the private arrayList.
     */
    public void setListaLibri(List<String> listaLibri) {
        this.listaLibri = listaLibri;
    }

    /**
     *
     * @param libro insert a new book in the arreayList.
     * method that allows you to add books to the private arrayList.
     */
    public void aggiungiLibro(String libro){
        listaLibri.add(libro);
    }







}

