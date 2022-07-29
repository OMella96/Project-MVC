package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Libro;

/**
 * Crud, agregar, modificar, eliminar, mostrar, buscar
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class MantenedorLibro {

    /**
     * Metodo que sirve para agregar un libro recibiendo la clase libro con su
     * id, isbn, titulo, paginas, precio, ano, idioma, publicacion,autores,
     * categorias, editorial, estado
     *
     * @param libro
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int agregar(Libro libro) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //preparar datos
        PreparedStatement consulta = con.get().prepareStatement("insert into libro values(" + libro.getId() + ",'" + libro.getIsbn() + "','" + libro.getTitulo() + "'," + libro.getPaginas() + "," + libro.getPrecio() + "," + libro.getAno() + ",'" + libro.getIdioma() + "','" + libro.getPublicacion() + "','" + libro.getAutores() + "','" + libro.getCategoria() + "','" + libro.getEditorial() + "'," + libro.getEstado() + ")");
        //ejecutar consulta
        consulta.execute();
        //cerrar conexion
        con.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para modificar un libro a traves de id
     *
     * @param libro
     * @return 1
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int modificar(Libro libro) throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion coon = new Conexion();
        //preparar datos
        PreparedStatement consulta = coon.get().prepareStatement("update libro set isbn='" + libro.getIsbn() + "',titulo='" + libro.getTitulo() + "',numero_paginas=" + libro.getPaginas() + ",precio=" + libro.getPrecio() + ",ano=" + libro.getAno() + ",idioma='" + libro.getIdioma() + "',publicacion='" + libro.getPublicacion() + "',autores='" + libro.getAutores() + "',categorias='" + libro.getCategoria() + "',editorial_id_editorial='" + libro.getEditorial() + "',estado_tipo_estado=" + libro.getEstado() + " where id_libro=" + libro.getId());
        //ejecutar consulta
        consulta.execute();
        //cerrar conexion
        coon.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para eliminar a traves de id
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
        PreparedStatement consulta = conn.get().prepareStatement("delete from libro where id_libro=" + id);
        //ejecutar consulta
        consulta.execute();
        //cerrar conexion
        conn.cerrar();
        return 1;
    }

    /**
     * Metodo que sirve para listar libros de la tabla libro
     *
     * @return libros
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public List<Libro> mostrar() throws ClassNotFoundException, SQLException {
        //abrir conexion
        Conexion con = new Conexion();
        //prepara consulta
        PreparedStatement consulta = con.get().prepareStatement("select id_libro,isbn,titulo,numero_paginas,precio,ano,idioma,publicacion,autores,categorias,editorial_id_editorial,estado_tipo_estado from libro");
        //ejecuta consulta
        ResultSet resultado = consulta.executeQuery();
        //crea y retorna una lista con los datos de la tabla Libro
        List<Libro> Libros = new ArrayList<>();
        while (resultado.next()) {
            int id = resultado.getInt("id_libro");
            String isbn = resultado.getString("isbn");
            String titulo = resultado.getString("titulo");
            int paginas = resultado.getInt("numero_paginas");
            int precio = resultado.getInt("precio");
            int ano = resultado.getInt("ano");
            String idioma = resultado.getString("idioma");
            String publicacion = resultado.getString("publicacion");
            String autores = resultado.getString("autores");
            String categorias = resultado.getString("categorias");
            String editorial = resultado.getString("editorial_id_editorial");
            int estado = resultado.getInt("estado_tipo_estado");
            Libro lib = new Libro(id, precio, ano, estado, paginas, isbn, titulo, idioma, publicacion, autores, categorias, editorial);
            Libros.add(lib);

        }
        return Libros;
    }

    public Libro buscar(int id) throws ClassNotFoundException, SQLException {
        //abre conexion
        Conexion con = new Conexion();
        //prepara consulta
        PreparedStatement consulta = con.get().prepareStatement("select isbn,titulo,numero_paginas,precio,ano,idioma,publicacion,autores,categorias,editorial_id_editorial,estado_tipo_estado from libro where id_libro=" + id);
        //ejecuta consulta
        ResultSet resultado = consulta.executeQuery();
        while (resultado.next()) {
            String isbn = resultado.getString("isbn");
            String titulo = resultado.getString("titulo");
            int paginas = resultado.getInt("numero_paginas");
            int precio = resultado.getInt("precio");
            int ano = resultado.getInt("ano");
            String idioma = resultado.getString("idioma");
            String publicacion = resultado.getString("publicacion");
            String autores = resultado.getString("autores");
            String categorias = resultado.getString("categorias");
            String editorial = resultado.getString("editorial_id_editorial");
            int estado = resultado.getInt("estado_tipo_estado");
            Libro lib = new Libro(id, precio, ano, estado, paginas, isbn, titulo, idioma, publicacion, autores, categorias, editorial);
            return lib;
        }
        return null;
    }
}
