package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Autor;

/**
 * Crud, agregar, modificar, eliminar, mostrar, buscar
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class MantenedorAutor {

    /**
     * Metodo que sirve para agregar un autor recibiendo la clase autor con su
     * id, nombre, apellidom, apellidop
     *
     * @param autor
     * @return 1 si se agrego
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int agregar(Autor autor) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //prepara los datos
        PreparedStatement consulta = con.get().prepareStatement("insert into autor values(" + autor.getIdautor() + ",'" + autor.getNombre() + "','" + autor.getApellidom() + "','" + autor.getApellidop() + "')");
        //ejecutar consulta
        consulta.execute();
        //cerrar conexion
        con.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para modificar un autor a traves de la idautor
     *
     * @param autor
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int modificar(Autor autor) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion coon = new Conexion();
        //prepara los datos
        PreparedStatement consulta = coon.get().prepareStatement("update autor set nombre= '" + autor.getNombre() + "', apellidom='" + autor.getApellidom() + "', apellidop='" + autor.getApellidop() + "' where idautor=" + autor.getIdautor());
        //ejecuta la consulta
        consulta.execute();
        //cerrar conexion
        coon.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para eliminar un autor a traves de la idautor
     *
     * @param idautor
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int eliminar(int idautor) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion conn = new Conexion();
        //prepara datos
        PreparedStatement consulta = conn.get().prepareStatement("delete from autor where idautor=" + idautor);
        //ejecuta la consulta
        consulta.execute();
        //cerrar conexion
        conn.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para listar autores de la tabla autor
     *
     * @return Autores
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public List<Autor> mostrar() throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //prepara consulta
        PreparedStatement consulta = con.get().prepareStatement("select idautor,nombre,apellidom,apellidop from autor");
        //ejecuta consulta
        ResultSet resultado = consulta.executeQuery();
        //crea y retorna una lista con los datos de la tabla Autor
        List<Autor> Autores = new ArrayList<>();
        while (resultado.next()) {
            int id = resultado.getInt("idautor");
            String nombre = resultado.getString("nombre");
            String apellidom = resultado.getString("apellidom");
            String apellidop = resultado.getString("apellidop");
            Autor aut = new Autor(id, nombre, apellidom, apellidop);
            Autores.add(aut);

        }
        return Autores;
    }
    
     public Autor buscar(int id) throws ClassNotFoundException, SQLException{
        //abrir conexion
        Conexion con = new Conexion();
        //prepara consulta
        PreparedStatement consulta = con.get().prepareStatement
        ("select nombre,apellidom,apellidop from autor where idautor="+id);
        //ejecuta consulta
        ResultSet resultado =consulta.executeQuery();
        while (resultado.next()) {
            String nombre=resultado.getString("nombre");
            String apellidom=resultado.getString("apellidom");
            String apellidop=resultado.getString("apellidop");
            Autor aut = new Autor(id, nombre, apellidom, apellidop);
            return aut;
        }
        return null;
    }
}
