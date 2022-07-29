package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Editorial;

/**
 * Crud, agregar, modificar, eliminar, mostrar, buscar
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class MantenedorEditorial {

    /**
     * Metodo que sirve para agregar una Editorial recibiendo la clase editorial
     * con su id, detalle
     *
     * @param editorial
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int agregar(Editorial editorial) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //prepara los datos
        PreparedStatement consulta = con.get().prepareStatement("insert into editorial values(" + editorial.getId() + ",'" + editorial.getDetalle() + "')");
        //ejecutar consulta
        consulta.execute();
        //cerrar conexion
        con.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para modificar un Editorial a traves de la id_editorial
     *
     * @param editorial
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */

    public int modificar(Editorial editorial) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion coon = new Conexion();
        //prepara datos
        PreparedStatement consulta = coon.get().prepareStatement("update editorial set detalle= '" + editorial.getDetalle() + "' where id_editorial=" + editorial.getId());
        //ejecuta la consulta
        consulta.execute();
        //cerrar conexion
        coon.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para eliminar un autor a traves de la id_editorial
     *
     * @param id
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int eliminar(int id) throws ClassNotFoundException, SQLException {
        //abrir conexion    
        Conexion conn = new Conexion();
        //prepara datos
        PreparedStatement consulta = conn.get().prepareStatement("delete from editorial where id_editorial=" + id);
        //ejecuta consulta
        consulta.execute();
        //cerrar conexion
        conn.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para listar Editorials de la tabla editorial
     *
     * @return Editorials
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public List<Editorial> mostrar() throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //prepara consulta
        PreparedStatement consulta = con.get().prepareStatement("select id_editorial,detalle from editorial");
        //ejecuta consulta
        ResultSet resultado = consulta.executeQuery();
        //crea y retorna una lista con los datos de la tabla Editorial
        List<Editorial> Editorials = new ArrayList<>();
        while (resultado.next()) {
            int id = resultado.getInt("id_editorial");
            String detalle = resultado.getString("detalle");
            Editorial edi = new Editorial(id, detalle);
            Editorials.add(edi);

        }
        return Editorials;
    }
    
    public Editorial buscar(int id) throws ClassNotFoundException, SQLException{
        //abrir conexio n  
        Conexion con = new Conexion();
        //prepara consulta
        PreparedStatement consulta = con.get().prepareStatement
        ("select detalle from editorial where id_editorial="+id);
        //ejecuta consulta
        ResultSet resultado =consulta.executeQuery();
        while (resultado.next()) {
            String detalle = resultado.getString("detalle");
            Editorial edi = new Editorial(id, detalle);
            return edi;
        }
        return null;
    }

}
