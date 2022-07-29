package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.MPago;

/**
 * Crud, agregar, modificar, eliminar, mostrar, buscar
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class MantenedorMPago {

    /**
     * Metodo que sirve para agregar un mpago recibiendo la clase mpagos con su
     * tipo, detalle
     *
     * @param mpago
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int agregar(MPago mpago) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //prepara datos
        PreparedStatement consulta = con.get().prepareStatement("insert into mpagos values(" + mpago.getTipo() + ",'" + mpago.getDetalle() + "')");
        //ejecutar consultar
        consulta.execute();
        //cerrar conexion
        con.cerrar();
        return 1;
    }

    /**
     * Metodo que modificar un mpago a traves de tipopago
     *
     * @param mpago
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */

    public int modificar(MPago mpago) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion coon = new Conexion();
        //prepara datos
        PreparedStatement consulta = coon.get().prepareStatement("update mpagos set detalle= '" + mpago.getDetalle() + "' where tipopago=" + mpago.getTipo());
        //ejecutar consulta
        consulta.execute();
        //cerrar conexion
        coon.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para eliminar un mpago a traves de tipopago
     *
     * @param tipo
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int eliminar(int tipo) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion conn = new Conexion();
        //preparar datos
        PreparedStatement consulta = conn.get().prepareStatement("delete from mpagos where tipopago=" + tipo);
        //ejecutar consulta
        consulta.execute();
        //cerrar conexion
        conn.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para listar mpagos de la tabla mpago
     *
     * @return MPagos
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public List<MPago> mostrar() throws ClassNotFoundException, SQLException {
         //abrir conexion
        Conexion con = new Conexion();
         //preparar datos
        PreparedStatement consulta = con.get().prepareStatement("select tipopago,detalle from mpagos");
        //ejecutar consulta
        ResultSet resultado = consulta.executeQuery();
        //crea y retorna un List con los datos de la tabla mpago
        List<MPago> MPagos = new ArrayList<>();
        while (resultado.next()) {
            int tipo = resultado.getInt("tipopago");
            String detalle = resultado.getString("detalle");
            MPago mpag = new MPago(tipo, detalle);
            MPagos.add(mpag);

        }
        return MPagos;
    }
    
    public MPago buscar(int tipo) throws ClassNotFoundException, SQLException{
         //abrir conexion
        Conexion con = new Conexion();
        //preparar datos
        PreparedStatement consulta = con.get().prepareStatement
        ("select detalle from mpagos where tipopago="+tipo);
        //ejecutar consulta
        ResultSet resultado =consulta.executeQuery();
        while (resultado.next()) {
            String detalle = resultado.getString("detalle");
            MPago mpa = new MPago(tipo, detalle);
            return mpa;
        }
        return null;
    }
}
