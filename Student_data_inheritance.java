import java.util.Scanner; //import scanner library
                            // an class for read the data of students 
class student {
    String name,gender;
    int roll;
    int mark1,mark2,mark3;
    void print(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Gender: "+gender);
    }
    
}

class markstudents extends student{             //extending the class because we have to add more data and functions
    void printdata(){
        int total =mark1+mark2+mark3;
        System.out.print("Marks\nMaths; " + mark1 +"\nChemistry: "+ mark2 +"\nComputer: "+mark3 + "\nTotal: " + total + "\nGrade: ");

        if(total >=90)
            System.out.print("A");
        else if(total >= 80 && total<90)
            System.out.print("B");
        else if(total >= 70 && total<80)
            System.out.print("C");
        else if(total >= 60 && total<70)
            System.out.print("D");
        else if(total >= 50 && total<60)
            System.out.print("E");
        else
            System.out.print("F");
    }
}

public class Student_data_inheritance {
    public static void main(String args[]){

        //create scanner function

        Scanner sc = new Scanner(System.in);

                                            // Read student details
        System.out.println("Enter the Student details\nName: ");
        String name =sc.nextLine();

        System.out.println("Enter the gender: ");
        String gender =sc.nextLine();

        System.out.println("Roll no: ");
        int roll = sc.nextInt();

        System.out.println("Mark1: ");
        int m1 = sc.nextInt();

        System.out.println("Mark2: ");
        int m2 = sc.nextInt();

        System.out.println("Mark3: ");
        int m3 = sc.nextInt();

        markstudents m = new markstudents();        //creating object and passing the data
        m.name=name;
        m.roll=roll;
        m.gender=gender;
        m.mark1=m1;
        m.mark2=m2;
        m.mark3=m3;

        m.print(); // print from p=super class
        m.printdata(); // print from extended


    }
    
}
