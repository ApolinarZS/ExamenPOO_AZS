public class Libro {

    public static String isbn ;
    public static String nombre;
    public static String autor;
    private int nPaginas;
    private String genero;
    private String formato;


    public Libro(String isbn, String nombre, String autor) {

        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
    }

    public String toString(int pesoLibro){
        return "Titulo: "+nombre+" || Autor: "+autor+" || Peso del Libro:"+pesoLibro+".";
    }

    public int peso(String formato, int nPaginas) throws Exception{

        int pesoLibro;//peso total del libro
        int pesoPaginas;//peso de las paginas del libro

        try{
            if (formato.equals("tapa dura")){
                pesoPaginas = nPaginas * 2;
                pesoLibro = 50 + nPaginas;
                return pesoLibro;

            } else if (formato.equals("tapa blanda")){
                pesoPaginas = nPaginas * 2;
                pesoLibro = 20 + nPaginas;
                return pesoLibro;

            } else if (formato.equals("bolsillo")){
                pesoPaginas = nPaginas;
                pesoLibro = 10 + pesoPaginas;
                return pesoLibro;

            }
        } catch (NullPointerException ex){
            System.out.println("Formato inválido" +ex.getMessage());
        } finally{ return 0;}
    }

    public static void setIsbn(String isbn) {
        Libro.isbn = isbn;
    }

    public static void setNombre(String nombre) {
        Libro.nombre = nombre;
    }

    public static void setAutor(String autor) {
        Libro.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
