
package LSP;

// Применяемый принцип: Принцип подстановки Барбары Лисков (LSP - Liskov Substitution Principle) из SOLID.
// Почему: QuadRangle является абстрактным классом, определяющим метод area(). Этот класс может быть расширен другими классами, представляющими четырехугольники 
// (например, прямоугольник или квадрат), и каждый из этих классов должен предоставить свою реализацию метода area().
// Принцип LSP гарантирует, что подклассы QuadRangle могут быть использованы вместо базового класса без воздействия на корректность программы.

public abstract class QuadRangle {
    public abstract int area();
}
