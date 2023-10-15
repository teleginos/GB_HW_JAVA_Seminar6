
package DIP;

// Применяемый принцип: Принцип инверсии зависимостей (DIP - Dependency Inversion Principle).
// Почему: В тестовом коде мы видим, как класс Car может работать с различными типами двигателей без необходимости изменять свой код. 
// Это демонстрирует гибкость, предоставляемую принципом инверсии зависимостей.

public class Test {
    public static void main(String[] args) {
        Car car = new Car(new PetrolEngine());
        car.start();
        car = new Car(new DieselPetrol());
        car.start();
    }
}
