import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class javaList203 {

    public static void main(String[] args) {
        //Declaramos un Scanner para leer los datos
        Scanner scanner = new Scanner(System.in);
        
        //Paso 1. n es un entero con el numero de elementos de la lista
        int n = scanner.nextInt();

        //Paso 2. l es una lista que contiene n elementos separados
        List<Integer> list = new ArrayList<>();
        //bucle for para insertar los elementos leidos con scanner
        for(int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        //Paso 3. q contiene un entero con el numero de requerimientos
        int q = scanner.nextInt();

        //Paso 4. Procesamos cada requerimiento
        for(int j = 0; j < q; j++) {
            // leemos requerie que describe el requerimiento
            String queryType = scanner.next();

            if(queryType.equals("Insert")) {
                // x es el indice - y es el numero a insertar
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                list.add(x, y);
            } else if (queryType.equals("Delete")) {
                int x = scanner.nextInt();
                list.remove(x);
                }
            }
        // Imprimimos la lista final
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        // Cerrar el Scanner
        scanner.close();
    }
}
     