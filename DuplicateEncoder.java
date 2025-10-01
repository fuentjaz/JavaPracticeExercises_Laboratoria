import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
  public static String encode(String word) {
    //Convertimos la cadena a minúsculas para ignorar mayus y minus
    word = word.toLowerCase();

    //Creamos un mapa para almacenar la frecuencia de cada carácter
    Map<Character, Integer> mapaFrecuencia = new HashMap<>();

    //Contamos la frecuencia de cada caracter
    for(char ch : word.toCharArray()) {
      mapaFrecuencia.put(ch, mapaFrecuencia.getOrDefault(ch, 0) + 1);
    }
    //Construimos la cadena resultante
    StringBuilder stringFinal = new StringBuilder();
    for(char c : word.toCharArray()) {
      if(mapaFrecuencia.get(c)==1) {
        stringFinal.append('(');
      } else {
        stringFinal.append(')');
      }
    }
    return stringFinal.toString();
  }
  public static void main(String[] args) {
    // Pruebas
    System.out.println(encode("din"));      // Salida: "((("
    System.out.println(encode("recede"));   // Salida: "()()()"
    System.out.println(encode("Success"));  // Salida: ")())())"
    System.out.println(encode("(( @"));     // Salida: "))(("
}
}