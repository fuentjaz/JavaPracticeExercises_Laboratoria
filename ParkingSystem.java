

class ParkingSystem {
    int[] lugaresDisponibles;

    public ParkingSystem(int big, int medium, int small) {
        //Creamos un array con los valores del estacionamiento
        int [] lugaresDisponibles = {big, medium, small};
        this.lugaresDisponibles = lugaresDisponibles;
    }

    public boolean addCar(int carType) {
            if(lugaresDisponibles[carType - 1] > 0) {
                lugaresDisponibles[carType - 1]--;
                return true;
            } else {
        return false;
        }
}
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(1));
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */