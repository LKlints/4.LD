// 231RDB277 Līva Klints 3

import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        System.out.println(System.getProperty("user.home"));
		System.out.println("231RDB277 Līva Klints 3");

		
		String fileName;
		System.out.println("input file name:");
		fileName = sc.nextLine();
		sc.close();

        if (!fileName.endsWith(".txt")) {
            fileName += ".txt";
        }
		
		// nolasīt failu
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("result:");

            while ((line = br.readLine()) != null) {
                String[] studentData = line.split(" ");
                String name = studentData[0];
                String surname = studentData[1];
                double averageGrade = calculateAveregeGrade(studentData);

                if (averageGrade <= 5) {
                    int debtCount = countDebts(studentData);
                    System.out.println(name + " " + surname + " " + debtCount);
                }
            }
        }
    }
		
        private static double calculateAveregeGrade(String[] studentData) {
            double sum = 0;
            for (int i = 2; i<studentData.length; i++) {
                sum += Double.parseDouble(studentData[i]);
            }
            return sum / (studentData.length - 2);
        }

        private static int countDebts(String[] studentData) {
            int debtCount = 0;
            for (int i = 2; i<studentData.length; i++) {
                if (Double.parseDouble(studentData[i]) < 4) {
                    debtCount++;
                }
            }
            return debtCount++;
        }
		// ievadīto no tastatūras faila nosaukumu fileName nemodificēt, 
		// nepievienot mapes vārdu, nepievienot tipu txt
		
		// izvadīt rezultātus	

	}

