
package OCP;

public class Vehicle {
    private int maxSpeed;
    private String type;

    // Этот метод предоставляет допустимую скорость для транспортного средства.
    // В базовом классе он просто возвращает максимальную скорость, но может быть переопределен в производных классах.
    public double calculateAllowedSpeed(){
        return maxSpeed;
    }
    
    // Геттер для максимальной скорости.
    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Сеттер для максимальной скорости, позволяет внешним классам устанавливать это значение, соблюдая при этом инкапсуляцию.
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Геттер для типа транспортного средства.
    public String getType() {
        return type;
    }

    // Сеттер для типа транспортного средства, позволяет внешним классам устанавливать это значение, соблюдая при этом инкапсуляцию.
    public void setType(String type) {
        this.type = type;
    }

    // Конструктор класса, инициализирующий максимальную скорость и тип транспортного средства.
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
}
