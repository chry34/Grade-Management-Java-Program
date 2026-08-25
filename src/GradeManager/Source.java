package GradeManager;
import java.util.Scanner;

public class Source1 {
	 public static String getOrdinal(int num) {
		 
		 // declare ordinal para sa rank
	        if (num >= 11 && num <= 13) return num + "th";
	        switch (num % 10) {
	            case 1: return num + "st";
	            case 2: return num + "nd";
	            case 3: return num + "rd";
	            default: return num + "th";
	        }
	    }
	 	
	 	// store num of students and declare score of exam ng mga students bwhwhahwahwhawh
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("===== Grade Management System =====");
	        
	        System.out.print("Enter the Number of Students: ");
	        int studentAmount = input.nextInt();
	        input.nextLine();
	        System.out.print("Enter the Highest Possible Score: ");
	        double totalScore = input.nextDouble();
	        
	        input.nextLine();

	        String[] names = new String[studentAmount];
	        double[] score = new double[studentAmount];
            double sum = 0;
	        
	        for (int m = 1; m < 69420; m++) {
	        	System.out.println(" ");
	        }
	        
	        for (int i = 0; i < studentAmount; i++) {
	            System.out.println("===== Information of Student #" + (i + 1) + " =====");
	            
	            System.out.print("Enter NAME: ");
	            names[i] = input.nextLine();
	            System.out.print("Enter SCORE: ");
	            score[i] = input.nextDouble();
	            
	            System.out.println(" ");
	            input.nextLine();
	        }
	        
	        // legends lang nakakaalam
	        for (int z = 0; z < 129; z++) System.out.println();
	        
	        // info and status of students
	        System.out.println("====== Student Information =====");
	        for (int x = 0; x < studentAmount; x++) {
            	double scorePercentage = (score[x]/totalScore)*100;
 				System.out.println("Name: " + names[x]);
 				System.out.println("Score: " + score[x] + "/" + totalScore);
 				
    	        sum += score[x];
 				
 				if (scorePercentage >= 75) {
 					System.out.println("Status: PASSED");
 				} else {
 	 				System.out.println("Status: FAILED");
 				}
	            System.out.println(" ");
	        }
	        
	        // magulo to
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
	        
	        // rank na
	        System.out.println("===== RANK =====");
	        int rank = 1;
	        int i = 0;
	        while (i < studentAmount) {
	            double percent = (score[i] / totalScore) * 100;
	            
	            if (percent >= 75) { 	
	                System.out.println(getOrdinal(rank) + " Place");

	                int j = i;
	                while (j < studentAmount && score[j] == score[i]) {

		                    System.out.println(names[j] + " - " + percent + "%");
	                	

	                    j++;
	                }
	                
	                System.out.println();
	                rank = rank + 1; 
	                i = j;
	            } else {
	                i++;
	            }
	        }
	        
	        // mga kawawa
	        System.out.println("===== Aral Program List =====");
	        for (int r = 0; r < studentAmount; r++) {
	           	double scoreConvert = (score[r]/totalScore)*100;

            	if (scoreConvert < 75) {
                System.out.println("Name: " + names[r]);
                System.out.printf("Average Achieved: %.2f", scoreConvert);
                System.out.println(" ");
	            }
	        }
	        
			double averageScore = sum / score.length;
			double averagePercentage = (averageScore / totalScore) * 100;
			
            System.out.println(" ");
            
			System.out.printf("Overall Average Percentage: %.2f", averagePercentage);
	        
		}
}
