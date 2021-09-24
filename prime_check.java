import java.util.Scanner;

public class prime_check {
    public static void main(String args[]){

        int i,flag=0;

        //creating an scanner function
        Scanner sc = new Scanner(System.in);
        //read input
        System.out.print("Enter the value wants to check: ");
         int value = sc.nextInt();

         // checking the value is prime or not 

         for(i=2;i<value;i++){
             if(value%i==0){
                 flag++;
             }
         }
         if(flag==0){
            System.out.print("The value is prime");
         }
         else if(flag>0 ){
            System.out.print("The value is not prime , It has " + flag +" number of mutliplers");
         }

    } 
    
}
