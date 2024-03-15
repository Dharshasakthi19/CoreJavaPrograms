//Employee Entity to show Static variables
package statickeyword;

public class Employee_st {
//Instance variables
	String name;
	int id;
	
	//static  variable
	static String companyName ="TNS";
	
	//Parameterized constructor
	
	Employee_st(String name,int id){
		this.name=name;
		this.id=id;
	}

	@Override
	public String toString() {
		return "Employee_st [name=" + name + ", id=" + id + "]";
	}
}
