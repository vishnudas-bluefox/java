import java.util.Scanner; // import java Scanner library


class area{

    void Calcul(double r){
        double Area = 3.14*r*r;
        System.out.println("The area of circle is : " + Area);

    }

    void Calcul(float l,float b){
        float area = l*b;
        System.out.println("Area of rectangle is: "+area);

    }

    void Calcul(double b, double h){
        double area = .5*b*h;
        System.out.println("Area of triangle is: "+area);


    }
}
public class Find_area_of_shapes_method_overloading{

    public static void main(String argss[]){

        Scanner sc = new Scanner(System.in); //create scanner function
                                                                                    // reading data form thr user
        System.out.println("To find the area of circle \nEnter the radius: ");
        double radius = sc.nextDouble();

        System.out.println("To find the area of rectangle\nEnter the length: ");
        float length =sc.nextFloat();
        System.out.print("Enter the bredth");
        float bradth =sc.nextFloat();

        System.out.println("To find the area of triangle\nEnter length of base: ");
        double base =sc.nextDouble();
        System.out.println("Enter the length of height: ");
        double height =sc.nextDouble();

                                                                                    //sending data to functions 

        area a = new area();
        a.Calcul(radius);                                                           //Sending datas by method overloading
        a.Calcul(length, bradth);
        a.Calcul(base, height);



    }

}