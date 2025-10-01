class Cafetera {
    // Método para preparar café
    public void prepararCafe() {
        System.out.println("La cafetera está preparando café.");
    }
}

class Taza {
    // Método para servir café
    public void servirCafe() {
        System.out.println("La taza está lista para servir café.");
    }
}

class Mujer {
    private String nombre;
    private Cafetera cafetera;  // Composición: Mujer tiene una Cafetera
    private Taza taza;          // Composición: Mujer tiene una Taza

    // Constructor
    public Mujer(String nombre) {
        this.nombre = nombre;
        this.cafetera = new Cafetera();  // Inicializa la cafetera
        this.taza = new Taza();          // Inicializa la taza
    }

    // Método para preparar y tomar café
    public void prepararYTomarCafe() {
        System.out.println(nombre + " está preparando su café.");
        cafetera.prepararCafe();  // Usa la cafetera para preparar café
        taza.servirCafe();        // Usa la taza para servir café
        System.out.println(nombre + " está disfrutando su café.");
    }
}

public class cafeComposicion {
    public static void main(String[] args) {
        // Crear una instancia de Mujer
        Mujer ana = new Mujer("Ana");

        // Ana prepara y toma café
        ana.prepararYTomarCafe();
    }
}