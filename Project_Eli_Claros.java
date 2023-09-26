//import the Scanner
import java.util.Scanner;
import java.io.*;

public class Project_Eli_Claros
{
   public static void main(String[] args)
   {
      
      try
      {
         File file = new File("PolicyInformation.txt");
         
         Scanner inputFile = new Scanner(file);   
         
         
         int policyNumber, policyHolderAge;
         
         String providerName, policyHolderFirstName, policyHolderLastName, policyHolderSmokingStatus;
         
         double policyHolderHeight, policyHolderWeight;
         
         
         ArrayList<Policy> policies = new ArrayList<>();
         
         
         while(inputFile.hasNext())       
         {
         
            policyNumber = inputFile.nextInt();  
            providerName = inputFile.nextLine();
            policyHolderFirstName = inputFile.nextLine();
            policyHolderLastName = inputFile.nextLine();
            policyHolderAge = inputFile.nextInt();
            policyHolderSmokingStatus = inputFile.nextLine();
            policyHolderHeight = inputFile.nextDouble();
            policyHolderWeight = inpuFile.nextDouble();
            
         
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();
               inputFile.nextLine();
            }
         
            Policy policy = new Policy(policyNumber, providerName, policyHolderFirstName, policyHolderLastName, policyHolderAge, policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight);
         
            policies.add(policy); 
         
         }
      
         inputFile.close();
         //creating the policy object with arguments
                  
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
      
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
   }
}