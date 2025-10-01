import java.util.HashMap;
import java.util.Map;



class Solution {
    public boolean isLongPressedName(String name, String typed) {
        Map<Character, Integer> typedMap = new HashMap<>();
        Map<Character, Integer> nameMap = new HashMap<>();
        char[] arrayName = name.toCharArray();
        char[] arrayTyped = typed.toCharArray();

        System.out.println(arrayName);
        System.out.println(arrayTyped);

        //Creamos un mapa con la frecuencia de cada letra de name
        for(char letterN : name.toCharArray()) {
            nameMap.put(letterN, nameMap.getOrDefault(letterN, 0)+1);
        }
        //Creamos un mapa con la frecuencia de cada letra de typed
        for(char letter : typed.toCharArray()) {
            typedMap.put(letter, typedMap.getOrDefault(letter, 0)+1);
        }
        System.out.println("Mapa de frecuencia de Name" + nameMap);
        System.out.println("Mapa de frecuencia de Typed" + typedMap);
        for(Map.Entry<Character, Integer> entrada : typedMap.entrySet()) {
            Integer frecuenciaT = entrada.getValue();
            Integer frecuenciaN = nameMap.get(entrada.getKey());
            //Si la frecuencia de un caracter en typedMap es > 2, elimina una frecuencia (una letra)
            if(frecuenciaT >= 2) {
                frecuenciaT -= 1;
                typedMap.put(entrada.getKey(), frecuenciaT);
            } if(frecuenciaT > 3) {
                typedMap.put(entrada.getKey(), frecuenciaN);
            }
        }
        System.out.println("Nuevo mapa de Typed tras eliminar los duplicados" + typedMap);
        //Comparamos ambos mapas para verificar que su frecuencia sea la misma
        return typedMap.entrySet().equals(nameMap.entrySet()) && 
                typedMap.entrySet().toString().equals(nameMap.entrySet().toString());
       
        /*
        Luego compara la frecuencia nueva de typedMap con la de las letras de nameMap
        Ejemplo: name = "leelee", l=2, l=4 -- typed = "lleeelee", l=3, e=5, --> l=2, e=4 !!Bien, es igual a 
        la frecuencia de letras en name.
        - Ahora tenemos que verificar que las letras estén en orden
        */
        
    } 
}