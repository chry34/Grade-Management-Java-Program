package GradeManager;
import java.util.Scanner;
import java.util.Array;
import java.util.Collections;

public class Source {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Number of Students
		System.out.print("Enter the Number of Students: ");
		int studentAmount = input.nextInt();
		input.nextLine();
		System.out.print("Enter the Total Score of Exam: ");
		int scoreAmount = input.nextInt();
		input.nextLine();

		// Array Storage
        String[] names = new String[studentAmount];
        double[] score = new double[studentAmount];
        		
        int i = 0;
        int x = 0;
        
        // Input Name and Grade
        for (i = 0; i < studentAmount; i++) {
            System.out.print("Enter name of student #" + (i + 1) + ": ");
            names[i] = input.nextLine();
            	
            System.out.print("Enter Score of Student #" + (i + 1) + ": ");
            score[i] = input.nextDouble();
            input.nextLine();
            
//    		double[i] scorePercentage = (score / scoreAmount) * 100;
            }

        	// secret thing
        	for (int z = 0; z < 129; z++) {
        	System.out.println(" ");
        	}
            
            System.out.println("---- Student Information ----");
            for (x = 0; x < studentAmount; x++) {

        		
 				System.out.println("Name: " + names[x]);
 //				System.out.println("Score: " + scorePercentage);
 				System.out.println("Grade: " + score[x]);
 				System.out.println(" ");
 			}
            
            for (int t = 0; t < studentAmount - 1; t++) {
                for (int j = t + 1; j < studentAmount; j++) {

                    if (score[t] < score[j]) {

                        // Swap score
                        double tempGrade = score[t];
                        score[t] = score[j];
                        score[j] = tempGrade;

                        // Swap names too
                        String tempName = names[t];
                        names[t] = names[j];
                        names[j] = tempName;
                    }
                }
            }
            
            System.out.println("===== Ranking =====");
            
            for (int r = 0; r < studentAmount; r++) {
                System.out.println("Rank " + (r + 1) + ": " + names[r] + " - " + score[r]);
                
                if (score[r] >= 75) {
                    System.out.println("PASSED");
                    System.out.println("");
                } else {
                    System.out.println("FAILED");
                    System.out.println("");
                }
            }
	}

}
