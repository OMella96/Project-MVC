package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Idioma;

/**
 * Crud, agregar, modificar, eliminar, mostrar, buscar
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class MantenedorIdioma {

    /**
     * Metodo que sirve para agregar un idioma a la clase idioma con su id,
     * detalle
     *
     * @param idioma
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int agregar(Idioma idioma) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //preparar datos
        PreparedStatement consulta = con.get().prepareStatement("insert into idioma values(" + idioma.getId() + ",'" + idioma.getDetalle() + "')");
        //ejecutar consulta
        consulta.execute();
        //cerrar conexion
        con.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para modificar un idioma a traves de la id
     *
     * @param idioma
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int modificar(Idioma idioma) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion coon = new Conexion();
        //preparar datos
        PreparedStatement consulta = coon.get().prepareStatement("update idioma set detalle_idioma= '" + idioma.getDetalle() + "' where id_idioma=" + idioma.getId());
        //ejecutar consulta
        consulta.execute();
        //cerrar conexion
        coon.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para eliminar a un idioma a traves de la id
     *
     * @param id
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int eliminar(int id) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion conn = new Conexion();
        //preparar datos
        PreparedStatement consulta = conn.get().prepareStatement("delete from idioma where id_idioma=" + id);
        //ejecutar consulta
        consulta.execute();
        //cerrar conexion
        conn.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para listar idiomas de la tabla idioma
     *
     * @return idiomas
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public List<Idioma> mostrar() throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //prepara consulta
        PreparedStatement consulta = con.get().prepareStatement("select id_idioma,detalle_idioma from idioma");
        //ejecuta consulta
        ResultSet resultado = consulta.executeQuery();
        //crea y retorna una list con los datos de la tabla Idioma
        List<Idioma> Idiomas = new ArrayList<>();
        while (resultado.next()) {
            int id = resultado.getInt("id_idioma");
            String detalle = resultado.getString("detalle_idioma");
            Idioma idi = new Idioma(id, detalle);
            Idiomas.add(idi);

        }
        return Idiomas;
    }

    public Idioma buscar(int id) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //prepara consulta
        PreparedStatement consulta = con.get().prepareStatement("select detalle_idioma from idioma where id_idioma=" + id);
        //ejecuta consulta
        ResultSet resultado = consulta.executeQuery();
        while (resultado.next()) {
            String detalle = resultado.getString("detalle_idioma");
            Idioma idi = new Idioma(id, detalle);
            return idi;
        }
        return null;
    }
}
