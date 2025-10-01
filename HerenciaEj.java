class Vehiculo {
    String marca;

    void arrancar() {
        System.out.println("El vehículo está arrancando.");
    }
}

class Coche extends Vehiculo {
    void acelerar() {
        System.out.println("El coche está acelerando.");
    }
}

public class HerenciaEj {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.marca = "Toyota";
        miCoche.arrancar(); // Método heredado
        miCoche.acelerar(); //Método propio
        System.out.println("La marca de mi coche es " + miCoche.marca);
    }
}
