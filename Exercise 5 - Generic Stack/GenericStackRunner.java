public class GenericStackRunner {
	public static void main(String[] args) {
		Stack<Integer> intStack = new Stack<>();
		
		System.out.println(intStack.empty());
		
		intStack.push(4);
		intStack.push(2);
		intStack.push(5);
		intStack.push(1);
		
		System.out.println(intStack.empty());
		
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		
		intStack.push(100);
		
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
	}
}