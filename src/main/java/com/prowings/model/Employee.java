package com.prowings.model;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
@ToString
@Builder
public class Employee {

	private int id;

	private String empName;

	private String empAddress;

//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Employee(int id, String empName, String empAddress) {
//		this.id = id;
//		this.empName = empName;
//		this.empAddress = empAddress;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getEmpName() {
//		return empName;
//	}
//
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//
//	public String getEmpAddress() {
//		return empAddress;
//	}
//
//	public void setEmpAddress(String empAddress) {
//		this.empAddress = empAddress;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", empName=" + empName + ", empAddress=" + empAddress + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(empAddress, empName, id);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return Objects.equals(empAddress, other.empAddress) && Objects.equals(empName, other.empName) && id == other.id;
//	}

}
