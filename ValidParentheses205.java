
class ValidParentheses205 { 
    public boolean isValid(String s) { // s es un String que contiene (), {} o []
         //Iniciamos un contador   
        int count = 0;
            //Verificamos si el string contiene alguno de las tres opciones de brackets
            if(s.contains("(")) {
                //Si es este caso, verificamos que contenga su par
                if(s.contains(")")) { 
                    //Si tiene su par, verificamos si la llave de entrada está antes de la llave de salida
                    if(s.indexOf('(') < s.indexOf(')')) { 
                        count += 1; //Si es true, sumamos 1 al contador
                    }  
                } else {
                    count += 0; //Si es falso, agregamos 0 al contador
                }
            } else
            if(s.contains("[")) {
                if(s.contains("]")) {
                    if(s.indexOf('[') < s.indexOf(']')) {
                        count += 1;
                    }  
                } else {
                    count += 0;
                }
            } else
            if(s.contains("{")) {
                if(s.contains("}")) {
                    if(s.indexOf('{') < s.indexOf('}')) {
                        count += 1;
                    }  
                } else {
                    count += 0; 
                }
            }
        return count > 0;//Si count es mayor a 1, significa que se encontraron los pares
    
       }
}
    