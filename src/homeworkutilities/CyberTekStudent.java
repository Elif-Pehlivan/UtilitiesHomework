package homeworkutilities;

import homeworkutilities.StudentUtilities;

public class CyberTekStudent {
	
	private String firstName;
	private String lastName;
	private String email;
	private String studentId;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	// Create a Constructor
	public CyberTekStudent(String firstName,String lastName){
		
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(StudentUtilities.generateEmail(firstName));
		this.setStudentId(StudentUtilities.generateId(firstName));
		
		}
	  

}
