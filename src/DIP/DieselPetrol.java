
package DIP;

// Применяемый принцип: Принцип инверсии зависимостей (DIP - Dependency Inversion Principle).
// Почему: Класс DieselPetrol реализует абстракцию Engine. Это позволяет ему быть одним из многих потенциальных двигателей, которые могут быть использованы в системе.

public class DieselPetrol implements Engine {
    @Override
    public void start() {
        System.out.println("Запустили дизельный двигатель");
    }
}
