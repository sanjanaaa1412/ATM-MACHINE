import java.util.Scanner;
class Atm {
    float Balance;
    int PIN = 893;
    public void checkPIN()
    {
        System.out.println("Enter your pin:-  ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt(); 
        if(enteredPin == PIN){
            menu();
        }
        else{
            System.out.println("Enter  a valid pin ");
        }
    }
    public void menu(){
        System.out.println("Enetr your choice:- ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt == 1)
        {
            checkBalance();
        }
        else if(opt==2)
        {
            withdrawMoney();
        }
        else if(opt==3)
        {
            depositMoney();
        }
        else if (opt==4)
        {
            return;
        }
        else {
            System.out.println("Enter a valid choice ");
        }
    }

    public void checkBalance(){
        System.out.println("Balance :- "+Balance+ " Rs.");
        menu();
    } 
    public void withdrawMoney()
    {
       System.out.println("Enter the amount to withdraw:- ");
       Scanner sc = new Scanner(System.in);
       float wdamt = sc.nextInt();
       if(wdamt>Balance){
        System.out.println("Insufficient Funds");
       }
       else{
        Balance = Balance - wdamt;
        System.out.println("Money withdrawn sucessfully");
       }
       menu();
    }
    public void depositMoney(){
        System.out.println("Enter the amount to deposit:- ");
        Scanner sc = new Scanner(System.in);
        float dpamt = sc.nextInt();
        Balance = Balance + dpamt;
        System.out.println("Money Deposited Successfully");
        menu();
    }
  
    public static void main (String args []) 
        {

            Atm obj = new Atm();
            obj.checkPIN();
    
        }
}
