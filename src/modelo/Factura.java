package modelo;

/**
 * Clase factura que representa la tabla factura en la BD
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class Factura {

    int folio, neto, iva, costo, mpagos;
    String fecha, hora, distribuidor;

    /**
     *
     * @param folio int
     * @param neto int
     * @param iva int
     * @param costo int
     * @param mpagos int
     * @param fecha String
     * @param hora String
     * @param distribuidor String
     */

    public Factura(int folio, int neto, int iva, int costo, int mpagos, String fecha, String hora, String distribuidor) {
        this.folio = folio;
        this.neto = neto;
        this.iva = iva;
        this.costo = costo;
        this.mpagos = mpagos;
        this.fecha = fecha;
        this.hora = hora;
        this.distribuidor = distribuidor;
    }

    /**
     * Constructor sin parametros para la clase factura
     */

    public Factura() {
    }

    /**
     * Metodo accesador para el atributo folio
     *
     * @return int
     */

    public int getFolio() {
        return folio;
    }

    /**
     * Metodo accesador para el atributo neto
     *
     * @return int
     */

    public int getNeto() {
        return neto;
    }

    /**
     * Metodo accesador para el atributo iva
     *
     * @return int
     */

    public int getIva() {
        return iva;
    }

    /**
     * Metodo accesador para el atributo costo
     *
     * @return int
     */

    public int getCosto() {
        return costo;
    }

    /**
     * Metodo accesador para el atributo mpagos
     *
     * @return int
     */

    public int getMpagos() {
        return mpagos;
    }

    /**
     * Metodo accesador para el atributo fecha
     *
     * @return String
     */

    public String getFecha() {
        return fecha;
    }

    /**
     * Metodo accesador para el atributo hora
     *
     * @return String
     */

    public String getHora() {
        return hora;
    }

    /**
     * Metodo accesador para el atributo distribuidor
     *
     * @return String
     */

    public String getDistribuidor() {
        return distribuidor;
    }

    /**
     * Metodo mutador para el atributo folio
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
     * Metodo mutador para el atributo costo
     *
     * @param costo int
     */

    public void setCosto(int costo) {
        this.costo = costo;
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
     * Metodo mutador para el atributo distribuidor
     *
     * @param distribuidor String
     */

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    /**
     * Metodo que retorna como cadena los caracteres de todos los atributos de
     * la clase
     *
     * @return String
     */

    @Override
    public String toString() {
        return "Factura{" + "folio=" + folio + ", neto=" + neto + ", iva=" + iva + ", costo=" + costo + ", mpagos=" + mpagos + ", fecha=" + fecha + ", hora=" + hora + ", distribuidor=" + distribuidor + '}';
    }

}
