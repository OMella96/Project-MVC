package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Factura;

/**
 * Crud, agregar, modificar, eliminar, mostrar, buscar
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class MantenedorFactura {

    /**
     * Metodo que sirve para agregar una factura recibiendo la clase factura con
     * su folio, neto, iva, costo, fecha, hora, distribuidor, mpagos
     *
     * @param factura
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */

    public int agregar(Factura factura) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //prepara datos
        PreparedStatement consulta = con.get().prepareStatement("insert into factura values(" + factura.getFolio() + "," + factura.getNeto() + "," + factura.getIva() + "," + factura.getCosto() + ",'" + factura.getFecha() + "','" + factura.getHora() + "','" + factura.getDistribuidor() + "'," + factura.getMpagos() + ")");
        //ejecutar consulta
        consulta.execute();
        //cerrar conexion
        con.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para modificar una factura a traves de folio
     *
     * @param factura
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */

    public int modificar(Factura factura) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion coon = new Conexion();
        //prepara datos
        PreparedStatement consulta = coon.get().prepareStatement("update factura set precio_neto= " + factura.getNeto() + ",precio_iva=" + factura.getIva() + ",costo_iva=" + factura.getCosto() + ",fecha_compra='" + factura.getFecha() + "',hora_compra='" + factura.getHora() + "',distribuidor_rut='" + factura.getDistribuidor() + "',mpagos_tipopago=" + factura.getMpagos() + " where folio=" + factura.getFolio());
        //ejecutar consulta
        consulta.execute();
        //cerrar conexion
        coon.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para eliminar una factura a traves de folio
     *
     * @param folio
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int eliminar(int folio) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion conn = new Conexion();
        //prepara datos
        PreparedStatement consulta = conn.get().prepareStatement("delete from factura where folio=" + folio);
        //ejecutar consulta
        consulta.execute();
        //cerrar conexion
        conn.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para listar facturas de la tabla factura
     *
     * @return Autores
     * @throws ClassNotFoundException
     * @throws SQLException
     */

    public List<Factura> mostrar() throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //prepara consulta
        PreparedStatement consulta = con.get().prepareStatement("select folio,precio_neto,precio_iva,costo_iva,fecha_compra,hora_compra,distribuidor_rut,mpagos_tipopago from factura");
        //ejecuta consulta
        ResultSet resultado = consulta.executeQuery();
        //crea y retorna una list con los datos de la tabla Factura
        List<Factura> Facturas = new ArrayList<>();
        while (resultado.next()) {
            int folio = resultado.getInt("folio");
            int neto = resultado.getInt("precio_neto");
            int iva = resultado.getInt("precio_iva");
            int costoiva = resultado.getInt("costo_iva");
            String fecha_compra = resultado.getString("fecha_compra");
            String hora_compra = resultado.getString("hora_compra");
            String distribuidor_rut = resultado.getString("distribuidor_rut");
            int mpagos = resultado.getInt("mpagos_tipopago");
            Factura fac = new Factura(folio, neto, iva, costoiva, mpagos, fecha_compra, hora_compra, distribuidor_rut);
            Facturas.add(fac);

        }
        return Facturas;
    }
    
    public Factura buscar(int folio) throws ClassNotFoundException, SQLException{
        //abrir conexion
        Conexion con = new Conexion();
        //prepara consulta
        PreparedStatement consulta = con.get().prepareStatement
        ("select precio_neto,precio_iva,costo_iva,fecha_compra,hora_compra,distribuidor_rut,mpagos_tipopago from factura where folio="+folio);
        //ejecuta consulta
        ResultSet resultado =consulta.executeQuery();
        while (resultado.next()) {
            int precio_neto = resultado.getInt("precio_neto");
            int precio_iva = resultado.getInt("precio_iva");
            int costo_iva = resultado.getInt("costo_iva");
            String fecha_compra = resultado.getString("fecha_compra");
            String hora_compra = resultado.getString("hora_compra");
            String distribuidor_rut = resultado.getString("distribuidor_rut");
            int mpagos = resultado.getInt("mpagos_tipopago");
            Factura fac = new Factura(folio, folio, mpagos, folio, mpagos, fecha_compra, hora_compra, distribuidor_rut);
            return fac;
        }
        return null;
    }
}
