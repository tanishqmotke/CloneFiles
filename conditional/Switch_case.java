package conditional;

public class Switch_case {
	static String customer_name = "pooja";

	public static void main(String[] args) {
		Database database = new Database();
		database.Customer();

	}

}

class Database {
	 
	String Sankalp_Name="Sankalp";
	String Sankalp_Address="BNCOE";
	float Sankalp_Salary=1000.01f;
	
	String Pooja_Name="Pooja";
	String Pooja_Address="nagpur";
	float Pooja_salary=999.01f;
	
	String Tanishq_Name="tanishq";
	String Tanishq_Address="bncoe";
	float Tanishq_Salary=1.01f;
	
	public void Customer() {

		String sankalp_name = Switch_case.customer_name;

		switch (sankalp_name) {

		case ("sankalp"):

			System.out.println("Bank balance: 50"+"\n"+"NAME:"+Sankalp_Name +"\n"+"ADDRESS:"+Sankalp_Address+"\n"+"SALARY"+Sankalp_Salary);
			break;

		case ("pooja"):

			System.out.println("Bank balance : 100000000000000"+"\n"+"NAME:"+Pooja_Name +"\n"+"ADDRESS:"+Pooja_Address+"\n"+"SALARY"+Pooja_salary);
			break;

		case ("tanishq"):
			System.out.println("1 million"+"\n"+"NAME:"+Tanishq_Name +"\n"+"ADDRESS:"+Tanishq_Address+"\n"+"SALARY"+Tanishq_Salary);
			break;

		default:

			System.out.println("No user");

		}

	}
}