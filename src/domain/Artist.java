package domain;

/**
 * Клас `Artist` успадковується від класу `Employee` та призначений для представлення інформації про художників.
 * Він містить поля для зберігання навичок, імені, посади, рівня та відділу, а також методи для доступу та встановлення цих даних.
 */
public class Artist extends Employee {

    /**
     * Масив рядків для зберігання навичок художника.
     */
    private String[] skills;

    /**
     * Конструктор класу `Artist`, що приймає масив рядків із навичками, ім'я, посаду, рівень та відділ художника.
     *
     * @param skills  Масив рядків, що містить навички художника.
     * @param name    Ім'я художника.
     * @param jobTitle  Посада художника.
     * @param level   Рівень художника.
     * @param dept    Відділ, до якого належить художник.
     */
    public Artist(String[] skills, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skills = skills;
    }

    /**
     * Конструктор класу `Artist`, що приймає масив рядків із навичками художника.
     * Ім'я, посаду, рівень та відділ встановлюються за допомогою конструктора базового класу `Employee`.
     *
     * @param skills  Масив рядків, що містить навички художника.
     */
    public Artist(String[] skills) {
        super();
        this.skills = skills;
    }

    /**
     * Конструктор класу `Artist` без аргументів. Створює порожній художник з масивом навичок розміром 10 елементів.
     */
    public Artist() {
        super();
        this.skills = new String[10];
    }

    /**
     * Перевизначений метод `toString()`, що повертає текстове представлення об'єкта `Artist`.
     * Він включає інформацію про художника з базового класу `Employee` та список його навичок.
     *
     * @return Текстове представлення об'єкта `Artist`.
     */
    @Override
    public String toString() {
        return super.toString() + "\nНавички: " + getSkills();
    }

    /**
     * Метод для отримання списку навичок художника у форматі рядка, розділених комами.
     *
     * @return Рядок, що містить навички художника, розділені комами.
     */
    public String getSkills() {
        String s = "";
        for (String skill : skills) {
            s = s + skill + ", ";
        }
        return s.substring(0, s.length() - 2);
    }

    /**
     * Метод для встановлення масиву навичок художника.
     *
     * @param skills  Масив рядків, що містить нові навички художника.
     */
    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    /**
     * Метод для отримання масиву навичок художника без модифікації.
     *
     * @return Оригінальний масив рядків із навичками художника.
     */
    public String[] getSkillsList() {
        return skills;
    }
}
