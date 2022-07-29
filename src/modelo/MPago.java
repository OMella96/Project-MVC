package modelo;

/**
 * Clase mpago que representa la tabla mpago en la BD
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class MPago {

    int tipo;
    String detalle;

    /**
     * Constructor sin parametros para la clase mpagos
     */
    public MPago() {
    }

    /**
     * Constructor con parametros para la clase mpagos
     *
     * @param tipo int
     * @param detalle String
     */
    public MPago(int tipo, String detalle) {
        this.tipo = tipo;
        this.detalle = detalle;
    }

    /**
     * metodo accesador para el atributo tipo
     *
     * @return int
     */

    public int getTipo() {
        return tipo;
    }

    /**
     * metodo accesador para el atributo detalle
     *
     * @return String
     */

    public String getDetalle() {
        return detalle;
    }

    /**
     * Metodo mutador para el atributo tipo
     *
     * @param tipo int
     */

    public void setTipo(int tipo) {
        this.tipo = tipo;
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
        return "MPago{" + "tipo=" + tipo + ", detalle=" + detalle + '}';
    }

}
