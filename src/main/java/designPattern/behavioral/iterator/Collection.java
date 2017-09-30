package designPattern.behavioral.iterator;

public interface Collection<T> {

	Iterator<T> iterator();
	T get(int i);
	int size();
	void add(T t);
}
