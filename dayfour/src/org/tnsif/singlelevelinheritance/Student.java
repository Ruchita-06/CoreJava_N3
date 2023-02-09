package org.tnsif.singlelevelinheritance;

public class Student extends Citizen {
	private int rollno;
	private String studname;
	//generate getters and setters

	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	
	
	public Student(int rollno, String studname) {
		super();
		this.rollno = rollno;
		this.studname = studname;
	}
	public Student() {
		super();
	}
	
	
	public Student(int rollno, String studname, String name, String adharno, String city, long mobno) {
		super(name, adharno, city, mobno);
		this.rollno = rollno;
		this.studname = studname;
	}
	public Student(String name, String adharno, String city, long mobno) {
		super(name, adharno, city, mobno);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studname=" + studname + ", getRollno()=" + getRollno()
				+ ", getStudname()=" + getStudname() + ", getName()=" + getName() + ", getAdharno()=" + getAdharno()
				+ ", getCity()=" + getCity() + ", getMobno()=" + getMobno() + "]";
	}
	
}