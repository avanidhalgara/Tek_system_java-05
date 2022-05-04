package connectionJDBC;

public class EmployeeModel {
	 private int emolyeeNumber;
	 private String firstName;
	 private String lastName;
//	 private String jobTitle;
	 private String extension;
	
	public EmployeeModel() {
		
	}

	public EmployeeModel(int emolyeeNumber, String firstName, String lastName, String extension) {
	
		this.emolyeeNumber = emolyeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
//		this.jobTitle = jobTitle;
		this.extension = extension;
	}

	public int getEmolyeeNumber() {
		return emolyeeNumber;
	}

	public void setEmolyeeNumber(int emolyeeNumber) {
		this.emolyeeNumber = emolyeeNumber;
	}

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

//	public String getJobTitle() {
//		return jobTitle;
//	}
//
//	public void setJobTitle(String jobTitle) {
//		this.jobTitle = jobTitle;
//	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	

}
