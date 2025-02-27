public abstract class Articulo {

    public String name;
    public boolean gratis;

    public Articulo(String name, boolean gratis) {
        this.name = name;
        this.gratis = gratis;
    }

    public String toString(){
        return name;
    }
}
