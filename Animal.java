/**
 * Базовый класс для животных.
 * @author mAXxtor
 * @since 18.04.2016
 */
public class Animal implements Pet {

    /**
     * Имя.
     */
    private final String name;

    /**
     * Конструктор.
     * @param name Имя животного
     */
    public Animal (final String name) {
        this.name = name;
    }

    /**
     * Подать голос.
     */
    @Override
    public void makeSound() {
        System.out.println(String.format("%s say : %s", this.name, "beep"));
    }

    private boolean isHungry() {
        // TODO: 18.04.2016 добавить алгоритм вычисления состояния
        return true;
    }

    /**
     * Возвращает имя животного.
     * @return имя животного
     */
    public String getName() {
        return this.name;
    }
}