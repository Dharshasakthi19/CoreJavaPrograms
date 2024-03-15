//Program to demonstrate the customer entity class
package day_3oops;
public class customer 
{
	private int cid;
	private String cname;
	private String address;
	
	//Getter and Setter
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "customer [cid=" + cid + ", cname=" + cname + ", address=" + address + "]";
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	//default constructor
	public customer()
	{
		this.cid=01;
		this.cname="unknown";
		this.address="somewhere";
	}
	//Parameterized constructor
	public customer(int cid,String cname,String address)
	{
		this.cid=cid;
		this.cname=cname;
		this.address=address;
	}

	}

