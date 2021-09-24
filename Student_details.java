import java.util.Scanner; // import scanner function 

class student {
    String name;
    int roll;
    int mark1,mark2,mark3;
    double aver;


    double average(){
        double aver = (mark1+mark2+mark3)/3;
        return aver; 
    }

    void display(){

        System.out.println("Student name : " + name);
        System.out.println("Roll no: " + roll);
        System.out.println("Average mark :" + aver);

    }

}

public class Student_details {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); //scanner function created

        // read data from the user
        System.out.println("Enter the Name: ");
        String name = sc.nextLine();
        System.out.println("Enter the roll no : ");
        int roll = sc.nextInt();
        System.out.println("Enter mark1 : ");
        int mark1 = sc.nextInt();
        System.out.println("Enter mark2 : ");
        int mark2 = sc.nextInt();
        System.out.println("Enter mark3 : ");
        int mark3 = sc.nextInt();

        // sahring data to external class

        student s1 =new student();
        s1.name =name;
        s1.roll = roll;
        s1.mark1 = mark1;
        s1.mark2 =mark2;
        s1.mark3 = mark3;

        // student function run

        double aver = s1.average();
        s1.aver =aver;
        s1.display();

        
    }
    
}
