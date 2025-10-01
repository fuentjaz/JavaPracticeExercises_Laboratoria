import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        // Crear un mapa de los números romanos
        Map<String, Integer> romanMap = new HashMap<>();
        // Agregar valores al mapa (romanos con su equivalente)
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);

        // Creamos una forma de convertir la entrada s a su número entero
        // Los números romanos son como sumas
        int sum = 0;
        char[] arrayChar = s.toCharArray();

        for (int i = 0; i < arrayChar.length; i++) { // convertimos a un array de chars y sacamos los valores con el
                                                     // índice
            if (i + 1 < s.length()) {
                char nextChar = s.charAt(i + 1);
                char currentChar = s.charAt(i);

                if (String.valueOf(currentChar).equals("I") && String.valueOf(nextChar).equals("V")) {
                    sum += 4;
                    i++;
                    continue;
                }
                if (String.valueOf(currentChar).equals("I") && String.valueOf(nextChar).equals("X")) {
                    sum += 9;
                    i++;
                    continue;
                }
                if (String.valueOf(currentChar).equals("X") && String.valueOf(nextChar).equals("L")) {
                    sum += 40;
                    i++;
                    continue;
                }
                if (String.valueOf(currentChar).equals("X") && String.valueOf(nextChar).equals("C")) {
                    sum += 90;
                    i++;
                    continue;
                }
                if (String.valueOf(currentChar).equals("C") && String.valueOf(nextChar).equals("D")) {
                    sum += 400;
                    i++;
                    continue;
                }
                if (String.valueOf(currentChar).equals("C") && String.valueOf(nextChar).equals("M")) {
                    sum += 900;
                    i++;
                    continue;
                }
            }
            int numInt = romanMap.get(Character.toString(s.charAt(i))); // Importante convertir el char a String
            sum += numInt;
        }
        return sum;
    }
}
