package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Distribuidor;

/**
 * Crud, agregar, modificar, eliminar, mostrar, buscar
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class MantenedorDistribuidor {

    /**
     * Metodo que sirve para agregar un distribuidor recibiendo la clase
     * distribuidor con su rut, nombre, ano, fono, direccion
     *
     * @param distribuidor
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int agregar(Distribuidor distribuidor) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //prepara datos
        PreparedStatement consulta = con.get().prepareStatement("insert into distribuidor values('" + distribuidor.getRut() + "','" + distribuidor.getNombre() + "'," + distribuidor.getAno() + "," + distribuidor.getFono() + ",'" + distribuidor.getDireccion() + "')");
        //ejecuta consulta
        consulta.execute();
        //cerrar conexion
        con.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para modificar un distribuidor a traves del rut
     *
     * @param distribuidor
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */

    public int modificar(Distribuidor distribuidor) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion coon = new Conexion();
        //prepara datos
        PreparedStatement consulta = coon.get().prepareStatement("update distribuidor set nombre_empresa= '" + distribuidor.getNombre() + "',ano_venta=" + distribuidor.getAno() + ",fono=" + distribuidor.getFono() + ",direccion_iddireccion='" + distribuidor.getDireccion() + "' where rut=" + distribuidor.getRut());
        //ejecuta consulta
        consulta.execute();
        //cerrar conexion
        coon.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para eliminar un distribuidor a traves del rut
     *
     * @param rut
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int eliminar(String rut) throws ClassNotFoundException, SQLException {
        //abrir conexion    
        Conexion conn = new Conexion();
        //prepara datos
        PreparedStatement consulta = conn.get().prepareStatement("delete from distribuidor where rut=" + rut);
        //ejecuta consulta
        consulta.execute();
        //cerrar conexion
        conn.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para listar distribuidores de la tabla distribuidor
     *
     * @return Distribuidores
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public List<Distribuidor> mostrar() throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //prepara consulta
        PreparedStatement consulta = con.get().prepareStatement("select rut,nombre_empresa,ano_venta,fono,direccion_iddireccion from distribuidor");
        //ejecuta consulta
        ResultSet resultado = consulta.executeQuery();
        //crea y retorna una lista con los datos de la tabla Distribuidor
        List<Distribuidor> Distribuidors = new ArrayList<>();
        while (resultado.next()) {
            String rut = resultado.getString("rut");
            String nombre_empresa = resultado.getString("nombre_empresa");
            int ano = resultado.getInt("ano_venta");
            int fono = resultado.getInt("fono");
            String direccion = resultado.getString("direccion_iddireccion");
            Distribuidor dis = new Distribuidor(fono, ano, rut, nombre_empresa, direccion);
            Distribuidors.add(dis);

        }
        return Distribuidors;
    }
    
    public Distribuidor buscar(String rut) throws ClassNotFoundException, SQLException{
        //abrir conexion
        Conexion con = new Conexion();
        //prepara consulta
        PreparedStatement consulta = con.get().prepareStatement
        ("select nombre_empresa,ano_venta,fono,direccion_iddireccion from distribuidor where rut="+rut);
        //ejecuta consulta
        ResultSet resultado =consulta.executeQuery();
        while (resultado.next()) {
            String nombreemp = resultado.getString("nombre_empresa");
            int anoventa = resultado.getInt("ano_venta");
            int fono = resultado.getInt("fono");
            String direccion = resultado.getString("direccion_iddireccion");
            Distribuidor dis = new Distribuidor(fono, fono, rut, nombreemp, direccion);
            return dis;
        }
        return null;
    }
}
