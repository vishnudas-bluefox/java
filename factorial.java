import java.util.Scanner;  //import scanner

class factorial {

    public static void main(String args[]){
        int i;
        int sum=1;

        Scanner sc = new Scanner(System.in);  // create scanner sc
        
        System.out.print("HEy, please enter tyhe limit: ");
        int value = sc.nextInt();   //Scan the limit

        for (i=1;i<=value;i++){
            sum *= i;                 // finding the factorial

        }
        System.out.print("The answer is : "+ sum);
        
    }
}