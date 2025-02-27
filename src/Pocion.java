public class Pocion extends Articulo{

    public Pocion (String name, boolean gratis){
        super("Poción", false);
    }

    public int nivel;
    public int precioP = nivel * 5;
}
