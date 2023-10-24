//name of the class
public class Policy
{
   //attributes for the class (fields)
   private int policyNumber;
   private String providerName;
   
   //static variable to keep count of the number of policies created
   private static int numPoliciesCreated = 0;
   
   //calling in the PolicyHolder class
   private PolicyHolder policyHolder;
   
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
    @param policyHolder The copy of the PolicyHolder class constructor
    */
   public Policy(int policyNumber, String providerName, PolicyHolder policyHolder)
   {
      //increment the number of policies created as each new object is created
      numPoliciesCreated++;
      
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      
      //use the copy constructor
      this.policyHolder = new PolicyHolder(policyHolder);
   }   
   
   /**
    Get the policy number
    
    @return policyNumber The policy number
    */
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
    Get the name of the insurance provider
    
    @return providerName The provider name
    */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
   Get the number of policies created
   
   @return numPoliciesCreated The number of policies created
   */
   public static int getNumPoliciesCreated()
   {
      return numPoliciesCreated;
   }
   
   /**
   Get the copy constructor
   
   @return new PolicyHolder(policyHolder) The copy constructor
   */
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder);
   }
   
    /**
    Calculate the price of the insurance policy
    
    @return price The policy price
    */
   public double calculatePolicyPrice()
   {
      double price = 600;
      
      if(policyHolder.getPolicyHolderAge() > 50)
      {
         price += 75;
      }
      
      if(policyHolder.getPolicyHolderSmokingStatus().equalsIgnoreCase("smoker"))
      {
         price += 100;
      }
      else
      {
         price += 0;
      }
      
      if(policyHolder.getBMI() > 35)
      {
         price += (policyHolder.getBMI() - 35) * 20;
      }
      
      return price;
   }
   
   //toString for the Policy class
   public String toString()
   {
       return "Policy Number: " + policyNumber +
               "\nProvider Name: " + providerName + "\n" +
               policyHolder.toString() +
               "\nPolicy Price: $" + calculatePolicyPrice();
   }
}