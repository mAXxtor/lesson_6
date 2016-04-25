/**
 * Реализация собаки.
 * @author mAXxtor
 * @since 18.04.2016
 */
public class Dog implements Pet {

    /**
     * Базовая реализация питомца.
     */
    private final Pet pet;

    public Dog(final Pet pet) {
        this.pet = pet;
    }

    /**
     * (inheritDoc)
     */
    @Override
    public void makeSound() {
        this.pet.makeSound();
        System.out.println("Gav, Gav");
    }

    /**
     * (inheritDoc)
     */
    @Override
    public String getName() {
        return this.pet.getName();
    }
}