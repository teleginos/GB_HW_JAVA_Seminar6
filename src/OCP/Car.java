
package OCP;

// Класс Car наследуется от Vehicle, демонстрируя принцип наследования. 
// Это позволяет Car использовать свойства и методы Vehicle.
public class Car extends Vehicle {
    
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    // Этот метод переопределяет метод из родительского класса, демонстрируя принцип открытости/закрытости (OCP).
    // Класс Vehicle остается неизменным, но его поведение может быть модифицировано в классе-наследнике.
    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.8;
    }
}
