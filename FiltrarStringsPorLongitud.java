import java.util.ArrayList;
import java.util.List;

public class FiltrarStringsPorLongitud {
    public List<String> masDeCinco(String... palabras){
        List<String> listaDePalabras = new ArrayList<>();

        for(String palabra : palabras) {
            if(palabra.length() > 5){
                listaDePalabras.add(palabra);
            }
        }
       return listaDePalabras;
    }


    public static void main(String[] args){
        FiltrarStringsPorLongitud object = new FiltrarStringsPorLongitud();
        List<String> resultado = object.masDeCinco("data", "analyst", "java", "engineer", "morocongo", "vainilla");
        System.out.println(resultado);
    }
}

//1. Recorrer cada palabra de la lista 
//2. Contar la longitud de la palabra
//3. Si es mayor a 5, agregarla a listaDePalabras
//4. Retornar la lista de Strings


/*🧩 Ejercicio 2: Filtrar Strings por longitud
✅ Instrucciones: Dada una lista de Strings, devolvé otra lista con los que tengan más de 5 caracteres.
🔢 Input: ["data", "analyst", "java", "engineer"]
🎯 Output: ["analyst", "engineer"]
🧠 Usa filtros y List<String>. */