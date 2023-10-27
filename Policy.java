//name of the class
public class Policy
{
   //attributes for the class (fields)
   private int policyNumber;
   private String providerName;
   
   private static final double BASE_POLICY_PRICE = 600.0;
   private static final double AGE_THRESHOLD = 50;
   private static final double SMOKER_PRICE = 100.0;
   private static final double BMI_PRICE_PER_UNIT = 20.0;
   private static final double BMI_THRESHOLD = 35.0;
   
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
      this.policyHolder = new PolicyHolder();
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
      double price = BASE_POLICY_PRICE;
      
      if(policyHolder.getPolicyHolderAge() > AGE_THRESHOLD)
      {
         price += 75;
      }
      
      if(policyHolder.getPolicyHolderSmokingStatus().equalsIgnoreCase("smoker"))
      {
         price += SMOKER_PRICE;
      }
      else
      {
         price += 0;
      }
      
      if(policyHolder.getBMI() > BMI_THRESHOLD)
      {
         price += (policyHolder.getBMI() - BMI_THRESHOLD) * BMI_PRICE_PER_UNIT;
      }
      
      return price;
   }
   
   //toString for the Policy class
   public String toString()
   {
       return "Policy Number: " + policyNumber +
               "\nProvider Name: " + providerName + "\n" +
               policyHolder +
               "\nPolicy Price: $" + String.format("%.2f", calculatePolicyPrice());
   }
}