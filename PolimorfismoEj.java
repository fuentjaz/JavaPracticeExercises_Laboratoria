class Animal {
    void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("Guau!");
    }
}

class Gato extends Animal {
    void hacerSonido() {
        System.out.println("Miua!");
    }
}

public class PolimorfismoEj {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        miAnimal.hacerSonido(); //Salida: Guau!

        miAnimal = new Gato();
        miAnimal.hacerSonido(); //Salida: Miau!
    }
}
