
package DIP;

// Применяемый принцип: Принцип инверсии зависимостей (DIP - Dependency Inversion Principle).
// Почему: Класс Car зависит от абстракции (интерфейса Engine), а не от конкретных реализаций двигателя. 
// Это позволяет машине работать с любым двигателем, который реализует этот интерфейс, делая систему более гибкой и расширяемой.

public class Car {
    public Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
}
