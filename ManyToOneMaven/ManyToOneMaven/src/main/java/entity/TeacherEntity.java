package entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

@Entity
@Table
public class TeacherEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teachID;
	private String salary;
	private String teacherName;
	
//	foreign key = department
//	@ManyToOne
//	@JoinColumn(name="fkey_dept")
//	private DepartmentEntity department;

	
	
//	construtor with fields
//	public TeacherEntity(int teachID, String salary, String teacherName, DepartmentEntity department) {
//		super();
//		this.teachID = teachID;
//		this.salary = salary;
//		this.teacherName = teacherName;
//		this.department = department;
//	}
	public TeacherEntity(int teachID, String salary, String teacherName) {
		super();
		this.teachID = teachID;
		this.salary = salary;
		this.teacherName = teacherName;
		
	}


// default constructor
	public TeacherEntity() {
		super();
	}

//getter and setters
	public int getTeachID() {
		return teachID;
	}


	public void setTeachID(int teachID) {
		this.teachID = teachID;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getTeacherName() {
		return teacherName;
	}


	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}


//	public DepartmentEntity getDepartment() {
//		return department;
//	}


//	public void setDepartment(DepartmentEntity department) {
//		this.department = department;
//	}
//	
	
	
	
	
	
	

}
