package course.management.system;

public class Student {
 private int id;
 private String name;
 private int grade;
 private int feespaid;
 private int feestotal;
 
 public Student(int id,String name,int grade){
	 this.feespaid=0;
	 this.feestotal=45000;
	 this.id=id;
	 this.name=name;
	 this.grade=grade;
	 
 }
 
 public void setGrade(int grade){
	 this.grade=grade;
 }
 public  void payFees(int fees){
     feespaid+=fees;
 
 }

public int getid(){
	return id;
}
public String getname(){
	return name;
}
public int getGrade(){
	return grade;
}
public int getFeespaid(){
	return feespaid;
}
public int getfeestotal(){
	return feestotal;
}
public int getRemainingFees(){
    return feestotal-feespaid;
}
public String toString() {
    return "Student's name :"+name+
            " Total Fees paid so far $"+ feespaid;
}
}


