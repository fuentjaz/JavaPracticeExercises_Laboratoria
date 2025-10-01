class CuentaBancaria {
    private double saldo; // Atributo privado

    //Método público para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }
    //Método público para obtener el saldo
    public double getSaldo() {
        return saldo; 
    }
}

public class EncapsulamientoEj {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(1000); 
        System.out.println("Saldo: $" + cuenta.getSaldo()); 
        // Salida: Saldo: $1000.0
    }
}
