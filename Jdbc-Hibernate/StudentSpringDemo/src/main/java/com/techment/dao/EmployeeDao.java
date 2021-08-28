package com.techment.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techment.model.Employee;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}  
	
	public int saveEmployee(Employee e){  
	    String query="insert into employees values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";  
	    return jdbcTemplate.update(query);  
	}  
	public int updateEmployee(Employee e){  
	    String query="update employees setname='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteEmployee(Employee e){  
	    String query="delete from employees where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	  
	
	
}
