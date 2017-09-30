package designPattern.behavioral.iterator;

public interface Iterator<T> {

	T previous();
	T next();
	boolean hasNext();
	T first();
}
