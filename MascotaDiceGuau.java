// Definimos la clase Mascota
class Mascota {
    // Atributos (características)
    String nombre;
    String tipo;
    int edad;

    // Constructor (método especial para crear objetos)
    public Mascota(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    // Método (acción que puede realizar la mascota)
    public void hacerSonido() {
        if (tipo.equals("perro")) {
            System.out.println(nombre + " dice: ¡Guau!");
        } else if (tipo.equals("gato")) {
            System.out.println(nombre + " dice: ¡Miau!");
        } else {
            System.out.println(nombre + " hace un sonido desconocido.");
        }
    }
}

// Usamos la clase Mascota
public class MascotaDiceGuau {
    public static void main(String[] args) {
        // Creamos un objeto de tipo Mascota
        Mascota miMascota = new Mascota("Firulais", "perro", 3);

        // Llamamos a un método del objeto
        miMascota.hacerSonido();  // Salida: Firulais dice: ¡Guau!
    }
}