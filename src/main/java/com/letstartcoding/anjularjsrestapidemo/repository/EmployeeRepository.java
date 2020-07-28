package com.letstartcoding.anjularjsrestapidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letstartcoding.anjularjsrestapidemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	
	Employee findByName(String name);

}
