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
   
   /**
    No-argument constructor for the Policy class
    Initializes all variables to their default values
    */
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
    Get the first name of the policy holder
    
    @return The first name of the policy holder
    */
   public String getPolicyHolderFirstName()
   {
      return policyHolderFirstName;
   }
   
   /**
    Get the last name of the policy holder
    
    @return The last name of the policy holder
    */
   public String getPolicyHolderLastName()
   {
      return policyHolderLastName;
   }
   
   /**
    Get the age of the policy holder
    
    @return The age of the policy holder
    */
   public int getPolicyHolderAge()
   {
      return policyHolderAge;
   }
   
   /**
    Get the smoking status of the policy holder
    
    @return The smoking status ("smoker" or "non-smoker")
    */
   public String getPolicyHolderSmokingStatus()
   {
      return policyHolderSmokingStatus;
   }
   
   /**
    Get the height of the policy holder in inches
    
    @return The height in inches
    */
   public double getPolicyHolderHeight()
   {
      return policyHolderHeight;
   }
   
   /**
    Get the weight of the policy holder in pounds
    
    @return The weight in pounds
    */
   public double getPolicyHolderWeight()
   {
      return policyHolderWeight;
   }
   
   /**
    Calculate the BMI of the policy holder
    
    @return The BMI value.
    */
   public double getBMI()
   {
      return (policyHolderWeight * 703 ) / (policyHolderHeight * policyHolderHeight);
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
}