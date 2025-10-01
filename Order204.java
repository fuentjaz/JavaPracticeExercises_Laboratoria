public class Order204 {
    public static String order(String words) {
        //Dividimos el string en palabras usando el espacio como delimitador
        String[] palabrasArray = words.split(" ");

        //Creamos una lista para almacenar las palabras ordenadas
        String[] orderWords = new String[palabrasArray.length];

        //Recorremos el array de palabras
      if (words.equals("")) {
        return "";
      }
      for(int i = 0; i<palabrasArray.length; i++) {
        for(int j = 1; j<=palabrasArray.length; j++) {
          if(palabrasArray[i].contains(Integer.toString(j))) {
                orderWords[j-1] = palabrasArray[i];
            }
           }
             /* else if(palabrasArray[i].contains("2")) {
                orderWords[1] = palabrasArray[i];
            } else if(palabrasArray[i].contains("3")) {
                orderWords[2] = palabrasArray[i];
            } else if(palabrasArray[i].contains("4")) {
                orderWords[3] = palabrasArray[i];
            } else if(palabrasArray[i].contains("5")) {
                orderWords[4] = palabrasArray[i];
            } else if(palabrasArray[i].contains("6")) {
                orderWords[5] = palabrasArray[i];
            } else if(palabrasArray[i].contains("7")) {
                orderWords[6] = palabrasArray[i];
            } else if(palabrasArray[i].contains("8")) {
                orderWords[7] = palabrasArray[i];
            } else if(palabrasArray[i].contains("9")) {
                orderWords[8] = palabrasArray[i];
            } else {
                break;
            } */
        }
    String arrayToString = String.join(" ", orderWords); 
    return arrayToString;
    }
  }