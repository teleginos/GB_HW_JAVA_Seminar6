
package ISP;

// Применяемый принцип: Принцип разделения интерфейса (ISP - Interface Segregation Principle) из SOLID.
// Почему: Класс Circle реализует интерфейс Shape. Этот интерфейс, вероятно, определяет общие методы для всех двухмерных фигур. 
// Это позволяет каждому классу, реализующему Shape, иметь свою конкретную реализацию метода area(), что делает систему гибкой и понятной.

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
