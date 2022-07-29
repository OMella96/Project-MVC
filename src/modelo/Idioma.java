package modelo;

/**
 * Clase idioma que representa la tabla idioma en la BD
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class Idioma {

    int id;
    String detalle;

    /**
     * Constructor con parametros para la clase idioma
     *
     * @param id
     * @param detalle
     */

    public Idioma(int id, String detalle) {
        this.id = id;
        this.detalle = detalle;
    }

    /**
     * constructor sin parametro para la clase idioma
     */

    public Idioma() {
    }

    /**
     * Metodo accesador para el atributo id
     *
     * @return int
     */

    public int getId() {
        return id;
    }

    /**
     * Metodo accesador para el atributo detalle
     *
     * @return String
     */

    public String getDetalle() {
        return detalle;
    }

    /**
     * Metodo mutador para el atributo id
     *
     * @param id int
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * metodo mutador para el atributo detalle
     *
     * @param detalle String
     */

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    /**
     * Metodo que retorna como cadena los caracteres de todos los atributos de
     * la clase
     *
     * @return String
     */

    @Override
    public String toString() {
        return "Idioma{" + "id=" + id + ", detalle=" + detalle + '}';
    }

}
