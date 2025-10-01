abstract class Animal {
    abstract void hacerSonido(); // Método abstracto
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("Guau!");
    }
}

public class AbstractionEj {
    public static void main(String[] args) {
        Animal miPerro = new Perro();
        miPerro.hacerSonido(); // Salida: Guau!
    }
} 