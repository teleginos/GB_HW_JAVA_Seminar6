
package OCP;

public class Test {
    public static void main(String[] args) {
        // Создание объекта базового класса Vehicle.
        Vehicle vehicle = new Vehicle(100, "SOLID");
        System.out.println(vehicle.getType() + " " + vehicle.calculateAllowedSpeed());
        
        // Создание объекта Car, но с референсом типа Vehicle, демонстрируя принцип полиморфизма.
        Vehicle car = new Car(200);
        System.out.println(car.getType() + " " + car.calculateAllowedSpeed());
        
        // Создание объекта Bus, но с референсом типа Vehicle, демонстрируя принцип полиморфизма.
        Vehicle bus = new Bus(100);
        System.out.println(bus.getType() + " " + bus.calculateAllowedSpeed());
    }
}
