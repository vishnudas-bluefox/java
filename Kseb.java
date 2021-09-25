import java.util.Scanner; //import scanner library

class kseb {
    int consumer_number;
    String consumer_name;
    float Unit;
    double charge = 0;

    double charge(){
        float temp = Unit;
        
                                // for first 100 units
        if(temp>=100){
            charge = charge + (100 * .60);
            temp = temp-100;
                                // for next 200 units
            if(temp>=200){
                charge += (200* .80);
                temp -= 200;

                                // Beyoond 300 units
                if(temp<0){
                        charge += (temp * .90);
                }
            }
                                // less than 200
            else{
                charge += (temp * .80 );
            }
        }
                                //less tha 100
        else {
            charge = charge+ (Unit * .60);

        }

                                // ensure users having minimum charge
        if (charge <50){
            charge =50;
            return charge;
        }

                                // ensure the user has 15% tax
        else if (charge > 300){

            charge += (charge * .15);
            return charge ;


        }
        return charge;
    }



    void display (){

        System.out.println("The charge consumed by th coustomer is : " + charge);

    }
}


public class Kseb{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);  //create scanner instance

        System.out.println("Enter the Credential \nConsumer name: ");
        String name = sc.nextLine();


        System.out.println("Consumer number: ");
        int con_num = sc.nextInt();


        System.out.println("Units consumed : ");
        Float Unit_consumed = sc.nextFloat();


        kseb k1 = new kseb();
        
        k1.consumer_name = name;
        k1.consumer_number = con_num;
        k1.Unit = Unit_consumed;

        k1.charge();
        k1.display();


    



    }

    
}