
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner lista = new Scanner(System.in);
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        System.out.println("Ingrese la cantidad de datos que deseada: ");
        int cantidad  = lista.nextInt();
        lista.nextLine();


        for (int i = 0; i < cantidad; i++ ){
            System.out.println("\nIngrese los datos de la persona " + (i + 1) + ":");
            System.out.print("DNI: ");
            String dni = lista.nextLine();

            System.out.print("Nombre: ");
            String nombre = lista.nextLine();

            Persona persona = new Persona(dni, nombre);
            listaPersonas.add(persona);
        }
        System.out.println("\nDatos ingresados:");
        for (Persona persona : listaPersonas) {
            System.out.println("Dni:" + persona.getDni());
            System.out.println("Nombre:" + persona.getNombre());
            System.out.println("---------------");

        }       }
    }

