import java.util.*;

public class StringReverse206 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Leemos la entrada con un scanner y lo convertirmos a SB
        StringBuilder word = new StringBuilder(scanner.nextLine());
        //Comparamos la palabra con su reverso
        if(word.toString().equals(word.reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}