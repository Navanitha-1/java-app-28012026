import java.util.Scanner;

class MainProgram1{
    public static void main(String[] args) {
        Student1 student = new Student1(1 , "Navanitha" , "Java Full Stack " , new int[] {11,12,13,14,15} );
		
		student.printStudentInfo();
        student.subjectTotal();
        student.percentageMarks();
        student.displayOutput();
    }
}

			