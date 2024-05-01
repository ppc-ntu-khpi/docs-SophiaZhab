package domain;

/**
 * Клас `Editor` успадковується від класу `Artist` та призначений для представлення інформації про редакторів.
 * Він містить додаткове поле `electronicEditing`, що вказує, чи редактор віддає перевагу електронному редагуванню.
 */
public class Editor extends Artist {

    /**
     * Прапор, що визначає, чи редактор віддає перевагу електронному редагуванню.
     */
    private boolean electronicEditing;

    /**
     * Конструктор класу `Editor`, що приймає параметри щодо переваг електронного редагування,
     * масиву навичок, імені, посади, рівня та відділу редактора.
     *
     * @param electronicEditing  Чи віддає редактор перевагу електронному редагуванню.
     * @param skills               Масив рядків, що містить навички редактора.
     * @param name                 Ім'я редактора.
     * @param jobTitle             Посада редактора.
     * @param level                Рівень редактора.
     * @param dept                 Відділ, до якого належить редактор.
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор класу `Editor`, що приймає параметри щодо переваг електронного редагування
     * та масив навичок редактора. Ім'я, посаду, рівень та відділ встановлюються за допомогою конструктора
     * базового класу `Artist`.
     *
     * @param electronicEditing  Чи віддає редактор перевагу електронному редагуванню.
     * @param skills               Масив рядків, що містить навички редактора.
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор класу `Editor`, що приймає лише параметр щодо переваг електронного редагування.
     * Створює порожній об'єкт редактора з перевагою за замовчуванням (електронне редагування). Інші дані
     * встановлюються за допомогою конструктора базового класу `Artist`.
     *
     * @param electronicEditing  Чи віддає редактор перевагу електронному редагуванню.
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор класу `Editor` без аргументів. Створює порожній об'єкт редактора з перевагою
     * електронного редагування за замовчуванням. Інші дані встановлюються за допомогою конструктора
     * базового класу `Artist`.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Перевизначений метод `toString()`, що повертає текстове представлення об'єкта `Editor`.
     * Він включає інформацію про редактора з базового класу `Artist` та його переваги щодо
     * електронного редагування.
     *
     * @return Текстове представлення об'єкта `Editor`.
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nНалаштування редагування: ";
        if (electronicEditing) {
            s += "електронне";
        } else {
            s += "паперове";
        }
        return s;
    }

    /**
     * Метод для отримання інформації про переваги редактора щодо електронного редагування.
     *
     * @return `true`, якщо редактор віддає перевагу електронному редагуванню; `false` інакше.
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Метод для встановлення переваг редактора щодо електронного редагування.
     *
     *  @param electronic  `true`, якщо редактор має віддавати перевагу електронному редагуванню; `false` інакше.
     */
     
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
