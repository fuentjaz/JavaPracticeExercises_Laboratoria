import java.util.Map;
import java.util.HashMap;

class ParseMolecule {

    public static Map<String, Integer> getAtoms(String formula) {
        // Crear mapa
        Map<String, Integer> atomsMap = new HashMap<>();
        // Si no encuentra parentesis o corchetes entra directo al calculo
        // Dos punteros

        // El puntero 1 va a empezar en la mitad del string
        int pointer1 = formula.length() / 2; // verifica letras

        // El puntero 2 va a empezar en el puntero 1 + 1
        int pointer2 = pointer1 + 1; // verifica dígitos

        while (pointer1 > formula.length() && pointer2 < formula.length()) {
            if (Character.isLetter(pointer1)) {
                if (Character.isLetter(formula.charAt(pointer1)) && Character.isDigit(formula.charAt(pointer2))) {
                    if (Character.isDigit(formula.charAt(pointer2 + 1))) {
                        // Si el número es de dos dígitos, concatenamos ambos digitos
                        String digitConcat = String.valueOf(pointer2) + String.valueOf(pointer2 + 1);
                        int numConcat = Integer.parseInt(digitConcat);
                        atomsMap.put(String.valueOf(pointer1), atomsMap.getOrDefault(pointer2, numConcat)+numConcat);
                        pointer2 += 2;
                    } else {
                        // Si no, agrega pointer1 como clave al map y pointer2 como valor
                        String digit = String.valueOf(pointer2);
                        int num = Integer.parseInt(digit);
                        atomsMap.put(String.valueOf(pointer1), num);
                    }
                } else {
                    pointer1++;
                    pointer2++;
                }

            }
        }
        return new HashMap<String, Integer>();
    }
}
// El puntero 2 verifica si es número o letra
// Si es número agrega al map clave: Puntero1, valor: Puntero2.
// Después de esto Puntero1 - 1, Puntero2 + 2
