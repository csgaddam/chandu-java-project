
//Here e1 lost the reference and the garbace collector will destroy the e1 object

class Employeee {
	int id;
	String name;

	Employeee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employeee e1 = new Employeee(1, "chandra");
		Employeee e2 = new Employeee(2, "gaddam");
		e1 = e2;
		System.out.println(e1.id);
	}

}
