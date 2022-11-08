package it.bibloteca.develhope;

/**
 * @author Drumstyle92
 * class that contains variables needed to initialize book objects.
 */
public class Libro {
    /**
     * name of the book.
     */
    private String nomeLibro;
    /**
     * description of the book.
     */
    private String descrizioneLibro;

    /**
     *
     * @param nomeLibro enter the name of the book.
     * @param descrizioneLibro enter the description of the book
     * constructor method of the class.
     */
    public Libro(String nomeLibro,String descrizioneLibro){
        this.setNomeLibro(nomeLibro);
        this.setDescrizioneLibro(descrizioneLibro);
    }


    /**
     *
     * @return returns to the private variable.
     *
     */
    public String getDescrizioneLibro() {
        return descrizioneLibro;
    }

    /**
     *
     * @param descrizioneLibro enter a description of the book.
     * method to be able to touch the private variable.
     */
    public void setDescrizioneLibro(String descrizioneLibro) {
        this.descrizioneLibro = descrizioneLibro;
    }

    /**
     *
     * @return returns to the private variable.
     * method to be able to retrieve the private variable guori from the class.
     */
    public String getNomeLibro() {
        return nomeLibro;
    }

    /**
     *
     * @param nomeLibro enter the name of the book.
     * method to be able to modify the private variable.
     */
    public void setNomeLibro(String nomeLibro) {
        this.nomeLibro = nomeLibro;
    }

    /**
     * method (optional) to be able to print private variables.
     */
    public void infoLibro(){
        System.out.println("Nome libro: " + getNomeLibro() + "\nDescrizione libro: " + getDescrizioneLibro());
    }
}
