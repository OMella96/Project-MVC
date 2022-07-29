package modelo;

/**
 * Clase libro que representa la tabla libro en la BD
 *
 * @since 28-07-2021
 * @author Osvaldo
 * @version 1
 */
public class Libro {

    int id, precio, ano, estado, paginas;
    String isbn, titulo, idioma, publicacion, autores, categoria, editorial;

    /**
     * Constructor sin parametros para la clase libro
     */

    public Libro() {
    }

    /**
     * Constructor con parametros para la clase libro
     *
     * @param id int
     * @param precio int
     * @param ano int
     * @param estado int
     * @param paginas int
     * @param isbn String
     * @param titulo String
     * @param idioma String
     * @param publicacion String
     * @param autores String
     * @param categoria String
     * @param editorial String
     */

    public Libro(int id, int precio, int ano, int estado, int paginas, String isbn, String titulo, String idioma, String publicacion, String autores, String categoria, String editorial) {
        this.id = id;
        this.precio = precio;
        this.ano = ano;
        this.estado = estado;
        this.paginas = paginas;
        this.isbn = isbn;
        this.titulo = titulo;
        this.idioma = idioma;
        this.publicacion = publicacion;
        this.autores = autores;
        this.categoria = categoria;
        this.editorial = editorial;
    }

    /**
     * Metodo accesador para el atributo id
     *
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo accesador para el atributo precio
     *
     * @return int
     */

    public int getPrecio() {
        return precio;
    }

    /**
     * Metodo accesador para el atributo ano
     *
     * @return int
     */
    public int getAno() {
        return ano;
    }

    /**
     * Metodo accesador para el atributo estado
     *
     * @return int
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Metodo accesador para el atributo paginas
     *
     * @return int
     */

    public int getPaginas() {
        return paginas;
    }

    /**
     * Metodo accesador para el atributo isbn
     *
     * @return String
     */

    public String getIsbn() {
        return isbn;
    }

    /**
     * Metodo accesador para el atributo titulo
     *
     * @return String
     */

    public String getTitulo() {
        return titulo;
    }

    /**
     * Metodo accesador para el atributo idioma
     *
     * @return String
     */

    public String getIdioma() {
        return idioma;
    }

    /**
     * Metodo accesador para el atributo publicacion
     *
     * @return String
     */

    public String getPublicacion() {
        return publicacion;
    }

    /**
     * Metodo accesador para el atributo autores
     *
     * @return String
     */

    public String getAutores() {
        return autores;
    }

    /**
     * Metodo accesador para el atributo categoria
     *
     * @return String
     */

    public String getCategoria() {
        return categoria;
    }

    /**
     * Metodo accesador para el atributo editorial
     *
     * @return String
     */

    public String getEditorial() {
        return editorial;
    }

    /**
     * Metodo mutador para el atributo id
     *
     * @param id int
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo mutador para el atributo precio
     *
     * @param precio int
     */

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Metodo mutador para el atributo ano
     *
     * @param ano int
     */

    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * Metodo mutador para el atributo estado
     *
     * @param estado int
     */

    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * Metodo mutador para el atributo paginas
     *
     * @param paginas int
     */

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    /**
     * Metodo mutador para el atributo isbn
     *
     * @param isbn String
     */

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Metodo mutador para el atributo titulo
     *
     * @param titulo String
     */

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo mutador para el atributo idioma
     *
     * @param idioma String
     */

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * Metodo mutador para el atributo publicacion
     *
     * @param publicacion String
     */

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    /**
     * Metodo mutador para el atributo autores
     *
     * @param autores String
     */

    public void setAutores(String autores) {
        this.autores = autores;
    }

    /**
     * Metodo mutador para el atributo categoria
     *
     * @param categoria String
     */

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Metodo mutador para el atributo editorial
     *
     * @param editorial String
     */

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * Metodo que retorna como cadena los caracteres de todos los atributos de
     * la clase
     *
     * @return String
     */

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", precio=" + precio + ", ano=" + ano + ", estado=" + estado + ", paginas=" + paginas + ", isbn=" + isbn + ", titulo=" + titulo + ", idioma=" + idioma + ", publicacion=" + publicacion + ", autores=" + autores + ", categoria=" + categoria + ", editorial=" + editorial + '}';
    }

}
