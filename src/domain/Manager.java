
package domain;

/**
 * Клас `Manager` успадковується від класу `Employee` 
 * та призначений для представлення інформації про менеджерів.
 * Він містить додаткове поле `employees`, що є масивом об'єктів класу `Employee`,
 * які підпорядковані цьому менеджеру.
 */
public class Manager extends Employee {

    /**
     * Масив об'єктів класу `Employee`, що представляє список підлеглих працівників даного менеджера.
     */
    private Employee[] employees;

    /**
     * Конструктор класу `Manager`, що приймає масив об'єктів класу `Employee` 
     * (підлеглих працівників), ім'я, посаду, рівень та відділ менеджера.
     *
     * @param employees   Масив об'єктів класу `Employee` (підлеглі працівники).
     * @param name        Ім'я менеджера.
     * @param jobTitle    Посада менеджера.
     * @param level       Рівень менеджера.
     * @param dept        Відділ, до якого належить менеджер.
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Конструктор класу `Manager`, що приймає лише масив об'єктів класу `Employee` 
     * (підлеглих працівників). Ім'я, посаду, рівень та відділ менеджера встановлюються 
     * за допомогою конструктора базового класу `Employee`.
     *
     * @param employees   Масив об'єктів класу `Employee` (підлеглі працівники).
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Конструктор класу `Manager` без аргументів. Створює порожній об'єкт менеджера 
     * з масивом підлеглих працівників розміром 10 елементів. Ім'я, посаду, рівень та відділ 
     * менеджера встановлюються за допомогою конструктора базового класу `Employee`.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Перевизначений метод `toString()`, що повертає текстове представлення об'єкта `Manager`.
     * Він включає інформацію про менеджера з базового класу `Employee` та список його підлеглих працівників.
     *
     * @return Текстове представлення об'єкта `Manager`.
     */
    @Override
    public String toString() {
        return super.toString() + "\nПідлеглі працівники: " + getEmployees();
    }

    /**
     * Метод для отримання текстового представлення списку підлеглих працівників менеджера 
     * у форматі рядка, розділених комами.
     *
     * @return Рядок, що містить імена підлеглих працівників, розділені комами.
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Метод для встановлення масиву підлеглих працівників менеджера.
     *
     * @param employees   Новий масив об'єктів класу `Employee` (підлеглі працівники).
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Метод для отримання масиву підлеглих працівників менеджера без модифікації.
     *
     * @return Оригінальний масив об'єктів класу `Employee` (підлеглі працівники).
     */

    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
