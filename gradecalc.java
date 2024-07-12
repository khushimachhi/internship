import java.util.Scanner;

public class gradecalc{
    public static void main(String[] args) {

        //user input
        Scanner sc = new Scanner(System.in);
        
        //Enter marks
        System.out.println("Enter total number of subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        for(int i=1; i<=subjects; i++){
            System.out.println("Enter marks for subject " + i + " out of 100: ");
            int marks = sc.nextInt();

            while(marks < 0 || marks > 100){
                System.out.println("Invalid marks. Enter marks between 0 and 100: ");
                System.out.println("Enter marks for subject " + i + "out of 100: ");
                marks = sc.nextInt();
            }

            totalMarks += marks;
        }

        System.out.println("Student Results: ");
        System.out.println("total marks in all subjects" + totalMarks);

        //calculate average percentage
        int avgPercent = totalMarks / subjects;
        System.out.println("Average percentage: " + avgPercent + "%");

        //calculate grade
        if(avgPercent >=90){
            System.out.println("Grade: O+");
        }
        else if(avgPercent >=85){
            System.out.println("Grade: O");
        }
        else if(avgPercent >= 80){
            System.out.println("Grade: A+");
        }
        else if(avgPercent >=75){
            System.out.println("Grade: A");
        }
        else if(avgPercent >= 70){
            System.out.println("Grade: B+");
        }
        else if(avgPercent >=65){
            System.out.println("Grade: B");
        }
        else if(avgPercent >= 60){
            System.out.println("Grade: C+");
        }
        else if(avgPercent >=55){
            System.out.println("Grade: C");
        }
        else if(avgPercent >= 50){
            System.out.println("Grade: D+");
        }
        else if(avgPercent >= 45){
            System.out.println("Grade: D");
        }
        else if(avgPercent >= 40){
            System.out.println("Grade: E+");
        }
        else if(avgPercent >= 35){
            System.out.println("Grade: E");
        }
        else{
            System.out.println("Fail");
        }

    }
}