package course.management.system;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		

		Teacher Ram=new Teacher(1,"Ram",500);
		Teacher Swapna=new Teacher(2,"Swapna",700);
		Teacher varsha=new Teacher(3,"varsha",600);

	
	List<Teacher> teacherList = new ArrayList<>();
    teacherList.add(Ram);
    teacherList.add(Swapna);
    teacherList.add(varsha);


    Student Susmitha = new Student(1,"Susmitha",4);
    Student Sujwal = new Student(2," Sujwal",12);
    Student Ravi = new Student(3,"Ravi",5);
    List<Student> studentList = new ArrayList<>();

    studentList.add(Susmitha);
    studentList.add(Sujwal);
    studentList.add(Ravi);

	


    School ghs = new School(teacherList,studentList);
    System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

    
    System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

    System.out.println("------Making SCHOOL PAY SALARY----");
    Swapna.getSalary();
    System.out.println("GHS has spent for salary to " + Swapna
    +" and now has $" + ghs.getTotalMoneyEarned());

    Ram.receiveSalary(Ram.getSalary());
    System.out.println("GHS has spent for salary to " + Ram
            +" and now has $" + ghs.getTotalMoneyEarned());


    System.out.println(Ram);

  


}


}




