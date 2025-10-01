import java.util.Stack;

public class Pilas {
    public boolean isValid(String s) {
        //Creamos una pila
        Stack<Character> pila = new Stack<>();
        //Creamos un array de char []
        char[] chars = s.toCharArray();

        //Iteramos sobre cada caracter
        for(char ch : chars) {
            //Si es un bracket de apertura
            if(ch == '(' || ch == '[' || ch == '{') {
                //Lo agregamos a la pila
                pila.push(ch);
                //En cambio, si es un bracket de cierre
            } else if (ch == ')' || ch == ']' || ch == '}') {
                //Comprobamos si la pila está vacía o no es un par válido
                if(pila.isEmpty() || !esParValido(pila.pop(), ch)) { 
                    /*!esParValido(pila.pop(), ch) lo que hace es sacar el 
                     * último bracket de apertura(pila.pop()) y lo compara con ch
                     * para ver si contiene su par válido.
                     * Luego ! niega el resultado de esParValido()
                     * False si es un parValido y true si no lo es
                      */
                    return false;
                }
            }
        
        } //Cómo devuelve true?
        return pila.isEmpty(); //Devuelve si la pila está vacía o no  
    }
    private boolean esParValido(char apertura, char cierre) {
            return (apertura == '(' && cierre == ')') ||
                   (apertura == '[' && cierre == ']') ||
                   (apertura == '{' && cierre == '}') ;
    }

}