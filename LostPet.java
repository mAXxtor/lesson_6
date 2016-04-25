/**
 * Описывает потерянного питомца.
 * @author mAXxtor
 * @since 18.04.2016
 */
public abstract class LostPet {

    /**
     * Опасен питомец или нет?
     * @return true если опасен
     */
    public boolean isDanger() {
        return true;
    }

    /**
     * Вернуть адрес, где поймали питомца.
     * @return адрес
     */
    abstract String getWhereCatch();
}