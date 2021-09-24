import java.util.Scanner; //import scanner function

public class array {
    public static void main(String[] args) {
        int array_size1,array_size2;

        Scanner sc = new Scanner(System.in); //create scan funtion

        

        //creation of first array


        System.out.print("Enter the size of the first array: ");
        array_size1 = sc.nextInt();
        
        int[] array1 = new int[10]; 
        System.out.println("Enter the elements of first array: ");  
        for(int i=0; i<array_size1; i++){    
        array1[i]=sc.nextInt();  
        }
       
        //creation of second array

        System.out.print("Enter the size of the second array: ");
        array_size2 = sc.nextInt();
        
        int[] array2 = new int[10]; 
        System.out.println("Enter the elements of second array: ");  
        for(int i=0; i<array_size2; i++){   
        array2[i]=sc.nextInt();  
        }


        //outer array creation

        int[] outer_array =new int[10];


        // first contition check
        int count=0;
        for (int i=0; i<array_size1; i++)   {  
            for (int j=0; j<array_size2; j++){
                if (array1[i] ==array2[j]){
                    outer_array[count] =array1[i];
                    count++;
                }

            }
        }

        //second contition check
        for (int i=0; i<array_size1; i++)   {  

            int square= array1[i] * array1[i];
            for (int j=0; j<array_size2; j++){
                if ( square ==array2[j]){
                    outer_array[count] =array1[i];
                    count++;
                }

            }
        }


        // Third contition check

        int digit1,digit2;
        for (int i=0; i<array_size1; i++)   {  
            digit1 =array1[i]%10;
            for (int j=0; j<array_size2; j++){
                digit2=array2[j]%10;
                if ( digit1 ==digit2){
                    outer_array[count] =array1[i];
                    count++;
                }

            }
        }
        
        // fourth condition
        int temp,product=1;
        for (int i=0; i<array_size1; i++)   {  
            temp =array1[i];
            while(temp<=0){
                product = product * (temp%10);
                System.out.println("The product inside is : "+ product);
                temp=temp/10;
            }
            System.out.println("The product is : "+ product);
            for (int j=0; j<array_size2; j++){
                if ( product ==array2[j]){
                    outer_array[count] =array1[i];
                    count++;
                }

            }
        }





        // printing the array elements

        System.out.println("The Outer Array elements are: ");  
        // accessing array elements using the for loop  
        for (int i=0; i<count; i++)   
        {  
        System.out.println(outer_array[i]);  
        } 

    }
}
