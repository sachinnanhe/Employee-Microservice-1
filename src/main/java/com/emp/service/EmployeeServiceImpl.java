package com.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	//Dummy Employee List
	
	List<Employee> list = List.of(
			new Employee(1311L,"sachin","8937283822"),
			new Employee(1312L,"akshay","8937283824"),
			new Employee(1313L,"ashish","8937923822"),
			new Employee(1314L,"dhanesh","8936283822"),
			new Employee(1315L,"shubham","8924283822"),
			new Employee(1316L,"rajat","8937283822"),
			new Employee(1317L,"krishna","8937289822"),
			new Employee(1318L,"soham","8965283822"),
			new Employee(1319L,"sumit","8937323822")
			);
	

	@Override
	public Employee getEmployee(Long id) {
		return list.stream().filter(employee->employee.geteId().equals(id)).findAny().orElse(null);
	}
	
}
