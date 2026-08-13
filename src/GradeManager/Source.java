package GradeManager;
import java.util.Scanner;
//import java.util.Array;
//import java.util.Collections;

public class Source {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("===== Grade Management System =====");
		
		// pangalan nila
		System.out.print("Enter the Number of Students: ");
		int studentAmount = input.nextInt();
		input.nextLine();
		System.out.print("Enter the Total Score of Exam: ");
		double totalScore = input.nextInt();
		input.nextLine();

		// arrays
        String[] names = new String[studentAmount];
        double[] score = new double[studentAmount];
     
        
        // name and grade whahaha
        for (int i = 0; i < studentAmount; i++) {
            System.out.print("Enter name of student #" + (i + 1) + ": ");
            names[i] = input.nextLine();
            	
            System.out.print("Enter Score of Student #" + (i + 1) + ": ");
            score[i] = input.nextDouble();
            input.nextLine();
            }

        	// secret thing wag mona pansinin
        	for (int z = 0; z < 129; z++) {
        	System.out.println(" ");
        	}
            
        	// student info
            System.out.println("====== Student Information =====");
            for (int x = 0; x < studentAmount; x++) {
            	double scorePercentage = (score[x]/totalScore)*100;
 				System.out.println("Name: " + names[x]);
 				System.out.println("Score: " + score[x]);
 				
 				if (scorePercentage >= 75) {
 					System.out.println("Status: PASSED");
 					System.out.println(" ");
 				} else {
 					System.out.println("Status: FAILED");
 					System.out.println(" ");
 				}
 				
 			}
            
            System.out.println(" ");
            
            // sort (magulo to ah)
            for (int t = 0; t < studentAmount - 1; t++) {
                for (int j = t + 1; j < studentAmount; j++) {

                    if (score[t] < score[j]) {

                        double tempGrade = score[t];
                        score[t] = score[j];
                        score[j] = tempGrade;

                        String tempName = names[t];
                        names[t] = names[j];
                        names[j] = tempName;
                    }
                }
            }
            
            // rank na at total average
            System.out.println("===== Ranking =====");
            
            for (int r = 0; r < studentAmount; r++) {
            	double scoreConvert = (score[r]/totalScore)*100;
            	if (scoreConvert >= 75  ) {
                System.out.println("Rank " + (r + 1) + ": " + names[r] + " - " + score[r] + "/" + totalScore);
                System.out.println("Average: " + scoreConvert + "%");
                System.out.println(" ");
            	} else {
                    System.out.print("");
            	}

				// kulang nalang yung pagkuha ng kabuoan hahah pls tapusin nas
            }
	}
}
