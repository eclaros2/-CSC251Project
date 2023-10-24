public class PolicyHolder
{
   //attributes for the class (fields)
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
   public PolicyHolder() 
   {
      //initialize the variables
      this.policyHolderFirstName = "";
      this.policyHolderLastName = "";
      this.policyHolderAge = 0;
      this.policyHolderSmokingStatus = "";
      this.policyHolderHeight = 0;
      this.policyHolderWeight = 0; 
   }
   
   /**
    Constructor for the Policy class that accepts the attributes
    
    @param policyHolderFirstName The first name of the policy holder
    @param policyHolderLastName The last name of the policy holder
    @param policyHolderAge The age of the policy holder
    @param policyHolderSmokingStatus The smoking status of the policy holder
    @param policyHolderHeight The height of the policy holder in inches
    @param policyHolderWeight The weight of the policy holder in pounds
    */
   public PolicyHolder(String policyHolderFirstName, String policyHolderLastName, int policyHolderAge, String policyHolderSmokingStatus, double policyHolderHeight, double policyHolderWeight)
   {
      this.policyHolderFirstName = policyHolderFirstName;
      this.policyHolderLastName = policyHolderLastName;
      this.policyHolderAge = policyHolderAge;
      this.policyHolderSmokingStatus = policyHolderSmokingStatus;
      this.policyHolderHeight = policyHolderHeight;
      this.policyHolderWeight = policyHolderWeight;
   }
   
   /**
    Copy constructor to minimize security risks
        
    @param copy.policyHolderFirstName A copy of the first name of the policy holder
    @param copy.policyHolderLastName A copy of the last name of the policy holder
    @param copy.policyHolderAge A copy of the age of the policy holder
    @param copy.policyHolderSmokingStatus A copy of the smoking status of the policy holder
    @param copy.policyHolderHeight A copy of the height of the policy holder in inches
    @param copy.policyHolderWeight A copy of the weight of the policy holder in pounds
    */
   public PolicyHolder(PolicyHolder copy)
   {
      this.policyHolderFirstName = copy.policyHolderFirstName;
      this.policyHolderLastName = copy.policyHolderLastName;
      this.policyHolderAge = copy.policyHolderAge;
      this.policyHolderSmokingStatus = copy.policyHolderSmokingStatus;
      this.policyHolderHeight = copy.policyHolderHeight;
      this.policyHolderWeight = copy.policyHolderWeight;
   }
   
   /**
    Get the first name of the policy holder
    
    @return policyHolderFirstName The first name of the policy holder
    */
   public String getPolicyHolderFirstName()
   {
      return policyHolderFirstName;
   }
   
   /**
    Get the last name of the policy holder
    
    @return policyHolderLastName The last name of the policy holder
    */
   public String getPolicyHolderLastName()
   {
      return policyHolderLastName;
   }
   
   /**
    Get the age of the policy holder
    
    @return policyHolderAge The age of the policy holder
    */
   public int getPolicyHolderAge()
   {
      return policyHolderAge;
   }
   
   /**
    Get the smoking status of the policy holder
    
    @return policyHolderSmokingStatus The smoking status ("smoker" or "non-smoker")
    */
   public String getPolicyHolderSmokingStatus()
   {
      return policyHolderSmokingStatus;
   }
   
   /**
    Get the height of the policy holder in inches
    
    @return policyHolderHeight The height in inches
    */
   public double getPolicyHolderHeight()
   {
      return policyHolderHeight;
   }
   
   /**
    Get the weight of the policy holder in pounds
    
    @return policyHolderWeight The weight in pounds
    */
   public double getPolicyHolderWeight()
   {
      return policyHolderWeight;
   }
   
   /**
    Calculate the BMI of the policy holder
    
    @return (policyHolderWeight * 703 ) / (policyHolderHeight * policyHolderHeight) The BMI value.
    */
   public double getBMI()
   {
      return (policyHolderWeight * 703 ) / (policyHolderHeight * policyHolderHeight);
   }
   
   //toString method for the PolicyHolder class
   public String toString()
   {
        return "Policyholder's First Name: " + policyHolderFirstName + "\n" + 
               "Policyholder's Last Name: " + policyHolderLastName +
               "\nPolicyholder's Age: " + policyHolderAge +
               "\nPolicyholder's Smoking Status: " + policyHolderSmokingStatus +
               "\nPolicyholder's Height: " + policyHolderHeight + " inches" +
               "\nPolicyholder's Weight: " + policyHolderWeight + " pounds" +
               "\nPolicyholder's BMI: " + getBMI();
   }
}