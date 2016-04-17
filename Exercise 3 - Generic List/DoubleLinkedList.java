public class DoubleLinkedList<T> {
	
	private Node<T> startList;
	
	public DoubleLinkedList() {
		startList = null;
	} 
	
	public int size() {
		if(startList == null) {
			return 0;
		} else {
			int result = 1;
			Node<T> aux = startList;
			while(aux.getNext() != null) {
				result ++;
			}
			return result;
		}
	}
	
	public void add(T data) {
		Node<T> newNode = new Node<>(data);
		if(startList == null) {
			startList = newNode;
			return;
		}
		Node<T> index = startList;
		while(index.getNext() != null) {
			index = index.getNext();
		}
		index.setNext(newNode);
		newNode.setPrev(index);
	}
	
	@Override
	public String toString() {
		if(startList == null) {
			return "There are no entries in this list!";
		} else {
			String output = "";
			Node<T> current = startList;
			while(current.getNext() != null) {
				output = output + current.getData().toString() + " ";
				current = current.getNext();
				if(current.getNext() == null) {
					output = output + current.getData().toString();
				}
			}
			return output;
		}
	}

	public T remove(int index) {
		if(startList == null || index < 0  || index > this.size() - 1) {
			return null;
		} else {
			Node<T> aux = startList;
			for(int i = 0; i < index; i++) {
				aux = aux.getNext();
			}
			aux.getPrev().setNext(aux.getNext());
			aux.getNext().setPrev(aux.getPrev());
			return aux.getData();
		}
	}
		
}