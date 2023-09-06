package com.prowings.test;

import com.prowings.model.Employee;

public class TestLombok {
	
	public static void main(String[] args) {
		
		
		Employee emp=new Employee();
		
		emp.setId(1);
		emp.setEmpName("rutu");
		emp.setEmpAddress("jalna");
		
		System.out.println(emp);
		
		System.out.println("E: ID" +emp.getId());
		System.out.println("E: name" +emp.getEmpName());
		System.out.println("E: Address" +emp.getEmpAddress());
		
		System.out.println(emp.hashCode());
		
		Employee emp1=Employee.builder().id(2)
				.empName("komal")
				.empAddress("parbhani").build();
		
		System.out.println(emp1);
	}

}
