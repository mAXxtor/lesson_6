/**
 * Реализация собаки.
 * @author mAXxtor
 * @since 18.04.2016
 */
public class Dog implements Pet {

    /**
     * Name of pet
     */
    private String name;

    /**
     * Constructor
     * @param name of pet
     */
    public Dog(final String name) {
        this.name = name;
    }

    /**
     * (inheritDoc)
     */
    @Override
    public void makeSound() {
        System.out.println("Gav!");
    }

    /**
     * (inheritDoc)
     */
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}