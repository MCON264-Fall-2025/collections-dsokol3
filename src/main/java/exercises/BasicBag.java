package exercises;

import edu.touro.mcon264.apps.collections.ArrayCollection;
import edu.touro.mcon264.apps.collections.BagInterface;

public class BasicBag<T> extends ArrayCollection<T> implements BagInterface<T> {


    /**
     * If this bag is not empty, removes and returns a random element of the bag;
     * otherwise returns null.
     */
    @Override
    public T grab() {
        return null;
    }

    /**
     * Returns a count of all elements e in this collection such that e.equals(target).
     *
     * @param target
     */
    @Override
    public int count(T target) {
        return 0;
    }

    /**
     * Removes all elements e from this collection such that e.equals(target)
     * and returns the number of elements removed.
     *
     * @param target
     * @return
     */
    @Override
    public int removeAll(T target) {
        return 0;
    }

    /**
     * Empties this bag so that it contains zero elements.
     */
    @Override
    public void clear() {

    }

    // TODO: implement the methods in the BagInterface using an array as the underlying data structure
    // consider extending ArrayCollection<T>
    // put in the JavaDoc comments as specified in the BagInterface.
    // Which SOLID principles is being applied here?

}
