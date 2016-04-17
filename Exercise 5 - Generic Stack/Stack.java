public class Stack<T> {
	
	private Node<T> head;
	
	public Stack() {
		head = null;
	}
	
	public boolean empty() {
		return head == null ? true : false;
	}
	
	public void push(T data) {
		Node<T> newNode = new Node<>(data);
		if(empty()) {
			head = newNode; 
		} else {
			Node<T> aux = head;
			while(aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(newNode);
		}
	}
	
	public T pop() {
		if(empty()) {
			return null;
		} else {
			T result;
			if(head.getNext() == null) {
				result = head.getData();
				head = null;
			} else {
				Node<T> aux = head;
				while(aux.getNext().getNext() != null) {
					aux = aux.getNext();
				}
				result = aux.getNext().getData();
				aux.setNext(null);
			}
			return result;
		}
	}
}