package mulilevel_inheritance;

import java.util.Date;

public class Person {
	

 private String name;
 private long contactNo;
private Date dateofBirth;
 
 public Person(String name, long contactNo, Date dateofBirth) {
	 super();
	 this.name=name;
	 this.contactNo=contactNo;
	 this.dateofBirth=dateofBirth;
	 
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getContactNo() {
	return contactNo;
}

public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}

public Date getDateofBirth() {
	return dateofBirth;
}

public void setDateofBirth(Date dateofBirth) {
	this.dateofBirth = dateofBirth;
}

@Override
public String toString() {
	return "Person [name=" + name + ", contactNo=" + contactNo + ", dateofBirth=" + dateofBirth + "]";
}
}
