//import the Scanner
import java.util.Scanner;

public class Project_Eli_Claros
{
   public static void main(String[] args)
   {
      //make a Scanner object for input
      Scanner keyboard = new Scanner(System.in);   
      
      //all the variables
      int policyNumber;
      String providerName;
      String policyHolderFirstName;
      String policyHolderLastName;
      int policyHolderAge;
      String policyHolderSmokingStatus;
      double policyHolderHeight;
      double policyHolderWeight;
      
      //all the imputs
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.print("\nPlease enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's First Name: ");
      policyHolderFirstName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Last Name: ");
      policyHolderLastName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Age: ");
      policyHolderAge = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      policyHolderSmokingStatus = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Height (in inches): ");
      policyHolderHeight = keyboard.nextDouble();
      
      System.out.print("\nPlease enter the Policyholder's Weight (in pounds): ");
      policyHolderWeight = keyboard.nextDouble();
      
      //creating the policy object with arguments
      Policy policy = new Policy(policyNumber, providerName, policyHolderFirstName, policyHolderLastName, policyHolderAge, policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight);
      
      //all the outputs and calling the getter methods
      System.out.println("\n\nPolicy Number: " + policy.getPolicyNumber());
      System.out.println("\nProvider Name: " + policy.getProviderName());
      System.out.println("\nPolicyholder's First Name: " + policy.getPolicyHolderFirstName());
      System.out.println("\nPolicyholder's Last Name: " + policy.getPolicyHolderLastName());
      System.out.println("\nPolicyholder's Age: " + policy.getPolicyHolderAge());
      System.out.println("\nPolicyholder's Smoking Status: " + policy.getPolicyHolderSmokingStatus());
      System.out.printf("\nPolicyholder's Height: %.2f", policy.getPolicyHolderHeight());
      System.out.printf("\n\nPolicyHolder's Weight: %,.2f", policy.getPolicyHolderWeight());
      System.out.printf("\n\nPolicyholder's BMI: %.2f", policy.getBMI());
      System.out.printf("\n\nPolicy Price: $%,.2f", policy.calculatePolicyPrice());
   }
}