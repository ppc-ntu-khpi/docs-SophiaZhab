package domain;

/**
 * Клас `Employee` призначений для представлення інформації про працівників.
 * Він містить поля для зберігання імені, посади, рівня, відділу та унікального ідентифікатора працівника.
 * Також клас включає методи для доступу та встановлення цих даних.
 */
public class Employee {

    /**
     * Ім'я працівника.
     */
    private String name;

    /**
     * Посада працівника.
     */
    private String jobTitle;

    /**
     * Унікальний ідентифікатор працівника, що генерується випадковим чином.
     */
    private int ID;

    /**
     * Рівень працівника (1, 2 або 3).
     */
    private int level;

    /**
     * Відділ, до якого належить працівник.
     */
    private String dept;

    /**
     * Перевизначений метод `toString()`, що повертає текстове представлення об'єкта `Employee`.
     * Він включає інформацію про ім'я, посаду, рівень, відділ та ідентифікатор працівника.
     *
     * @return Текстове представлення об'єкта `Employee`.
     */
    @Override
    public String toString() {
        return "\nІдентифікатор працівника: " + ID + "\nІм'я: " + name + "\nПосада: " + jobTitle + "\nРівень: " + level + "\nВідділ: " + dept;
    }

    /**
     * Конструктор класу `Employee` без аргументів. Він генерує випадковий ідентифікатор працівника.
     */
    public Employee() {
        ID = (int) (Math.random() * 1000);
    }

    /**
     * Конструктор класу `Employee`, що приймає ім'я, посаду, рівень та відділ працівника.
     *
     * @param name    Ім'я працівника.
     * @param jobTitle  Посада працівника.
     * @param level   Рівень працівника (1, 2 або 3).
     * @param dept    Відділ, до якого належить працівник.
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this(); // Викликає конструктор без аргументів для ініціалізації ID
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    // Методи get і set для інших полів класу Employee (надано коментарі лише для деяких)

    /**
     * Метод для встановлення посади працівника.
     *
     * @param job  Нова посада працівника.
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Метод для отримання посади працівника.
     *
     * @return Поточна посада працівника.
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Метод для встановлення імені працівника.
     * Він перевіряє, чи ім'я містить лише літери, апострофи, дефіси, крапки та пробіли.
     * Якщо ні, ім'я встановлюється за замовчуванням ("John Doe").
     *
     * @param name  Нове ім'я працівника.
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
/**
     * Метод для отримання інформації про ім'я працівника.
     *
     * @return name.
     */
    public String getName() {
        return name;
    }
    
}
