//name of the class
public class Policy
{
   //attributes for the class (fields)
   private int policyNumber;
   private String providerName;

   
   /**
    No-argument constructor for the Policy class
    Initializes all variables to their default values
    */
   public Policy() 
   {
      //initialize the variables
      this.policyNumber = 0;
      this.providerName = "";
   }
   
   /**
    Constructor for the Policy class that accepts the attributes
    
    @param policyNumber The policy number
    @param providerName The name of the insurance provider
    @param policyHolderFirstName The first name of the policy holder
    @param policyHolderLastName The last name of the policy holder
    @param policyHolderAge The age of the policy holder
    @param policyHolderSmokingStatus The smoking status of the policy holder
    @param policyHolderHeight The height of the policy holder in inches
    @param policyHolderWeight The weight of the policy holder in pounds
    */
   public Policy(int policyNumber, String providerName)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
    }   
   
   /**
    Get the policy number
    
    @return The policy number
    */
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
    Get the name of the insurance provider
    
    @return The provider name
    */
   public String getProviderName()
   {
      return providerName;
   }
   
    /**
    Calculate the price of the insurance policy
    
    @return The policy price
    */
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
   
   public String toString()
   {
       return "Policy Number: " + policyNumber +
               "\nProvider Name: " + providerName +
               "\nPolicy Holder: " + policyHolderFirstName + " " + policyHolderLastName +
               "\nAge: " + policyHolderAge +
               "\nSmoking Status: " + policyHolderSmokingStatus +
               "\nHeight: " + policyHolderHeight + " inches" +
               "\nWeight: " + policyHolderWeight + " pounds" +
               "\nBMI: " + getBMI() +
               "\nPolicy Price: " + calculatePolicyPrice();
   }
}