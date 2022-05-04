package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class DepartmentEntity implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptId; 
	private String deptName;
	
	@OneToMany(targetEntity = TeacherEntity.class,cascade = {CascadeType.ALL})
	private List teacherList;
	
	
//	default constructor
	public DepartmentEntity() {
		super();
	}
	
//	constructor using fields.
	public DepartmentEntity(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		
		
	}
//	constructor
	public DepartmentEntity(List teacherList) {
		super();
		this.teacherList = teacherList;
	}
	
	
//	getter and setters
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public List getTeacherList() {
		return teacherList;
	}
	

	public void setTeacherList(List teacherList) {
		this.teacherList = teacherList;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	
	
	
	
	

}
