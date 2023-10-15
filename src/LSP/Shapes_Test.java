
package LSP;

// Применяемый принцип: Принцип подстановки Барбары Лисков (LSP - Liskov Substitution Principle) из SOLID.
// Почему: В тестовом коде объекты классов Rectangle и Square присваиваются переменной типа QuadRangle. 
// Это демонстрирует применение принципа LSP, так как объекты подклассов (Rectangle и Square) могут быть безопасно использованы 
// вместо объектов базового класса QuadRangle.

public class Test {
    public static void main(String[] args) {
        QuadRangle quadRangle = new Rectangle(5, 3);
        System.out.println("Rectangle" + " " + quadRangle.area());
        quadRangle = new Square(5);
        System.out.println("Square" + " " + quadRangle.area());
    }
}
