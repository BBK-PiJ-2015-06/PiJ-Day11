public class Company {
	
	private DoubleLinkedList<String> employeeNames;
	private DoubleLinkedList<Integer> employeeNI;
	
	public Company() {
		employeeNames = new DoubleLinkedList<>();
		employeeNI = new DoubleLinkedList<>();
	}
	
	public void addEmployee(String name, int nINumber) {
		employeeNames.add(name);
		employeeNI.add(nINumber);
	}
	
	public void deleteEmployee(int index) {
		employeeNames.remove(index);
		employeeNI.remove(index);
	}
	
	public void prettyPrint() {
		System.out.println("Names: " + employeeNames);
		System.out.println("NI: " + employeeNI);
	}
}