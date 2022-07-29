package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;

/**
 * Crud, agregar, modificar, eliminar, mostrar, buscar
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class MantenedorCategoria {

    /**
     * Metodo que sirve para agregar un autor recibiendo la clase autor con su
     * tipo, descripcion
     *
     * @param categoria
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int agregar(Categoria categoria) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //prepara datos
        PreparedStatement consulta = con.get().prepareStatement("insert into categorias values(" + categoria.getTipo() + ",'" + categoria.getDescripcion() + "')");
        //ejecuta consulta
        consulta.execute();
        //cerrar conexion
        con.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para modificar un autor a traves de tipo_categoria
     *
     * @param categoria
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */

    public int modificar(Categoria categoria) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion coon = new Conexion();
        //prepara datos
        PreparedStatement consulta = coon.get().prepareStatement("update categorias set descripcion= '" + categoria.getDescripcion() + "' where tipo_categoria=" + categoria.getTipo());
        //ejecuta consulta
        consulta.execute();
        //cerrar conexion
        coon.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para eliminar un autor a traves de tipo_categoria
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
        PreparedStatement consulta = conn.get().prepareStatement("delete from categorias where tipo=" + tipo);
        //ejecutar consulta
        consulta.execute();
        //cerrar conexion
        conn.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para listar categorias de la tabla Categoria
     *
     * @return Categorias
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public List<Categoria> mostrar() throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //prepara consulta
        PreparedStatement consulta = con.get().prepareStatement("select tipo_categoria,descripcion from categorias");
        //ejecuta consulta
        ResultSet resultado = consulta.executeQuery();
        //crea y retorna una lista con los datos de la tabla Categoria
        List<Categoria> Categorias = new ArrayList<>();
        while (resultado.next()) {
            int tipo = resultado.getInt("tipo_categoria");
            String descripcion = resultado.getString("descripcion");
            Categoria cat = new Categoria(tipo, descripcion);
            Categorias.add(cat);

        }
        return Categorias;
    }
    
    public Categoria buscar(int tipo) throws ClassNotFoundException, SQLException{
        //abrir conexion
        Conexion con = new Conexion();
        //prepara consulta
        PreparedStatement consulta = con.get().prepareStatement
        ("select descripcion from categorias where tipo_categoria="+tipo);
        //ejecuta consulta
        ResultSet resultado =consulta.executeQuery();
        while (resultado.next()) {
            String descripcion = resultado.getString("descripcion");
            Categoria cat = new Categoria(tipo, descripcion);
            return cat;
        }
        return null;
    }

}
