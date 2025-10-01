import java.util.*;

class Solution {
    public int countCharacters(String[] words, String chars) {
        //Creamos un mapa con la clave char y el valor es la cantidad de veces que aparece
        Map<Character, Integer> charsMap = new HashMap<>();
        //Iniciamos una variable que va a contener la longitud de las palabras que si se puedan formar
        int totalSum = 0;

        //Contar la frecuencia de cada caracter en chars
        for(char letter : chars.toCharArray()) {
            //getOrDefault verifica si el valor (el caracter) se encuentra en el mapa, si no está agrega 0
            charsMap.put(letter, charsMap.getOrDefault(letter, 0)+1);
        } 
        //Recorrer cada palabra en el Array words
        for(String word : words) {
            //Iniciamos un booleano que inicia en true
            boolean canFormWord = true;
            //Creamos un nuevo mapa con la clave (caracter) y la frecuencia de ese caracter
            Map<Character, Integer> wordsMap = new HashMap<>();
            //Recorrer cada caracterer de cada palabra de words
            for(char letterW : word.toCharArray()) {
                //Agregar al mapa el caracter como clave y como valor la frecuencia de ese caracter
                wordsMap.put(letterW, wordsMap.getOrDefault(letterW, 0)+1);
                //Si la frecuencia del caracter en words es mayor a la frecuencia del caracter en chars:
                if(wordsMap.get(letterW) > charsMap.getOrDefault(letterW, 0)) {
                    //Devolvemos false
                    canFormWord = false;
                    //Rompemos el bucle
                    break;
                }
            } 
        //Si canFormWord no se modifica y se mantiene en true, agregamos a totalSum la longitud de la palabra
          if(canFormWord) {
            totalSum += word.length();  
            }
        //Devolvemos la suma total de los word que si se pueden formar
        } return totalSum;
        
    }
}