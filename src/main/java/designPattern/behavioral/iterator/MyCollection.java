package designPattern.behavioral.iterator;

public class MyCollection<T> implements Collection<T> {

	private int size = 0;
	private int factor = 2;
	private int capacity = 5;
	private Object[] objs = new Object[capacity];
	
	@SuppressWarnings("unchecked")
	@Override
	public T get(int i) {
		return (T) objs[i];
	}

	@Override
	public Iterator<T> iterator() {
		return new MyIterator<T>(this);
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void add(T t) {
		if(size >= capacity){
			capacity *= factor;
			Object[] arr = new Object[capacity];
			for(int i=0;i<size;i++){
				arr[i] = objs[i];
			}
			objs = arr;
		}
		objs[size] = t;
		size++;
	}
	
}
