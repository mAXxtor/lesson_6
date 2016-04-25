/**
 * Реализация кота. Он умеет мяукать и ловить мышей.
 * @author mAXxtor
 * @since 18.04.2016
 */
public class Cat extends Animal {

    /**
     * Конструктор.
     * @param name Имя животного
     */
    public Cat(final String name) {
        super(name);
    }

    /**
     * Поймать мышь.
     */
    public void catchMouse() {
    }

    /**
     * (@inheritDoc)
     */
    @Override
    public void makeSound() {
        System.out.println(String.format("May %s", this.getName()));
    }
}