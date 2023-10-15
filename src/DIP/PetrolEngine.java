
package DIP;

// Применяемый принцип: Принцип инверсии зависимостей (DIP - Dependency Inversion Principle).
// Почему: Аналогично классу DieselPetrol, класс PetrolEngine реализует абстракцию Engine, что делает его еще одним возможным двигателем для использования в системе.

public class PetrolEngine implements Engine {
    @Override
    public void start(){
        System.out.println("Бензиновый двигатель запущен");
    }
}
