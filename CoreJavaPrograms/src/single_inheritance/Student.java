//It is a derived class of citizen super class 
package single_inheritance;

public class Student extends Citizen {
private int sid;
private String course;
public Student() {
	System.out.println("student object created");	
}
public Student(int cid,String name,int age,int sid,String course){
	super(cid,name,age);
	this.sid=sid;
	this.course=course;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
@Override
public String toString() {
	return "Student [cid="+super.getCid()+",name="+super.getName()+", age="+super.getAge()+",sid="+sid+", course=" + course + "]";
}

}
