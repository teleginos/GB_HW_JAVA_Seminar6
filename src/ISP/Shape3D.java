
package ISP;

// Применяемый принцип: Принцип разделения интерфейса (ISP - Interface Segregation Principle) из SOLID.
// Почему: Интерфейс Shape3D расширяет интерфейс Shape и добавляет дополнительный метод volume(). 
// Это гарантирует, что каждая трехмерная фигура, реализующая интерфейс Shape3D, будет иметь методы для вычисления площади и объема. 
// Это показывает, что интерфейсы разделены по функциональности, что соответствует принципу ISP.

public interface Shape3D extends Shape{
    public double volume();
}
