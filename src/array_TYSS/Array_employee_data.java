package array_TYSS;

public class Array_employee_data {//array_{method_with_formal_argument}

///array of object via method
	String name;
	long salary;
	String designation;
	String role;

	public Array_employee_data(String name, long salary, String designation, String role) {
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.role = role;
	}


	public static void display(Array_employee_data data[]) {
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i].name+" "+data[i].salary+" "+data[i].designation+" "+data[i].role);
		}

	}


	public static void main(String[] args) {

		Array_employee_data data[]=new Array_employee_data[3];
		data[0]=new Array_employee_data("irfan", 124578986523l, "QA", "Testing");
		data[1]=new Array_employee_data("raman", 124578523l, "QC", "Testing");
		data[2]=new Array_employee_data("sudeer", 124578523l, "database", "Testing");
		display(data);
	}

}
