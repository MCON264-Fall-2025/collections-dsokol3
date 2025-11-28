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
        if (isEmpty()) {
            return null;
        }
        int randomIndex = (int) (Math.random() * size());
        T e =elements[randomIndex];
        remove(e);
        return e;
    }

    /**
     * Returns a count of all elements e in this collection such that e.equals(target).
     *
     * @param target
     */
    @Override
    public int count(T target) {
        int cnt = 0;
        for (int i = 0; i < size(); i++) {
            if (elements[i].equals(target)) {
                cnt++;
            }
        }
        return cnt;
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
        int cnt = count(target);
        for (int i = 0; i < cnt; i++) {
            remove(target);
        }
        return cnt;
    }

    /**
     * Empties this bag so that it contains zero elements.
     */
    @Override
    public void clear() {
        int size = size();
        for (int i = 0; i < size; i++) {
            remove(elements[i]);
        }
        numElements =0;
    }

    // TODO: implement the methods in the BagInterface using an array as the underlying data structure
    // consider extending ArrayCollection<T>
    // put in the JavaDoc comments as specified in the BagInterface.
    // Which SOLID principles is being applied here?
    //open/closed principle. opened for extension, closed for modification.

}
