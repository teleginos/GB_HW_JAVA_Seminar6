
package LSP;

// Применяемый принцип: Принцип подстановки Барбары Лисков (LSP - Liskov Substitution Principle) из SOLID.
// Почему: Класс Rectangle расширяет абстрактный класс QuadRangle и предоставляет конкретную реализацию метода area(). 
// Это означает, что объекты класса Rectangle могут быть безопасно использованы вместо объектов класса QuadRangle без воздействия на корректность программы.

public class Rectangle extends QuadRangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return this.height * this.width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
