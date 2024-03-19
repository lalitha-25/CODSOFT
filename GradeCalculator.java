import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {       
       Scanner scan = new Scanner(System.in);
       int i,avg,total;
       System.out.println("Enter Number of subjects");
       int tsubs = scan.nextInt();    
       total = 0;
       for(i=1;i<=tsubs;i++){
        System.out.println("Enter marks obtained in Subject" + i );
        int marks = scan.nextInt();   
        total +=marks;
       }
       avg = (total/tsubs) ;
       char grade;
        if (avg >= 90) {
            grade = 'A';
        } 
        else if (avg >= 80) {
            grade = 'B';
        } 
        else if (avg >= 70) {
            grade = 'C';
        } 
        else if (avg >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
            System.out.println();
            System.out.println("Total marks obtained"  +  total);
            System.out.println("Total Percentage obtained"  +  avg);
            System.out.println("Grade obtained"  +  grade);
    scan.close();  
    }

}