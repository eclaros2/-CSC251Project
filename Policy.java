//name of the class
public class Policy
{
   //attributes for the class (fields)
   private int policyNumber;
   private String providerName;
   private String policyHolderFirstName;
   private String policyHolderLastName;
   private int policyHolderAge;
   private String policyHolderSmokingStatus;
   private double policyHolderHeight;
   private double policyHolderWeight;
   
   //no-arg constructor
   public Policy() 
   {
      //initialize the variables
      this.policyNumber = 0;
      this.policyHolderFirstName = "";
      this.policyHolderLastName = "";
      this.policyHolderAge = 0;
      this.policyHolderSmokingStatus = "";
      this.policyHolderHeight = 0;
      this.policyHolderWeight = 0;
   }
   
   //a constructor that accepts arguments
   public Policy(int policyNumber, String providerName, String policyHolderFirstName, String policyHolderLastName, int policyHolderAge, String policyHolderSmokingStatus, double policyHolderHeight, double policyHolderWeight)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyHolderFirstName = policyHolderFirstName;
      this.policyHolderLastName = policyHolderLastName;
      this.policyHolderAge = policyHolderAge;
      this.policyHolderSmokingStatus = policyHolderSmokingStatus;
      this.policyHolderHeight = policyHolderHeight;
      this.policyHolderWeight = policyHolderWeight;
   }   
   
   //getter methods
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public String getPolicyHolderFirstName()
   {
      return policyHolderFirstName;
   }
   
   public String getPolicyHolderLastName()
   {
      return policyHolderLastName;
   }
   
   public int getPolicyHolderAge()
   {
      return policyHolderAge;
   }
   
   public String getPolicyHolderSmokingStatus()
   {
      return policyHolderSmokingStatus;
   }
   
   public double getPolicyHolderHeight()
   {
      return policyHolderHeight;
   }
   
   public double getPolicyHolderWeight()
   {
      return policyHolderWeight;
   }
   
   //method for calculating BMI
   public double getBMI()
   {
      return (policyHolderWeight * 703 ) / (policyHolderHeight * policyHolderHeight);
   }
   
   //method for calculating the policy price
   public double calculatePolicyPrice()
   {
      double price = 600;
      
      if(policyHolderAge > 50)
      {
         price += 75;
      }
      
      if(policyHolderSmokingStatus.equalsIgnoreCase("smoker"))
      {
         price += 100;
      }
      else
      {
         price += 0;
      }
      
      if(getBMI() > 35)
      {
         price += (getBMI() - 35) * 20;
      }
      
      return price;
   }
}