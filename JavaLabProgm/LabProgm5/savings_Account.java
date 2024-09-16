package LabProgm5;

    public class savings_Account extends account_detail{
        
        savings_Account(int i, String n, String a, String p, double d){
            super(i,n,a,p,d);
            
        }
        
        public void deposit(double amount) {
            System.out.println("OLD BALANCE :"+bl);
            bl += amount;
            System.out.println("Account Holder Balance :"+bl);
        }
        
        public void withdraw(double amount) {
            if (bl >= amount) {
                bl -= amount;
            } 
            else {
                System.out.println("Insufficient balance");
            }
            System.out.println("Account Holder Balance :"+bl);
        }
    
        public void calculateintrest(double intr)
        {		
            double it=(bl*intr)/100;
            System.out.println("Intrest for Year :"+it);
        }
    }

