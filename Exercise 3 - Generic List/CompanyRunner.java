public class CompanyRunner {
	public static void main(String[] args) {
		Company myCompany = new Company();
		myCompany.addEmployee("George", 1);
		myCompany.addEmployee("Ann", 2);
		myCompany.addEmployee("Bob", 3);
		myCompany.addEmployee("Claire", 4);
		myCompany.addEmployee("David", 5);
		
		myCompany.prettyPrint();
	}
}