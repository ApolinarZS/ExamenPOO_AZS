import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeLibros{

    public <libreria> void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int option;
        boolean salir = false;

        //añado dos libros a la librería
        Libro libro1 = new Libro("1234567","nacidos de la bruma" ,"brandon sanderson" );
        Libro libro2 = new Libro("2345678", "elantris","brandon sanderson");
        ArrayList<libreria> libros = new ArrayList<>();
        libros.add((libreria) libro1);
        libros.add((libreria) libro2);

        //llamamos al menu
        menu();
        option = scanner.nextInt();
        do{
            try{
                switch(option){
                case 1->{
                    Libro libro3 = new Libro("","", "");
                    System.out.println("Introduce el ISBN");
                    libro3.isbn = scanner.nextLine().trim().toLowerCase();
                    System.out.println("Introduce el nombre");
                    libro3.nombre = scanner.nextLine().trim().toLowerCase();
                    System.out.println("Introduce el autor");
                    libro3.autor = scanner.nextLine().trim().toLowerCase();
                }
                case 2->{

                }
                case 3->{

                }
                case 4->{

                }
                case 5->{
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
        System.out.println("---LIBRERIA---\n" +
                "(1) Introducir Libro.\n" +
                "(2) Mostrar Información de un libro(por ISBN).\n" +
                "(3) Modificar el género de un libro(por ISBN).\n" +
                "(4) Buscar todos los libros de un autor.\n" +
                "(5) Salir");
    }
}

