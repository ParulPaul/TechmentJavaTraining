package com.techment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.techment.model.Employee;

//@Repository:JPaRepository includes @Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}
