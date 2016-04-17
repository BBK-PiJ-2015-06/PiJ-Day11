public class Node<T> {
	
	private T data;
	private Node<T> next;
	
	public Node(T data) {
		setData(data);
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public void setNext(Node<T> nextNode) {
		next = nextNode;
	}
	
	public T getData() {
		return data;
	}
	
	public Node<T> getNext() {
		return next;
	}
}