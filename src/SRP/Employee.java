
package SRP;

// Класс Employee соответствует принципу единственной ответственности (Single Responsibility Principle, SRP).
// Он отвечает только за хранение информации о сотруднике и не содержит логику, не связанную с атрибутами сотрудника.
public class Employee {
    private String name;
    private String dol;

    // Геттер для имени сотрудника.
    public String getName() {
        return name;
    }

    // Сеттер для имени сотрудника, позволяет внешним классам устанавливать это значение, соблюдая при этом инкапсуляцию.
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для должности или департамента сотрудника.
    public String getDol() {
        return dol;
    }

    // Сеттер для должности или департамента сотрудника, позволяет внешним классам устанавливать это значение, соблюдая при этом инкапсуляцию.
    public void setDol(String dol) {
        this.dol = dol;
    }

    // Конструктор класса, инициализирующий имя и должность или департамент сотрудника.
    public Employee(String name, String dol) {
        this.name = name;
        this.dol = dol;
    }
}
