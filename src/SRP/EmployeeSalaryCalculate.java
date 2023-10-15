
package SRP;

// Класс EmployeeSalaryCalculate также соответствует принципу единственной ответственности (SRP).
// Он отвечает исключительно за расчет заработной платы сотрудника и не содержит другой логики или атрибутов, не связанных с этой задачей.
public class EmployeeSalaryCalculate {
    private int baseSalary;

    // Конструктор класса, инициализирующий базовую ставку заработной платы.
    public EmployeeSalaryCalculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Метод для вычисления и возврата конечной заработной платы сотрудника.
    public double salaryCalculate(){
        return this.baseSalary * 1.5;
    }
}
