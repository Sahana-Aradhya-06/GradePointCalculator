import java.util.Scanner;
public class CGPA_Class {
    double [] SemMarks = new double[8];
    int [] SemCredit = new int[8];
    int SumCredit = 0;
    double SGPA = 0.0;

    public void GetMarks(Scanner s) {
        System.out.println("Enter the SGPA of all the Sem and respective credit: ");
        for(int i=0;i<8;i++) {
            System.out.print((i+1)+". Sem: ");
            SemMarks[i] = s.nextDouble();
        } 
        
    }
    
        public void Credit(Scanner sc) {
            System.out.println("Please enter the SGPA and corresponding credits for each of the 8 semesters:");
            for(int i=0;i<8;i++) {
                System.out.print((i+1)+". Sem: ");
                SemCredit[i] = sc.nextInt();
            }
        }

        public void SumOfCredit () {
            for(int i=0;i<8;i++) {
            SumCredit += SemCredit[i];
            }
        }
    
        public void FinalSgpa () {
            double total = 0.0;
            for(int i=0;i<8;i++){
            total  += (SemMarks[i] * SemCredit[i]);
            }
            if(total != 0){
                SGPA = total / SumCredit;
            }
            else {
                System.out.println("Error: Total credits cannot be zero.");
            }
            System.out.println("The CGPA of your Eingeering Journey is " + SGPA);
        }
}

