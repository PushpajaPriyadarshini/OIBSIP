import java.util.*;
class BankAccount{
	String name;
	String username;
	String password;
	long Accountno;
	int balance=10000;
	int transactions=0;
	
	String transactionhistory=" ";
	public void registeration() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name: ");
		this.name=sc.nextLine();
		System.out.println(" Enter Your User Name: ");
		this.username= sc.nextLine();
		System.out.println(" Enter Your Password: ");
		this.password=sc.nextLine();
		System.out.println("Enter Your Acc No: ");
		this.Accountno=sc.nextLong();
		System.out.println("Registration Completed.. Please Login to Proceed");
	
	}
	public void checkbalance() {
		System.out.println( " Total balance in your Acc is : Rs"+ balance);
	}
	public void deposit() {
		System.out.println("Enter the amount to be deposit: ");
		Scanner sc= new Scanner ( System.in);
		int amount=sc.nextInt();
		if(amount<=10000) {
			transactions++;
			balance+=amount;
			System.out.println("Sucessfully deposited!");
			String str= "Rs"+amount+"deposited";
			transactionhistory=transactionhistory.concat(str);
		}
		else {
			System.out.println("Limit is 10000");
		}
	}
	public void withdraw() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount to be withdraw");
		int amount= sc.nextInt();
		if(balance>amount) {
			transactions++;
			balance-=amount;
			System.out.println("Successfully withdrawn!" );
			String str= "Rs"+amount+"withdrawn";
			transactionhistory=transactionhistory.concat(str);
		}
		else {
			System.out.println("Insufficient balance!");
			
		}
		
	}
	
	public void transfer() {
		System.out.println("Enter reciever's name: ");
		Scanner sc= new Scanner(System.in);
		String receiver = sc.nextLine();
		System.out.println("Enter amount to transfer: ");
        int trans=sc.nextInt();
        if(balance>=trans){
            if(trans<=100000){
                transactions++;
                balance-=trans;
                System.out.println("Successfully transferred Rs."+trans+" to "+receiver);
                String str= "Rs."+trans+" transferred to "+receiver+" Acc.";
                transactionhistory=transactionhistory.concat(str);
            }
            else{
                System.out.println("Sorry... limit is Rs.100000.");
            }
        }
        else {
            System.out.println("Transfer failed due to insufficient balance.");
        }
    }
    public void transhistory(){
        if(transactions==0){
            System.out.println("Empty!");
        }
        else{
            System.out.println("\n"+transactionhistory);
            }
        }
    

    public boolean login() {
    	boolean isLogin=false;
    	while(!isLogin) {
    		System.out.println("Enter Username: ");
    		Scanner sc= new Scanner(System.in);
    		String user = sc.nextLine();
    		if(user.equals(username)) {
    			while(!isLogin) {
    				System.out.println("Enter password :");
    				String pass = sc.nextLine();
    				if(pass.equals(password)) {
    					System.out.println("Login Successful");
    					isLogin = true;
    				}
    				else {
    					System.out.println("Incorrect password");
    				}
    			
    			
    			}
    		}
    		else {
    			System.out.println("User is not found");
    		}
    		
    	}
    	return isLogin ;
    }}
public class ATMInterface{
	
public static void main (String []args) {
	 Scanner sc= new Scanner(System.in);
     System.out.println("   *** ATM INTERFACE ***   ");
     System.out.println("1. Register\n2. Exit");
     System.out.println("Enter your choice: ");
     int choice = sc.nextInt();
     if(choice==1){
         BankAccount acc= new BankAccount();
         acc.registeration();
         while(true){
             System.out.println("1. login\n2. Exit");
             System.out.println("Enter your choice: ");
             int ch= sc.nextInt();
             if(ch==1){
                 if(acc.login()){
                     System.out.println("Welcome   "+acc.name+"   !!!");
                     boolean finish=false;
                     while(!finish){
                         System.out.println("   *** MENU ***   ");
                         System.out.println("1. Show Transaction History");
                         System.out.println("2. Deposit");
                         System.out.println("3. Withdraw.");
                         System.out.println("4. Transfer.");
                         System.out.println("5. Check balance.");
                         System.out.println("6. Redirect to login page!.");
                         System.out.println("\nEnter your choice: ");
                         int input = sc.nextInt();
                         switch (input){
                             case 1:  acc.transhistory();
                             break;
                         case 2:
                             acc.deposit();
                             break;
                         case 3:
                             acc.withdraw();
                             break;
                         case 4:
                             acc.transfer();
                             break;
                         case 5:
                             acc.checkbalance();
                             break;
                         case 6:
                             finish=true;
                             break;
                         default:
                             System.out.println("Invalid input... try again!");
                     }
                 }
             }
         }
         else{
            
             System.out.println("Thank You !! Have a nice day");
         }
     }
 }
 
 }
}




	

	

	
	







