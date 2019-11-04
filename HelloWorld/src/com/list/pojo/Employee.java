package com.list.pojo;

public class Employee implements Comparable<Employee>{

	
	private Integer empId;
	private Integer age;
	private Integer phone;
	private String city;
	
	
	
	
	
	
	public Employee(Integer empId, Integer age, Integer phone, String city) {
		super();
		this.empId = empId;
		this.age = age;
		this.phone = phone;
		this.city = city;
	}
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
		
	
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", age=" + age + ", phone=" + phone + ", city=" + city + "]";
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//return this.getEmpId()-o.getEmpId();
		return this.getCity().compareTo(o.getCity());
	}


		
	
}
