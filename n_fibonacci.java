import java.util.Scanner;   // import java scanner library

class fibonacci{

    // using recursion
     int fib (int n){
        if(n <= 1){
            return n;
        }
        return fib(n-1) +fib(n-2);

     }

     // without recursion

     int fibo(int n){
        int i=0;
        int k=0;
        int n1=-1;
        int n2=1;
        while(i<n){
            k = n1+ n2;
            n1=n2;
            n2=k;
            i++;

         }
        return k;

     }
}

public class n_fibonacci {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); //create scanner function


        System.out.println("Enter the position of fibonnoci number: ");
        int n = sc.nextInt();

        // pass n to functions 

        fibonacci f = new fibonacci();

        int value_1=f.fib(n-1);   //using recursion
        int value_2 =f.fibo(n); //without recursion

        System.out.println("Using recursion\nThe nth fibbo is : " + value_1);
        System.out.println("Using without recursion\nThe nth fibbo is : " + value_2);



        
    }
}
