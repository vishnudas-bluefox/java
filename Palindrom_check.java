import java.util.Scanner;  //import scanner 

public class Palindrom_check {
    public static void main(String args[]){
        int temp,end, check=0;

        Scanner value = new Scanner(System.in); // create scanner object
        System.out.print("Enter the value wants to check: ");
        int value1=value.nextInt();
        temp= value1;
        while(temp>0){
            
            end = temp %10;
            check = (check * 10) + end;
            temp =temp/10;


        }
        if(check == value1){
            System.out.println("The value is palindrome ");

        }
        else{
            System.out.println("The value is not palindrome ");

        }

    }
}
