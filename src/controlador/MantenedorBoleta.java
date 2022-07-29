package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Boleta;

/**
 * Crud, agregar, modificar, eliminar, mostrar, buscar
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class MantenedorBoleta {

    /**
     * Metodo que sirve para agregar una boleta recibiendo la clase boleta con
     * su folio, neto, iva, costoiva, fecha, hora, cliente, mpagos, trabajador
     *
     * @param boleta
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int agregar(Boleta boleta) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //prepara los datos
        PreparedStatement consulta = con.get().prepareStatement("insert into boleta values(" + boleta.getFolio() + "," + boleta.getNeto() + "," + boleta.getIva() + "," + boleta.getCostoiva() + ",'" + boleta.getFecha() + "','" + boleta.getHora() + "','" + boleta.getCliente() + "'," + boleta.getMpagos() + ",'" + boleta.getTrabajador() + "')");
        //ejecuta consulta
        consulta.execute();
        //cerrar conexion
        con.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para modificar una boleta a traves del folio
     *
     * @param boleta
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */

    public int modificar(Boleta boleta) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion coon = new Conexion();
        //prepara datos
        PreparedStatement consulta = coon.get().prepareStatement("update boleta set precio_neto=" + boleta.getNeto() + ", precio_iva=" + boleta.getIva() + ", costo_iva=" + boleta.getCostoiva() + ", fecha_venta='" + boleta.getFecha() + "', hora_venta=" + boleta.getHora() + ", cliente_rut=" + boleta.getCliente() + ", mpagos_tipopago=" + boleta.getMpagos() + ", trabajador_rut=" + boleta.getTrabajador() + " where folio=" + boleta.getFolio());
        //ejecuta consulta
        consulta.execute();
        //cerrar conexion
        coon.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para eliminar una boleta a traves del folio
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
        PreparedStatement consulta = conn.get().prepareStatement("delete from boleta where folio=" + folio);
        //ejecuta consulta
        consulta.execute();
        //cerrar conexion
        conn.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para listar boletas de la tabla boleta
     *
     * @return boletas
     * @throws ClassNotFoundException
     * @throws SQLException
     */

    public List<Boleta> mostrar() throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //prepara consulta
        PreparedStatement consulta = con.get().prepareStatement("select folio,precio_neto,precio_iva,costo_iva,fecha_venta,hora_venta,cliente_rut,mpagos_tipopago,trabajador_rut from boleta");
        //ejecuta consulta
        ResultSet resultado = consulta.executeQuery();
        //crea y retorna una lista con los datos de la tabla Boletas
        List<Boleta> Boletas = new ArrayList<>();
        while (resultado.next()) {
            int folio = resultado.getInt("folio");
            int precio_neto = resultado.getInt("precio_neto");
            int precio_iva = resultado.getInt("precio_iva");
            int costo_iva = resultado.getInt("costo_iva");
            String fecha_venta = resultado.getString("fecha_venta");
            String hora_venta = resultado.getString("hora_venta");
            String cliente_rut = resultado.getString("cliente_rut");
            int mpagos = resultado.getInt("mpagos_tipopago");
            String trabajador_rut = resultado.getString("trabajador_rut");
            Boleta bol = new Boleta(folio, folio, mpagos, costo_iva, mpagos, fecha_venta, hora_venta, cliente_rut, trabajador_rut);
            Boletas.add(bol);

        }
        return Boletas;
    }
    
    public Boleta buscar(int folio) throws ClassNotFoundException, SQLException{
        //abrir conexion
        Conexion con = new Conexion();
        //prepara consulta
        PreparedStatement consulta = con.get().prepareStatement
        ("select precio_neto,precio_iva,costo_iva,fecha_venta,hora_venta,cliente_rut,mpagos_tipopago,trabajador_rut from boleta where folio="+folio);
        //ejecuta consulta
        ResultSet resultado =consulta.executeQuery();
        while (resultado.next()) {
            int precio_neto = resultado.getInt("precio_neto");
            int precio_iva = resultado.getInt("precio_iva");
            int costo_iva = resultado.getInt("costo_iva");
            String fecha_venta = resultado.getString("fecha_venta");
            String hora_venta = resultado.getString("hora_venta");
            String cliente_rut = resultado.getString("cliente_rut");
            int mpagos = resultado.getInt("mpagos_tipopago");
            String trabajador_rut = resultado.getString("trabajador_rut");
            Boleta bol = new Boleta(folio, folio, mpagos, costo_iva, mpagos, fecha_venta, hora_venta, cliente_rut, trabajador_rut);
            return bol;
        }
        return null;
    }

}
