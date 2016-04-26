/**
 * Описывает поведение питомца.
 * @author mAXxtor
 * @since 18.04.2016
 */
public interface Pet {

    /**
    * Издать звук.
    */
    void makeSound();

    /**
    * Имя питомца.
    */
	String getName();

    /**
     * Set name of pet
     * @param name of pet
     */
    void setName(final String name);
}