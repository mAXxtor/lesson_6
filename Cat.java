/**
 * Реализация кота. Он умеет мяукать и ловить мышей.
 * @author mAXxtor
 * @since 18.04.2016
 */
public class Cat extends Pet {
    /**
     * Name of pet
     */
    private String name;

    /**
     * Constructor
     * @param name of pet
     */
    public Cat(final String name) {
        this.name = name;
    }

    /**
     * (@inheritDoc)
     */
    @Override
    public void makeSound() {
        System.out.println("May!");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}