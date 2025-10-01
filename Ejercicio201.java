import java.util.*;

public class Ejercicio201 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // n es el número de entradas en la agenda
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea vacía después del número

        // Creamos nuestro mapa
        Map<String, String> agenda = new HashMap<>();

        // Creamos un bucle para leer las entradas y agregarlas al mapa
        for (int i = 0; i < n; i++) {
            // Leer el nombre (puede ser compuesto)
            String nombre = scanner.nextLine();
            // Leer el número de teléfono
            String numero = scanner.nextLine();
            // Agregar el nombre y el número al mapa
            agenda.put(nombre, numero);
        }

        // Leer las consultas hasta el final del archivo
        while (scanner.hasNextLine()) {
            String query = scanner.nextLine();
            // Verificar si el nombre está en la agenda
            if (agenda.containsKey(query)) {
                System.out.println(query + "=" + agenda.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        scanner.close();
    }
}