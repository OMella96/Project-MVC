package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Estado;

/**
 * Crud, agregar, modificar, eliminar, mostrar, buscar
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class MantenedorEstado {

    /**
     * Metodo que sirve para agregar un estado recibiendo la clase estado con su
     * tipo, detalle
     *
     * @param estado
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int agregar(Estado estado) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //prepara datos
        PreparedStatement consulta = con.get().prepareStatement("insert into estado values(" + estado.getTipo() + ",'" + estado.getDetalle() + "')");
        //ejecuta consulta
        consulta.execute();
        //cerrar conexion
        con.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para modificar un estado a traves de tipo_estado
     *
     * @param estado
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */

    public int modificar(Estado estado) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion coon = new Conexion();
        //prepara datos
        PreparedStatement consulta = coon.get().prepareStatement("update estado set detalle='" + estado.getDetalle() + "' where tipo_estado=" + estado.getTipo());
        //ejecuta consulta
        consulta.execute();
        //cerrar conexion
        coon.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para eliminar un estado a traves de tipo_estado
     *
     * @param tipo
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */

    public int eliminar(int tipo) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion conn = new Conexion();
        //prepara datos
        PreparedStatement consulta = conn.get().prepareStatement("delete from estado where tipo_estado=" + tipo);
        //ejecutar consulta
        consulta.execute();
        //cerrar conexion
        conn.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para listar estados de la tabla estado
     *
     * @return Autores
     * @throws ClassNotFoundException
     * @throws SQLException
     */

    public List<Estado> mostrar() throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //preparar consulta
        PreparedStatement consulta = con.get().prepareStatement("select tipo_estado,detalle from estado");
        //ejecuta consulta
        ResultSet resultado = consulta.executeQuery();
        //crea y retorna una lista con los datos de la tabla Estado
        List<Estado> Estados = new ArrayList<>();
        while (resultado.next()) {
            int tipo_estado = resultado.getInt("tipo_estado");
            String detalle = resultado.getString("detalle");
            Estado est = new Estado(tipo_estado, detalle);
            Estados.add(est);

        }
        return Estados;
    }
    
     public Estado buscar(int tipo) throws ClassNotFoundException, SQLException{
        //abrir conexion
        Conexion con = new Conexion();
        //prepara consulta
        PreparedStatement consulta = con.get().prepareStatement
        ("select detalle from estado where tipo_estado="+tipo);
        //ejecuta consulta
        ResultSet resultado =consulta.executeQuery();
        while (resultado.next()) {
            String detalle = resultado.getString("detalle");
            Estado est = new Estado(tipo, detalle);
            return est;
        }
        return null;
    }

}
