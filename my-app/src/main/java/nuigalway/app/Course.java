package nuigalway.app;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course {
	
	private String name;
	private ArrayList<Student> students = new ArrayList();
	private ArrayList<Module> modules = new ArrayList();
	private DateTime startDate;
    private DateTime endDate;
	
	
	public Student(String name, DateTime startDate, DateTime endDate) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		
	}

	public string getName() {
		
		return name;
		
	}
	
	

	
public void setName(String name) {
		
		this.name= name;
		
	}

public void setStartDate(DateTime startDate) {
	
	this.startDate= startDate;
	
}

public DateTime getStartDate() {
	
	return startDate;
	
}

public void setEndDate(DateTime endDate) {
	
	this.endDate= endDate;
	
}

public DateTime getEndDate() {
	
	return endDate;
	
}
	
public boolean addStudent(Student student) {
	
students.add(student);
return true;
}
public boolean addModule(Module module) {
	
modules.add(module);

return true;
}




}

	


