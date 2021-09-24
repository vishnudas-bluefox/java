import java.util.Scanner; // import scanner library

public class Print_n_prime_numbers {
    public static void main(String args[]){


        //create an scanner function
        Scanner sc = new Scanner(System.in);

        //reading the limit from the user
        System.out.println("Please enter the limit :");
        int limit = sc.nextInt();


        // check prime and print

        int i,j;

        for(i=2;i<=limit;i++){
            int flag=0;
            for(j=1;j<=i;j++){
                if(i%j ==0){
                    
                    flag++;
                }
                

            }
            if(flag == 2){
                System.out.println(i);
            }
        }

    } 
}
