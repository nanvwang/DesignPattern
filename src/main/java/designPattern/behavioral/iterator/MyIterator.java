package designPattern.behavioral.iterator;

public class MyIterator<T> implements Iterator<T> {

	private Collection<T> collection;
	private int pos = -1;
	
	public MyIterator(Collection<T> collection) {
		super();
		this.collection = collection;
	}

	@Override
	public T first() {
		pos = 0;
		return collection.get(pos);
	}

	@Override
	public boolean hasNext() {
		if(pos < collection.size()-1){
			return true;
		}
		return false;
	}

	@Override
	public T next() {
		if(pos < collection.size()-1){
			pos++;
		}
		return collection.get(pos);
	}

	@Override
	public T previous() {
		if(pos > 0){
			pos--;
		}
		return collection.get(pos);
	}

}
