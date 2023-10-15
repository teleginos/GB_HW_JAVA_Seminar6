
package ISP;

// Применяемый принцип: Принцип разделения интерфейса (ISP - Interface Segregation Principle) из SOLID.
// Почему: Класс Cube реализует интерфейс Shape3D. Этот интерфейс, вероятно, определяет общие методы для всех трехмерных фигур. 
// Поскольку куб является трехмерной фигурой, он реализует методы area() и volume(), специфичные для себя.

public class Cube implements Shape3D {
    private int length;

    public Cube(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double area() {
        return this.length * this.length * 6;
    }

    @Override
    public double volume() {
        return Math.pow(length, 3);
    }
}
