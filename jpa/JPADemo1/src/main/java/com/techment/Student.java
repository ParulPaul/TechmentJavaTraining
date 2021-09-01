package com.techment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {

	    @Id
	    private int studentId;  
	    private String dept;  
	    private String name;
		
	    public Student(int studentId, String dept, String name) {
			super();
			this.studentId = studentId;
			this.dept = dept;
			this.name = name;
		}
	    
	    public Student() {}

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	    
	    
	    
	    
}
