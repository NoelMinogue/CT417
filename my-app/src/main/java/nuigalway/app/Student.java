package nuigalway.app;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private int age;
	private String DOB;
	private int ID;
	private String userName;
	private ArrayList<Module> modules = new ArrayList();
	private ArrayList<Course> course = new ArrayList();
	
	public Student(String name, int age, String DOB, int ID) {
		this.name = name;
		this.age = age;
		this.DOB = DOB;
		this.ID = ID;
		this.userName = setUserName();
		
	}
	
	public String setUserName() {
		
		return(name + age);
		
	}
	
	public string getName() {
		
		return name;
		
	}
	
	public int getAge() {
		
		return age;
		
	}
	public string getDOB() {
	
	return DOB;
	
}
	public int getID() {
	
	return ID;
	
}

	
public void setName(String name) {
		
		this.name= name;
		
	}
	
	public void setAge(int age) {
		
		this.age= age;
		
	}
	public void setDOB(String DOB) {
	
	this.DOB= DOB;
	
}
	public int setID(int ID) {
	
	this.ID= ID;
	
}

	
}

