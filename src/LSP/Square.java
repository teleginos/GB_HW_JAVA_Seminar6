
package LSP;

// Применяемый принцип: Принцип подстановки Барбары Лисков (LSP - Liskov Substitution Principle) из SOLID.
// Почему: Класс Square также расширяет абстрактный класс QuadRangle и предоставляет свою реализацию метода area(). 
// Подобно классу Rectangle, объекты класса Square также могут быть безопасно использованы вместо объектов класса QuadRangle.

public class Square extends QuadRangle{
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return this.length * this.length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
