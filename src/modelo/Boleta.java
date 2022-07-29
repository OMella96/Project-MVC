package modelo;

/**
 * Clase boleta que representa la tabla Boleta en la BD
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class Boleta {

    int folio, neto, iva, costoiva, mpagos;
    String fecha, hora, cliente, trabajador;

    /**
     * Constructor con parametros para la clase Boleta
     *
     * @param folio
     * @param neto
     * @param iva
     * @param costoiva
     * @param mpagos
     * @param fecha
     * @param hora
     * @param cliente
     * @param trabajador
     */

    public Boleta(int folio, int neto, int iva, int costoiva, int mpagos, String fecha, String hora, String cliente, String trabajador) {
        this.folio = folio;
        this.neto = neto;
        this.iva = iva;
        this.costoiva = costoiva;
        this.mpagos = mpagos;
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.trabajador = trabajador;
    }

    /**
     * Constructor sin parametros para la clase Boleta
     */
    public Boleta() {
    }


    /**
     * Metodo accesador para el atributo Folio
     *
     * @return int
     */
    public int getFolio() {
        return folio;
    }

    /**
     * Metodo accesador para el atributo Neto
     *
     * @return int
     */

    public int getNeto() {
        return neto;
    }

    /**
     * Metodo accesador para el atributo Iva
     *
     * @return int
     */
    public int getIva() {
        return iva;
    }

    /**
     * Metodo accesador para el atributo CostoIva
     *
     * @return int
     */

    public int getCostoiva() {
        return costoiva;
    }

    /**
     * Metodo accesador para el atributo Mpagos
     *
     * @return int
     */
    public int getMpagos() {
        return mpagos;
    }

    /**
     * Metodo accesador para el atributo Fecha
     *
     * @return String
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Metodo accesador para el atributo Hora
     *
     * @return String
     */
    public String getHora() {
        return hora;
    }

    /**
     * Metodo accesador para el atributo Cliente
     *
     * @return String
     */

    public String getCliente() {
        return cliente;
    }

    /**
     * Metodo accesador para el atributo Trabajador
     *
     * @return String
     */

    public String getTrabajador() {
        return trabajador;
    }

    /**
     * Metodo mutador para el atributo Folio
     *
     * @param folio int
     */

    public void setFolio(int folio) {
        this.folio = folio;
    }

    /**
     * Metodo mutador para el atributo neto
     *
     * @param neto int
     */

    public void setNeto(int neto) {
        this.neto = neto;
    }

    /**
     * Metodo mutador para el atributo iva
     *
     * @param iva int
     */

    public void setIva(int iva) {
        this.iva = iva;
    }

    /**
     * Metodo mutador para el atributo costoiva
     *
     * @param costoiva int
     */
    public void setCostoiva(int costoiva) {
        this.costoiva = costoiva;
    }

    /**
     * Metodo mutador para el atributo mpagos
     *
     * @param mpagos int
     */

    public void setMpagos(int mpagos) {
        this.mpagos = mpagos;
    }

    /**
     * Metodo mutador para el atributo fecha
     *
     * @param fecha String
     */

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Metodo mutador para el atributo hora
     *
     * @param hora String
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * Metodo mutador para el atributo cliente
     *
     * @param cliente String
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * Metodo mutador para el atributo trabajador
     *
     * @param trabajador String
     */

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    /**
     * Metodo que retorna como cadena los caracteres de todos los atributos de
     * la clase
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Boleta{" + "folio=" + folio + ", neto=" + neto + ", iva=" + iva + ", costoiva=" + costoiva + ", mpagos=" + mpagos + ", fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente + ", trabajador=" + trabajador + '}';
    }

}
