
import java.util.Scanner;

public class EjemploMatrices {
    public static void main(String[] args) {
        int matriz [] [] = new int [3][3];
        Scanner teclado = new Scanner(System.in);

        // Recorrido y carga de matrices
        // length cuenta sólo las filas de un array
        // length[0] cuenta las columnas de una fila
        // f de filas y c de columnas
        for (int f=0; f < matriz.length; f++) {
            for(int c = 0; c < 3; c++) {
                System.out.println("Ingrese el valor para la fila " + f + " columna " + c);
                matriz[f][c] = teclado.nextInt();
            }
        }
        // Recorrido y muestra 
        for (int f=0; f < matriz.length; f++) {
            for(int c = 0; c < matriz[0].length; c++) {
                System.out.println("Fila " + f + " Columna " + c + " Valor " + matriz[f][c]);
    }
}
    teclado.close();
    }
}
