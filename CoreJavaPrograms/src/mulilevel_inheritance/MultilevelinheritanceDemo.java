//Program to demonstrate MultiLevel inheritance
package mulilevel_inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MultilevelinheritanceDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person p1=new Person("Priya",843860637,new Date(2003,11,19));
		System.out.println(p1);
		
		p1=new Employee("Gowtham",904748449,new Date (2004,04,8),"Sales",45000);
		System.out.println(p1);
	
		p1=new LevelOneEmployee("Sakthi",978665126,new Date (1970,12,4),"Account",85000, 200,"Signing Authority");
		System.out.println(p1);
		

	}

}
