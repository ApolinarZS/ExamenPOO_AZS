import java.util.Scanner;

public class TiendaPoemonTPV {

    public static void main (String[] args){


        Scanner scanner = new Scanner(System.in);
        int option;
        boolean salir = false;

        menu();
        option = scanner.nextInt();
        do{
            try{
                switch(option){
                    case 1->{

                    }
                    case 2->{

                    }
                    case 3->{

                    }
                    case 4->{

                    }
                    case 5->{

                    }
                    case 6->{

                    }
                    case 7->{
                        System.out.println("Has salido de la libreria");
                        salir = true;
                    }
                }

            } catch (NumberFormatException ex){
                System.out.println("Carácter inválido: "+ex.getMessage());
            }
            option = scanner.nextInt();

        } while(!salir);
    }
    public static void menu(){
        System.out.println("---TiendaPokemonTPV---\n" +
                "(1) Añadir poción al ticket.\n" +
                "(2) Añadir pokébola al ticket.\n" +
                "(3) Añadir accesorio al ticket.\n" +
                "(4) Borrar el artículo del ticket (por posición en el ticket.\n" +
                "(5) Mostrar todos los artículos del ticket\n" +
                "(6) Mostrar el total.\n" +
                "(7) Salir");
    }
}
