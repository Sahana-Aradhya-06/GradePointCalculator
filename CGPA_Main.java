// CGPA CALCULATOR USING THE OBJECT ORIENTED PROGRAMMING BY JAVA.

import java.util.Scanner;
public class CGPA_Main {
    public static void main(String[]args){
        int NoOfStudents;
        Scanner scanner = new Scanner(System.in);
        CGPA_Class cg = new CGPA_Class();
        System.out.print("Enter the number of person you want to calculate the CGPA: ");
        NoOfStudents = scanner.nextInt();

        if(NoOfStudents>0 && NoOfStudents<10) {
        for(int i=1;i<=NoOfStudents;i++) { // TO MAKE THE CLASS REPEAT TDEPENDING ON THE NO OF STUDENTS CGPA YOU WANT TO CALCULATE
            System.out.println("\n--- Student " + i + " ---");
            cg.GetMarks(scanner);
            cg.Credit(scanner);
            cg.SumOfCredit (); 
            cg.FinalSgpa ();
        }
    }
    else {
        System.out.println("Please enter the valid input:");
    }
        scanner.close();
    }
}
