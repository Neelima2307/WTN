package com.wipro.OopsInheritance;

class Person {
	String VariableName; 
}
class Employee extends Person {
	double AnnualSalary;
	int Year;
	String InsuranceNumber;
}
class GetSet extends Employee{
	GetSet(String VariableName) {
		this.VariableName=VariableName;
	}
	
	GetSet(double AnnualSalary, int Year, String InsuranceNumber){
		this.AnnualSalary=AnnualSalary;
		this.Year=Year;
		this.InsuranceNumber=InsuranceNumber;
	}
	
	void getPerson() {
		System.out.println("Member variable name : "+VariableName);
	}
	
	void getEmp(){
		System.out.println("Annual Salary is : "+AnnualSalary);
		System.out.println("Year the employee started to work : "+Year);
		System.out.println("The national insurance number :"+InsuranceNumber);
	}
}

public class Ex2_OI {
	public static void main(String[] args) {
		GetSet gs1=new GetSet("Neelu");
		GetSet gs2=new GetSet(100000, 2021, "WTN3");
		gs1.getPerson();
		gs2.getEmp();
	}
}


