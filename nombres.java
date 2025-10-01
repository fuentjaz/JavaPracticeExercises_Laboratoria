
public class nombres {
    public static void main(String[] args) {
        /* 
        Crea un array de 5 nombres y recórrelo con un for-each.
        📌 Imprime:
        Juan  
        Ana  
        Carlos  
        Sofía  
        Luis   
        */

        String[] nombres = {"Juan", "Ana", "Carlos", "Sofía", "Luis"};

        for(String nombre : nombres) {
            System.out.println(nombre);
        }

}
}