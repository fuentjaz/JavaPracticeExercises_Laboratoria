//Primera versión
public class ATM {
    public static int solve(int n) {
        int[] billetes = { 500, 200, 100, 50, 20, 10 };
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < billetes.length; i++) {
            if (n % 10 == 0) {
                if (billetes[i] == n) {
                    sum = 1;
                    count = billetes[i];
                    //System.out.println(billetes[i] + " es igual " + n);
                    break;
                } else if ((billetes[i] + count) < n) {
                    sum += 1;
                    count += billetes[i];
                    //System.out.println("Vuelta: " + i + " Billete** " + billetes[i]);
                } else if (billetes[i] + count == n) {
                    sum += 1;
                    count += billetes[i];
                    //System.out.println("Vuelta: " + i + " Billete** " + billetes[i]);
                    break;
                }
            } else {
                sum = -1;
            }
            
            

    }
    return sum;
}
    // }

    public static void main(String[] args) {
        ATM dollars = new ATM();
        int dollar = dollars.solve(780);
        System.out.println("Result: " + dollar);

    }
}

//Versión corregida
/**
 * ATM Withdrawal Optimizer
 * -------------------------
 * Problema:
 *   Dado un monto n, calcular el número mínimo de billetes
 *   que un cajero automático debe entregar.
 * 
 * Denominaciones soportadas: 500, 200, 100, 50, 20, 10
 * 
 * Corrección:
 *   En el código original, solo se sumaba un billete por cada vuelta,
 *   sin repetir la misma denominación varias veces. Esto generaba
 *   errores en montos grandes (ej: $1000 debía dar 2x500, pero
 *   el algoritmo original solo consideraba un 500).
 * 
 *   Ahora el bucle permite usar cada denominación tantas veces
 *   como sea necesario antes de pasar a la siguiente.
 */
public class ATM {

    /**
     * Calcula el número mínimo de billetes para el monto solicitado.
     *
     * @param n monto solicitado
     * @return número de billetes, o -1 si no es válido
     */
    public static int solve(int n) {
        // Lista de billetes disponibles
        int[] billetes = { 500, 200, 100, 50, 20, 10 };

        // sum = número total de billetes usados
        int sum = 0;

        // Caso inválido: si n no es múltiplo de 10, retornamos -1
        if (n % 10 != 0) {
            return -1;
        }

        // Recorremos todas las denominaciones de billetes
        for (int billete : billetes) {
            // Mientras aún podemos restar billetes de esta denominación al monto
            while (n >= billete) {
                n -= billete; // restamos el billete al monto pendiente
                sum++;        // contamos un billete más
            }
        }

        // Retornamos la cantidad total de billetes usados
        return sum;
    }

    public static void main(String[] args) {
        int amount = 780; // Monto solicitado
        int result = solve(amount);

        if (result != -1) {
            System.out.println("Monto: $" + amount);
            System.out.println("Número mínimo de billetes: " + result);
        } else {
            System.out.println("Error: el monto solicitado no es válido.");
        }
    }
}

/*Ejemplo de ejecución
Monto: $780
Número mínimo de billetes: 5
# (500 + 200 + 50 + 20 + 10)
*/


