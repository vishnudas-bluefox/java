import java.util.Scanner;

class patter {
    public static void main(String args[]){

        // create input function

        Scanner sc =new Scanner(System.in);

        //USer in put
        System.out.println("Enter the number of lines: ");
        int lines = sc.nextInt();


        // creating the pattern

        int i,j;
        for(i=1;i<lines;i++){
            for (j=1;j<=i;j++){
                System.out.print("x");
            }
            System.out.println(" ");
        }

        //for reverse pattern
        for(i=lines;i>=1;i--){
            for (j=1;j<=i;j++){
                System.out.print("x");
            }
            System.out.println(" ");
        }

    }
}