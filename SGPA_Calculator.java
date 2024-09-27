// CALCULATION OF SGPA BY USING THE PRINCIPLE ORIENTED PROGRAMMING OF JAVA

import java.util.Scanner;

public class SGPA_Calculator {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int sem;
        int no_sub = 0;
        Double result = 0.0;
        System.out.print("Enter your branch (e.g., CSE, ECE, EEE, ME, etc.): ");
        String branch = scanner.nextLine();
        System.out.println("\n 1. 1st sem \n 2. 2nd sem \n 3. 3rd sem \n 4. 4th sem \n 5. 5th sem \n 6. 6th sem \n 7. 7th sem \n 8. 8th sem \n");
        System.out.print("Enter the semester number (1 to 8) for which you want to calculate the SGPA: ");
        sem = scanner.nextInt();
        if(sem == 1 || sem == 2 || sem == 6) {
            no_sub = 8;
            result = SGPA(no_sub, scanner);
        }
        else if(sem ==3 || sem == 4 || sem == 5) {
            no_sub = 9;
            result = SGPA(no_sub, scanner);
        }
        else if(sem == 7 && (branch.equalsIgnoreCase("CSE") || branch.equalsIgnoreCase("ISE") || branch.equalsIgnoreCase("AI&DS")))
        {
            no_sub = 7;
            result = SGPA(no_sub, scanner);
        }
    
        else if(sem == 7 && (branch.equalsIgnoreCase("E&C") || branch.equalsIgnoreCase("E&E") || branch.equalsIgnoreCase("CV") || branch.equalsIgnoreCase("ME"))) 
        {
            no_sub = 7;
            result = SGPA(no_sub, scanner);
        }
        else{
            System.out.println("\nInvalid input of Semister or Branch");
        }
        if(no_sub > 0) {
        System.out.println("\nThe SGPA obtained in " +sem+ "sem is : " +result);
        }
        scanner.close();
    }
    
public static Double SGPA(int num_of_sub, Scanner scanner) {
    int [] subj = new int [num_of_sub];
    int [] grade = new int [num_of_sub];
    char [] grade_c = new char [num_of_sub];
    int [] credit = new int [num_of_sub];
    int [] weigtedGrade = new int [num_of_sub];
    int sumOfWeigtedGrade = 0;
    int sumOfCredit = 0;
    
    System.out.println("\nEnter the marks for " +num_of_sub+ " subject");
    for (int i = 0; i < num_of_sub; i++) {
        System.out.print((i+1)+". ");
      subj[i]=scanner.nextInt();
    }
    for (int i = 0; i < num_of_sub; i++) {
        if(subj[i]>=90 && subj[i] <=100){
            grade[i]=10;
            grade_c[i]='O';
        }
        else if(subj[i]>=80 && subj[i] <=89){
            grade[i]=9;
            grade_c[i]='S';
        }
        else if(subj[i]>=70 && subj[i] <=79){
            grade[i]=8;
            grade_c[i]='A';
        }
        else if(subj[i]>=60 && subj[i] <=69){
            grade[i]=7;
            grade_c[i]='B';
        }
        else if(subj[i]>=50 && subj[i] <=59){
            grade[i]=6;
            grade_c[i]='C';
        }
        else if(subj[i]>=45 && subj[i] <=49){
            grade[i]=5;
            grade_c[i]='D';
        }
        else if(subj[i]>=40 && subj[i] <=44){
            grade[i]=4;
            grade_c[i]='E';
        }
        else if(subj[i]>=0 && subj[i] <=40){
            grade[i]=0;
            grade_c[i]='F';
        }
    }
    System.out.println("\nNOTE: To get the credited marks refer syllabus copy.\n");
    System.out.println("Enter the credit point to subject in the order you have entered marks:");
    for (int i = 0; i < num_of_sub; i++) {
        System.out.print((i+1)+". ");
        credit[i] = scanner.nextInt();
    }
    for (int i = 0; i < num_of_sub; i++) {
        weigtedGrade[i] = grade[i] * credit[i]; 
    }
    
    for (int i = 0; i < num_of_sub; i++) {
        sumOfWeigtedGrade +=  weigtedGrade[i];
        sumOfCredit +=  credit[i];
    }
     return (double)sumOfWeigtedGrade / sumOfCredit;  
}
}