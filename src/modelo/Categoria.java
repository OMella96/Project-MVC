package modelo;

/**
 * Clase categoria que representa la tabla Categoria en la BD
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class Categoria {

    int tipo;
    String descripcion;

    /**
     * Constructor con parametros para la clase Categoria
     *
     * @param tipo
     * @param descripcion
     */
    public Categoria(int tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    /**
     * Constructor sin parametros para la clase Categoria
     */

    public Categoria() {
    }

    /**
     * Metodo accesador para el atributo tipo
     *
     * @return int
     */

    public int getTipo() {
        return tipo;
    }

    /**
     * Metodo accesador para el atributo Descripcion
     *
     * @return String
     */

    public String getDescripcion() {
        return descripcion;
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
     * Metodo mutador para el atributo descripcion
     *
     * @param descripcion String
     */

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo que retorna como cadena los caracteres de todos los atributos de
     * la clase
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Categoria{" + "tipo=" + tipo + ", descripcion=" + descripcion + '}';
    }

}
