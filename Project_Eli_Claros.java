//import all the utilities necessary for the demo class
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Project_Eli_Claros
{
   public static void main(String[] args)
   {
      
      try
      {
         //set file to read from the PolicyInformation.txt file
         File file = new File("PolicyInformation.txt");
         
         Scanner inputFile = new Scanner(file);   
         
         //initialize the variables
         int policyNumber, policyHolderAge, totalSmokers = 0, totalNonSmokers = 0;
         
         String providerName, policyHolderFirstName, policyHolderLastName, policyHolderSmokingStatus;
         
         double policyHolderHeight, policyHolderWeight;
         
         //create an array list for the Policy class
         ArrayList<Policy> policies = new ArrayList<>();
         
         //read each line in the PolicyInformation.txt file
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
            
            //create a PolicyHolder class and a Policy class with the information of the PolicyInformation class
            PolicyHolder holder = new PolicyHolder(policyHolderFirstName, policyHolderLastName, policyHolderAge, policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight);
            Policy policy = new Policy(policyNumber, providerName, holder);
            
            //add the policy class to the ArrayList
            policies.add(policy); 
            
            //increment the total of smoker and/or non-smoker if there are any
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
         
         //display the information in the Policy class
         for(int i = 0; i < policies.size(); i++)
         { 
            System.out.print(policies.get(i) + "\n");
            System.out.println();
         }
            //display the number of policies created and how many policyholders are either smokers or non-smokers
            System.out.println("There were " + Policy.getNumPoliciesCreated() + " Policy objects created.");
            System.out.println( "The number of policies with a smoker is: " + totalSmokers);
            System.out.println( "The number of policies with a non-smoker is: " + totalNonSmokers);
         
      }   
      
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
   }
}