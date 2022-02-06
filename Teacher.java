package course.management.system;

public class Teacher {

	 private int id;
	 private String name;
	 private int Salary;
	 private int SalaryEarned;
	 
public Teacher(int id,String name,int Salary){
	this.id=id;
	this.name=name;
	this.Salary=Salary;
	this.SalaryEarned=0;
	
}

public int getid(){
	return id;
	
}
public String getname(){
	return name;
	
}
public int getSalary(){
	return Salary;
}
public void setSalary(int Salary){
	this.Salary=Salary;
}
public void receiveSalary(int Salary){
    SalaryEarned+=Salary;
    
}


@Override
public String toString() {
    return "Name of the Teacher: " + name
            +" Total salary earned so far $"
            + SalaryEarned;
}
}

