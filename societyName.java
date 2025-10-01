import java.util.*;

public class societyName {
	public static String societyNameF(String[] friends) {
	Arrays.sort(friends);
	
    Map<String, Character> letraInicial = new HashMap<>();
    String [] societyNamee = new String[friends.length];

	for (int i = 0; i < friends.length; i++){
		letraInicial.put(friends[i], friends[i].charAt(0));
        societyNamee[i] = letraInicial.get(friends[i]).toString();	
	}
    String arrayToString = String.join("", societyNamee);
    return arrayToString;
            
    }
    public static void main(String[] args) {
        // Pruebas
        System.out.println(societyNameF(new String[] {"Malcom", "Sara", "Elen"}));    
    }
}