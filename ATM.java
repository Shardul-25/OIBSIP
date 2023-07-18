
    import java.util.Scanner;

    public class ATM {
    
        public static void main(String args[] ) {
            
            int userId = 5678, atmPin = 2511;
    
            
            int balance = 500000, withdraw, deposit, transfer;
    
            
            try (Scanner s = new Scanner(System.in))
            {
                System.out.print("Enter User ID: ");
                int inputUserId = s.nextInt();
                System.out.print("Enter ATM PIN: ");
                int inputAtmPin = s.nextInt();
                if(inputUserId != userId || inputAtmPin != atmPin) {
                    System.out.println("Invalid User ID or ATM PIN. Exit");
                    System.exit(0);
                }
   
                
                while(true) {
                    System.out.println("WELCOME TO SBI ATM");
                    System.out.println("Choose 1 for CASH WITHDRAWL");
                    System.out.println("Choose 2 for CASH DEPOSIT");
                    System.out.println("Choose 3 for CHECK BALANCE");
                    System.out.println("Choose 4 for CASH TRANSFER");
                    System.out.println("Choose 5 for TRANSACTION HISTORY");
                    System.out.println("Choose 6 for CANCEL");
                    System.out.print("Choose the operation you want to perform:");
   
                    
                    int choice = s.nextInt();
                    switch(choice) {
                        case 1:
                            System.out.println("Enter money to be withdrawn:");
                            System.out.println("Amount should be in multiple of 100");
                            withdraw = s.nextInt();
   
                            
                            if(balance >= withdraw) {
                                balance = balance - withdraw;
                                System.out.println("Please collect your money");
                                System.out.println("Your balance remaining is "+balance);
                            } else {
                                System.out.println("Transaction failed");
                            }
                            System.out.println("");
                            break;
   
                        case 2:
                            System.out.print("Enter money to be deposited:");
                            deposit = s.nextInt();
                            balance = balance + deposit;
                            System.out.println("Your Money has been successfully deposited");
                
                            break;
   
                        case 3:
                            System.out.println("Balance : "+balance);
                            System.out.println(" ");
                            break;
   
                        case 4:
                            System.out.print("Enter recipint id: ");
                            int recipientUserId = s.nextInt();
                            System.out.print("Enter amount to be transferred:");
                            transfer = s.nextInt();
   
                            
                            if(balance >= transfer) {
                               
                                balance = balance - transfer;
                                System.out.println("Transfer successful. Rs."+transfer+" has been transferred to user with user ID "+recipientUserId+".");
                            } else {
                                System.out.println("Insufficient Balance");
                            }
                            System.out.println(" ");
                            break;
   
                        case 5:
                            System.out.println("Transaction History:");
                            
                            System.out.println(" ");
                            break;
   
                        case 6:
                            System.out.println("Thank you. Visit again!");
                            break;
   
                        default:
                            System.out.println("Invalid Choice");
                            System.out.println("");
                    }
                }
            }
        }
    
    }
