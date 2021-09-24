import java.util.Scanner; //import scanner library

class banking{
                            //intialize
    String Name;
    String Type;
    int Account_Number; 
    float balance;
    float amount;
    float withhdraw;
                            // to print the data
    void current_status(){
        System.out.println("The Acoount holder name : " + Name);
        System.out.println("Type: " + Type);
        System.out.println("Acoount Number: " + Account_Number);
        System.out.println("Balance: "+ balance);

    }
                            //deposite function
    void deposite() {
        balance = balance + amount ;
        System.out.println("The Deposite was sucessfull...\n5000 min balance + " + amount +" = " +balance );

        System.out.println("The Cureent Status was:");

        current_status();
        
    }
                        //withdraw function
    void withdraw(){
        float temp=balance;
        balance = balance - withhdraw;
        System.out.println("The amount was sucessfully withdrawed from your account ");
        System.out.println(temp + " - " + withhdraw + " = " + balance );
        current_status();



    }
}

// main class 
public class Bank_transactions {
    public static void main(String args[]){
        float balance =5000;


        Scanner sc = new Scanner(System.in); //Scanner fucntion created
        
        System.out.println("Enter the name of account holder : "); // read user data first
        String name = sc.nextLine();
        System.out.println("ENter the account type: ");
        String type = sc.nextLine();
        System.out.println("Enter accunt nuumber: ");
        int account_number = sc.nextInt();

                                    //Passing the informations
        banking b1 = new banking();

        b1.Name = name;
        b1.Type =type;
        b1.Account_Number = account_number;
        b1.balance =balance;

                                    //using do while for program repeatation 
        do {
        System.out.println("\n\n\nhello User we can do few banking her... Have an try..");
        System.out.println("Enter the option \n 1. Current Status \n 2. Deposite \n 3. withdraw \n 4. exit()");
        System.out.println("Enter the option: ");

        int option = sc.nextInt();

                                    // using swith to perform various action
        switch(option){
            case 1:
                b1.current_status();
                break;
            case 2:
                System.out.println("Enter the amount wants to deposite: ");
                float amount = sc.nextFloat();
                b1.amount =amount;
                b1.deposite();
                break;

            case 3:
                System.out.println("Enter the amount wants to withdraw: ");
                float withdraw = sc.nextFloat();
                b1.withhdraw =withdraw;
                b1.withdraw();
                break;
            case 4:
                return ;
            default:
            System.out.println("Please enter the correct input the input was  wrong ,,,\n please try again ...");
                
        }
    }
    while(true);                    // closing do while 

    }
    
}
