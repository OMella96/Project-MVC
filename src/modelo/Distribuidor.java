package modelo;

/**
 * Clase Distribuidor que representa la tabla distribuidor en la BD
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class Distribuidor {

    int fono, ano;
    String rut, nombre, direccion;

    /**
     * Constructor con parametros para la clase distribuidor
     *
     * @param fono
     * @param ano
     * @param rut
     * @param nombre
     * @param direccion
     */
    public Distribuidor(int fono, int ano, String rut, String nombre, String direccion) {
        this.fono = fono;
        this.ano = ano;
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    /**
     * Constructor sin parametros para la clase Distribuidor
     */
    public Distribuidor() {
    }

    /**
     * Metodo accesador para el atributo fono
     *
     * @return int
     */
    public int getFono() {
        return fono;
    }

    /**
     * Metodo accesador para el atributo ano
     *
     * @return int
     */

    public int getAno() {
        return ano;
    }

    /**
     * Metodo accesador para el atributo rut
     *
     * @return String
     */
    public String getRut() {
        return rut;
    }

    /**
     * Metodo accesador para el atributo nombre
     *
     * @return String
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo accesador para el atributo direccion
     *
     * @return String
     */

    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo mutador para el atributo fono
     *
     * @param fono int
     */

    public void setFono(int fono) {
        this.fono = fono;
    }

    /**
     * Metodo mutador para el atributo ano
     *
     * @param ano int
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * Metodo mutador para el atributo rut
     *
     * @param rut String
     */
    public void setRut(String rut) {
        this.rut = rut;
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
     * Metodo mutador para el atributo direccion
     *
     * @param direccion String
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo que retorna como cadena los caracteres de todos los atributos de
     * la clase
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Distribuidor{" + "fono=" + fono + ", ano=" + ano + ", rut=" + rut + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }

}
