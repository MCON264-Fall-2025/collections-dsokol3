package exercises;

import edu.touro.mcon264.apps.collections.LinkedCollection;
import edu.touro.mcon264.support.LLNode;

import java.util.Iterator;

public class ExtendedLinkedCollection<T> extends LinkedCollection<T> {
   
  /**
   * @return a string representation of this collection
   */
  @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        
        LLNode<T> current = head;
        while (current != null) {
            sb.append(current.getInfo());
            if (current.getLink() != null) {
                sb.append(", ");
            }
            current = current.getLink();
        }
        
        sb.append("]");
        return sb.toString();
    }

/**
 * Counts the number of occurrences of the specified target element in this collection.
 * @param target the element to count
 * @return the number of occurrences of the target element
 */
    public int count(T target) {
        int count = 0;
        LLNode<T> current = head;
        
        while (current != null) {
            if (current.getInfo().equals(target)) {
                count++;
            }
            current = current.getLink();
        }
        
        return count;
    }

    /**
     * Removes all occurrences of the specified target element from this collection.
     * 
     * @param target the element to remove
     * @return the number of elements removed from this collection
     */
    public int removeAll(T target) {
        int removedCount = 0;

        // First, remove all occurrences at the head
        while (head != null && head.getInfo().equals(target)) {
            head = head.getLink();
            numElements--;
            removedCount++;
        }

        // Now remove occurrences from the rest of the list
        LLNode<T> current = head;
        LLNode<T> prev = null;

        while (current != null) {
            if (current.getInfo().equals(target)) {
                // Remove this node
                prev.setLink(current.getLink());
                numElements--;
                removedCount++;
                current = current.getLink();
            } else {
                // Move to next node
                prev = current;
                current = current.getLink();
            }
        }

        return removedCount;
    }
}
