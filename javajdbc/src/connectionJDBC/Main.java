package connectionJDBC;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO employeeOne = new EmployeeDAO();
		EmployeeModel employeeModelOne = new EmployeeModel();
		System.out.println(employeeOne.getEmployeeById(1002));

	}

}
