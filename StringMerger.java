public class StringMerger {
    public static boolean isMerge(String s, String part1, String part2) {
        // Verificación rápida de longitudes
        if (s.length() != part1.length() + part2.length()) {
            return false;
        }
        return helper(s, part1, part2, 0, 0, 0);
    }
    
    private static boolean helper(String s, String part1, String part2, 
                                int indexS, int index1, int index2) {
        // Caso base: hemos recorrido toda la cadena s
        if (indexS == s.length()) {
            return true;
        }
        
        boolean match1 = false;
        boolean match2 = false;
        
        // Verificar si podemos tomar el próximo carácter de part1
        if (index1 < part1.length() && s.charAt(indexS) == part1.charAt(index1)) {
            match1 = helper(s, part1, part2, indexS + 1, index1 + 1, index2);
        }
        
        // Verificar si podemos tomar el próximo carácter de part2
        if (index2 < part2.length() && s.charAt(indexS) == part2.charAt(index2)) {
            match2 = helper(s, part1, part2, indexS + 1, index1, index2 + 1);
        }
        
        return match1 || match2;
    }
}