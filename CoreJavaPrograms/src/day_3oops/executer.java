package day_3oops;

public class executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer c1=new customer();
		c1.setCid(112);
		c1.setCname("raja");
		c1.setAddress("puducherry");
		System.out.println("Customer id:"+c1.getCid()+"Customer name:"+c1.getCname()+
				" Customer Address:"+c1.getAddress());

		customer c2=new customer();
		c2.setCid(113);
		c2.setCname("Priya");
		c2.setAddress("Bangalore");
				
				System.out.println(c2);   //calling the tostring method
	
    customer c3=new customer();     //invoke Explicit default constructor
    System.out.println(c3);
    
    customer c4=new customer(114,"dharsha","chennai");   //invoke parameterized constructor
    System.out.println(c4);
	}

}
