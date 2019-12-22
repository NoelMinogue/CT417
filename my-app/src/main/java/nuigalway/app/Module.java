package nuigalway.app;

import java.util.ArrayList;

public class Module {
	
	private String name;
	private ArrayList<Student> students = new ArrayList();
	private ArrayList<Course> courses = new ArrayList();
	
	
	public Student(String name) {
		this.name = name;
		
	}

	public string getName() {
		
		return name;
		
	}
	
	

	
public void setName(String name) {
		
		this.name= name;
		
	}
	
public boolean addStudent(Student student) {
	
students.add(student);

return true;
}
public boolean addCourse(Course course) {
	
courses.add(course);

return true;
}


}

	


