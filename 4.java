import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Create an array to store the weights
      double[] weights = new double[5];
      double totalWeight = 0;
      double maxWeight = Double.MIN_VALUE;


      for (int i = 0; i < weights.length; i++) {
         System.out.print("Enter weight " + (i + 1) + ": ");
         weights[i] = scanner.nextDouble();

         // Update total weight and max weight in the same loop
         totalWeight += weights[i];
         if (weights[i] > maxWeight) {
            maxWeight = weights[i];
         }
      }

      // Output the entered weights
      System.out.print("You entered: ");
      for (int i = 0; i < weights.length; i++) {
         System.out.print(weights[i] + " ");
      }
      System.out.println(); // Move to the next line

      // Calculate and output the average weight
      double averageWeight = totalWeight / weights.length;

      // Output the results
      System.out.println("Total weight: " + totalWeight);
      System.out.println("Average weight: " + averageWeight);
      System.out.println("Max weight: " + maxWeight);
   }
}