package GradeManager;
import java.util.Scanner;

public class Source {
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
	 	
	 	// store num of students and declare score of exam
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("===== Grade Management System =====");
	        
	        System.out.print("Enter the Number of Students: ");
	        int studentAmount = input.nextInt();
	        input.nextLine();
	        System.out.print("Enter the Total Score of Exam: ");
	        double totalScore = input.nextDouble();
	        input.nextLine();

	        String[] names = new String[studentAmount];
	        double[] score = new double[studentAmount];
	        
	        for (int i = 0; i < studentAmount; i++) {
	            System.out.print("Enter name of student #" + (i + 1) + ": ");
	            names[i] = input.nextLine();
	            System.out.print("Enter Score of Student #" + (i + 1) + ": ");
	            score[i] = input.nextDouble();
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
 				
 				if (scorePercentage >= 99) {
 					System.out.println("Status: PASSED with Highest Honor");
 				} else if (scorePercentage >= 95) {
 					System.out.println("Status: PASSED with High Honor");
 				} else if (scorePercentage >= 90) {
 					System.out.println("Status: PASSED with Honor");
 				} else if (scorePercentage >= 75) {
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
	        System.out.println(" ");
	        for (int r = 0; r < studentAmount; r++) {
	           	double scoreConvert = (score[r]/totalScore)*100;

            	if (scoreConvert <= 75) {
                System.out.println("Name: " + names[r]);
                System.out.println("Score Achieved: " + score[r] + "/" + totalScore);
                System.out.println("Average Achieved: " + scoreConvert + "%");
                System.out.println(" ");
	            }
	        }
		}
}
