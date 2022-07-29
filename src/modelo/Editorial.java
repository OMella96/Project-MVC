package modelo;

/**
 * Clase editorial que representa la tabla Editorial en la BD
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class Editorial {

    int id;
    String detalle;

    /**
     * Constructor con parametros para la clase editorial
     *
     * @param id
     * @param detalle
     */

    public Editorial(int id, String detalle) {
        this.id = id;
        this.detalle = detalle;
    }

    /**
     * Constructor sin parametros para la clase editorial
     */

    public Editorial() {
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
     * Metodo mutador para el atributo detalle
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
        return "Editorial{" + "id=" + id + ", detalle=" + detalle + '}';
    }

}
