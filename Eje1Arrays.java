import java.util.Scanner;

public class Eje1Arrays {
    public static void main(String[] args) {
        // Paso 1: Declarar variables
        String nombres[] = new String[8];
        String respuesta;
        Scanner teclado = new Scanner(System.in);

        // Paso 2: Leer los datos y agregarlos al arreglo
        System.out.println("Ingrese los nombres de los invitados: ");
        for(int i = 0; i < nombres.length; i++) {
            nombres[i] = teclado.next();
        }

        System.out.println("¿Quieres ver el nombre de los invitados?");
        respuesta = teclado.next();
        if (respuesta.equalsIgnoreCase("Si")) {
            // Paso 3: Mostrar los datos ingresados
            for(int i = 0; i < nombres.length; i++) {
                System.out.println("Los nombres de los invitados son: " + nombres[i]);
        }  
        }
        else {
            System.out.println("Adiós");
        }
        teclado.close();
    }

}