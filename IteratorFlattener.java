

import java.util.Iterator;

/**
 * "Flattens" nested sub-iterators into an iterator in a depth-first manner.
 *
 * Requirements:
 *  - Limit the amount of additional consumed memory to O(1).
 *
 * Example: an iterator {{1,2},{3},{4,5}} which has three sub-iterators with
 * 2, 1 and 2 elements correspondingly, presents values in this order:
 * {1, 2, 3, 4, 5}
 */
public class IteratorFlattener<E> implements Iterator<E> {
	private Iterator<Iterable<T> iterator;
	private Iterator<T> currentIterator;

	public IteratorFlattener(Iterator<Iterator<E>> root) {
		this.iterator = root;
         	this.currentIterator = null;
	}

    /**
     * Returns {@code true} if the iteration has more elements.
     *
     * @return {@code true} if the iteration has more elements
     */
    public boolean hasNext() {
	boolean hasNext = true;
	if (this.currentIterator == null) {
		if (this.iterator.hasNext()) {
			this.currentIterator = this.iterator.next().iterator();
		} else {
			return false;
		}
	}

	while(!this.currentIterator.hasNext() && this.iterator.hasNext()) {
		this.currentIterator = this.iterator.next().iterator();
	}

	return this.currentIterator.hasNext();
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    public E next() {
        return this.currentIterator.next();
    }

    /**
     * Removes from the underlying collection the last element returned
     * by this iterator (optional operation). This method can be called
     * only once per call to {@link #next}.
     *
     * @throws IllegalStateException if the {@code next} method has not
     *         yet been called, or the {@code remove} method has already
     *         been called after the last call to the {@code next}
     *         method
     */
    public void remove() {
        this.currentIterator.remove();
    }
}

