
package OCP;

// Класс Bus наследуется от Vehicle, демонстрируя принцип наследования. 
// Это позволяет Bus использовать свойства и методы Vehicle.
public class Bus extends Vehicle {
    
    // Этот метод переопределяет метод из родительского класса, демонстрируя принцип открытости/закрытости (OCP).
    // Класс Vehicle остается неизменным, но его поведение может быть модифицировано в классе-наследнике.
    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.5;
    }

    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }
}
