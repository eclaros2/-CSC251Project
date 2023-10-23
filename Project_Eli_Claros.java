import java.util.ArrayList;
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
         
         
         int policyNumber, policyHolderAge, totalSmokers = 0, totalNonSmokers = 0;
         
         String providerName, policyHolderFirstName, policyHolderLastName, policyHolderSmokingStatus;
         
         double policyHolderHeight, policyHolderWeight;
         
         
         ArrayList<Policy> policies = new ArrayList<>();
         
         
         while(inputFile.hasNext())       
         {
         
            policyNumber = inputFile.nextInt();
            inputFile.nextLine();
            providerName = inputFile.nextLine();
            policyHolderFirstName = inputFile.nextLine();
            policyHolderLastName = inputFile.nextLine();
            policyHolderAge = inputFile.nextInt();
            inputFile.nextLine();
            policyHolderSmokingStatus = inputFile.nextLine();
            policyHolderHeight = inputFile.nextDouble();
            policyHolderWeight = inputFile.nextDouble();
            
         
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();
               inputFile.nextLine();
            }
         
            Policy policy = new Policy(policyNumber, providerName, policyHolderFirstName, policyHolderLastName, policyHolderAge, policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight);
         
            policies.add(policy); 
            
            if (policyHolderSmokingStatus.equalsIgnoreCase("smoker"))
            {
               totalSmokers++;
            }
            else if (policyHolderSmokingStatus.equalsIgnoreCase("non-Smoker"))
            {
               totalNonSmokers++;
            }
         
         }
      
         inputFile.close();
         
         for(int i = 0; i < policies.size(); i++)
         { 
            System.out.println( "Policy Number: " + policies.get(i).getPolicyNumber());
            System.out.println( "Provider Name: " + policies.get(i).getProviderName());
            System.out.println( "Policyholder's First Name: " + policies.get(i).getPolicyHolderFirstName());
            System.out.println( "Policyholder's Last Name: " + policies.get(i).getPolicyHolderLastName());
            System.out.println( "Policyholder's Age: " + policies.get(i).getPolicyHolderAge());
            System.out.println( "Policyholder's Smoking Status: " + policies.get(i).getPolicyHolderSmokingStatus());
            System.out.printf( "Policyholder's Height: %.2f ", policies.get(i).getPolicyHolderHeight());
            System.out.printf( "\nPolicyHolder's Weight: %,.2f ", policies.get(i).getPolicyHolderWeight());
            System.out.printf( "\nPolicyholder's BMI: %.2f", policies.get(i).getBMI());            
            System.out.printf( "\nPolicy Price: $%,.2f \n", policies.get(i).calculatePolicyPrice());
            System.out.println();
         }
         
            System.out.println( "The number of policies with a smoker is: " + totalSmokers);
            System.out.println( "The number of policies with a non-smoker is: " + totalNonSmokers);
         
      }   
      
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
   }
}