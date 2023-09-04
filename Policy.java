public class Policy
{
   private int policyNumber;
   private String providerName;
   private String policyHolderFirstName;
   private String policyHolderLastName;
   private int policyHolderAge;
   private String policyHolderSmokingStatus;
   private double policyHolderHeight;
   private double policyHolderWeight;
   
   public Policy() 
   {
      // no-arg constructor
      this.policyNumber = 0;
      this.policyHolderAge = 0;
      this.policyHolderHeight = 0;
      this.policyHolderWeight = 0;
   }
   
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
   
   public void setPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }
   
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   
   
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   
   
   public void setPolicyHolderFirstName(String policyHolderFirstName)
   {
      this.policyHolderFirstName = policyHolderFirstName;
   }
   
   public String getPolicyHolderFirstName()
   {
      return policyHolderFirstName;
   }
   
   
   
   public void setPolicyHolderLastName(String policyHolderLastName)
   {
      this.policyHolderLastName = policyHolderLastName;
   }
   
   public String getPolicyHolderLastName()
   {
      return policyHolderLastName;
   }
   
   
   
   public void setPolicyHolderAge(int policyHolderAge)
   {
      this.policyHolderAge = policyHolderAge;
   }
   
   public int getPolicyHolderAge()
   {
      return policyHolderAge;
   }
   
   
   
   public void setPolicyHolderSmokingStatus(String policyHolderSmokingStatus)
   {
      this.policyHolderSmokingStatus = policyHolderSmokingStatus;
   }
   
   public String getPolicyHolderSmokingStatus()
   {
      return policyHolderSmokingStatus;
   }
   
   
   
   public void setPolicyHolderHeight(double policyHolderHeight)
   {
      this.policyHolderHeight = policyHolderHeight;
   }
   
   public double getPolicyHolderHeight()
   {
      return policyHolderHeight;
   }
   
   
   
   public void setPolicyHolderWeight(double policyHolderWeight)
   {
      this.policyHolderWeight = policyHolderWeight;
   }
   
   public double getPolicyHolderWeight()
   {
      return policyHolderWeight;
   }
   
   
   
   
   public double getBMI()
   {
      return (policyHolderWeight * 703 ) / (policyHolderHeight * policyHolderHeight);
   }
   
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
      
      if(getBMI() > 35)
      {
         price += (getBMI() - 35) * 20;
      }
      
      return price;
   }
}