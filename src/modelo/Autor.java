package modelo;

/**
 * Clase Autor que representa la tabla autor en la BD
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class Autor {

    int idautor;
    String nombre, apellidom, apellidop;

    /**
     * Constructor con parametros para la clase Autor
     *
     * @param idautor int
     * @param nombre String
     * @param apellidom String
     * @param apellidop String
     */
    public Autor(int idautor, String nombre, String apellidom, String apellidop) {
        this.idautor = idautor;
        this.nombre = nombre;
        this.apellidom = apellidom;
        this.apellidop = apellidop;
    }

    /**
     * Constructor sin parametros para la clase Autor
     */
    public Autor() {
    }

    /**
     * Metodo accesador para el atributo idAutor
     *
     * @return int
     */
    public int getIdautor() {
        return idautor;
    }

    /**
     * Metodo accesador para el atributo Nombre
     *
     * @return String
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo accesador para el atributo Apellidom
     *
     * @return String
     */

    public String getApellidom() {
        return apellidom;
    }

    /**
     * Metodo accesador para el atributo Apellidop
     *
     * @return String
     */

    public String getApellidop() {
        return apellidop;
    }

    /**
     * Metodo mutador para el atributo idAutor
     *
     * @param idautor int
     */
    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    /**
     * Metodo mutador para el atributo nombre
     *
     * @param nombre String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo mutador para el atributo apellidom
     *
     * @param apellidom String
     */
    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    /**
     * Metodo mutador para el atributo apellidop
     *
     * @param apellidop String
     */
    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    /**
     * Metodo que retorna como cadena los caracteres de todos los atributos de
     * la clase
     *
     * @return String
     */

    @Override
    public String toString() {
        return "Boleta{" + "idautor=" + idautor + ", nombre=" + nombre + ", apellidom=" + apellidom + ", apellidop=" + apellidop + '}';
    }

}
